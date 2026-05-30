import argparse
import csv
import os
import re
import shutil
import subprocess
import math
from dataclasses import dataclass
from pathlib import Path
from statistics import stdev, variance
from concurrent.futures import ThreadPoolExecutor, as_completed

import numpy as np
import pandas as pd


def _sanitize_token(value: str) -> str:
    return re.sub(r"[^A-Za-z0-9._-]+", "", value)


def _format_filter(label: str, values: list | None) -> str:
    if not values:
        return f"{label}-all"
    joined = "-".join(_sanitize_token(str(v)) for v in values)
    return f"{label}-{joined}"


def _safe_token(value: str) -> str:
    return re.sub(r"[^A-Za-z0-9._-]+", "_", value)


REQUIRED_COLUMNS = [
    "program_class",
    "generation_time_sec",
    "seed",
    "test_name",
    "coverage_vector",
]

OPTIONAL_COLUMNS = ["run"]


@dataclass
class GroupResult:
    program_class: str
    generation_time_sec: int
    run: int
    evosuite_tests: int
    randoop_tests: int
    mean_max_jaccard: float
    mean_max_dice: float


@dataclass
class AggregateResult:
    program_class: str
    generation_time_sec: int
    runs: int
    mean_max_jaccard: float
    variance: float | None
    stddev: float | None
    ci_lower: float | None
    ci_upper: float | None
    mean_max_dice: float
    variance_dice: float | None
    stddev_dice: float | None
    ci_lower_dice: float | None
    ci_upper_dice: float | None


@dataclass
class ExclusiveResult:
    program_class: str
    generation_time_sec: int
    run: int
    total_lines: int
    covered_by_any: int
    shared_lines: int
    evosuite_exclusive: int
    randoop_exclusive: int


def split_csv_arg(value: str | None) -> list[str] | None:
    if value is None:
        return None
    items = [item.strip() for item in value.split(",") if item.strip()]
    return items if items else None


def run_cmd(cmd: list[str], cwd: Path | None = None) -> str:
    result = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True)
    if result.returncode != 0:
        raise RuntimeError("Command failed: " + " ".join(cmd) + "\n" + result.stderr)
    return result.stdout.strip()


def ensure_main_classes(gradle_cmd: str, repo: Path) -> None:
    run_cmd([gradle_cmd, "-q", "classes"], cwd=repo)


def prepare_working_test_dir(tool: str, source_dir: Path, work_dir: Path) -> None:
    if work_dir.exists():
        shutil.rmtree(work_dir)
    shutil.copytree(source_dir, work_dir)

    if tool != "EvoSuite":
        return

    for java_file in work_dir.rglob("*.java"):
        if java_file.name.endswith("_ESTest_scaffolding.java"):
            java_file.unlink(missing_ok=True)
            continue
        if java_file.name.endswith("_ESTest.java"):
            content = java_file.read_text(encoding="utf-8")
            content = re.sub(r"import org\.evosuite\.runtime\.EvoRunner;\r?\n", "", content)
            content = re.sub(r"import org\.evosuite\.runtime\.EvoRunnerParameters;\r?\n", "", content)
            content = re.sub(r"import org\.junit\.runner\.RunWith;\r?\n", "", content)
            content = re.sub(r"@RunWith\(EvoRunner\.class\)\s*@EvoRunnerParameters\([^\)]*\)\s*", "", content)
            content = re.sub(r"extends\s+[A-Za-z0-9_]+_ESTest_scaffolding\s*\{", "{", content)
            java_file.write_text(content, encoding="utf-8", newline="\n")


def get_test_class_fqns(source_dir: Path) -> list[str]:
    classes: set[str] = set()
    for java_file in source_dir.rglob("*.java"):
        content = java_file.read_text(encoding="utf-8")
        package_match = re.search(r"package\s+([A-Za-z0-9_\.]+)\s*;", content)
        class_match = re.search(r"\bclass\s+([A-Za-z0-9_]+)\b", content)
        if not class_match:
            continue
        package = package_match.group(1) if package_match else ""
        class_name = class_match.group(1)
        fqcn = f"{package}.{class_name}" if package else class_name
        classes.add(fqcn)
    return sorted(classes)


def get_test_methods(java_exe: str, classpath: str, test_class: str) -> list[str]:
    output = run_cmd([java_exe, "-cp", classpath, "com.viktor.lab4.trace.TestLister", "--testClass", test_class])
    lines = [line.strip() for line in output.splitlines() if line.strip()]
    return lines


def parse_vectors(series: pd.Series) -> list[np.ndarray]:
    vectors: list[np.ndarray] = []
    for value in series.fillna(""):
        raw = str(value).strip().strip('"')
        if not raw:
            vectors.append(np.array([], dtype=np.int8))
            continue
        vec = np.fromstring(raw, sep=",", dtype=np.int8)
        vectors.append(vec)
    return vectors


def stack_vectors(vectors: list[np.ndarray]) -> np.ndarray:
    if not vectors:
        return np.zeros((0, 0), dtype=np.int8)
    lengths = {v.size for v in vectors}
    if len(lengths) != 1:
        raise ValueError(f"Inconsistent vector lengths in group: {sorted(lengths)}")
    if 0 in lengths:
        return np.zeros((len(vectors), 0), dtype=np.int8)
    return np.vstack(vectors).astype(np.int8)


def jaccard_cross(a: np.ndarray, b: np.ndarray) -> np.ndarray:
    if a.size == 0 or b.size == 0:
        return np.zeros((a.shape[0], b.shape[0]), dtype=float)
    a_bin = a.astype(bool).astype(np.int8)
    b_bin = b.astype(bool).astype(np.int8)
    intersection = a_bin @ b_bin.T
    sum_a = a_bin.sum(axis=1, keepdims=True)
    sum_b = b_bin.sum(axis=1, keepdims=True).T
    union = sum_a + sum_b - intersection
    with np.errstate(divide="ignore", invalid="ignore"):
        return np.where(union == 0, 0.0, intersection / union)


def dice_cross(a: np.ndarray, b: np.ndarray) -> np.ndarray:
    if a.size == 0 or b.size == 0:
        return np.zeros((a.shape[0], b.shape[0]), dtype=float)
    a_bin = a.astype(bool).astype(np.int8)
    b_bin = b.astype(bool).astype(np.int8)
    intersection = a_bin @ b_bin.T
    sum_a = a_bin.sum(axis=1, keepdims=True)
    sum_b = b_bin.sum(axis=1, keepdims=True).T
    denom = sum_a + sum_b
    with np.errstate(divide="ignore", invalid="ignore"):
        return np.where(denom == 0, 0.0, (2 * intersection) / denom)


def build_group_matrices(evo: pd.DataFrame, ran: pd.DataFrame) -> tuple[np.ndarray, np.ndarray]:
    vectors_evo = parse_vectors(evo["coverage_vector"]) if not evo.empty else []
    vectors_ran = parse_vectors(ran["coverage_vector"]) if not ran.empty else []
    return stack_vectors(vectors_evo), stack_vectors(vectors_ran)


def compute_group_similarity(
    program_class: str,
    generation_time_sec: int,
    run_id: int,
    mat_evo: np.ndarray,
    mat_ran: np.ndarray,
) -> GroupResult:
    if mat_evo.shape[0] == 0:
        mean_max_jaccard = float("nan")
        mean_max_dice = float("nan")
    else:
        if mat_ran.shape[0] == 0:
            max_per_row_j = np.zeros(mat_evo.shape[0])
            max_per_row_d = np.zeros(mat_evo.shape[0])
        else:
            jaccard = jaccard_cross(mat_evo, mat_ran)
            dice = dice_cross(mat_evo, mat_ran)
            max_per_row_j = jaccard.max(axis=1)
            max_per_row_d = dice.max(axis=1)
        mean_max_jaccard = float(np.mean(max_per_row_j))
        mean_max_dice = float(np.mean(max_per_row_d))

    return GroupResult(
        program_class=program_class,
        generation_time_sec=int(generation_time_sec),
        run=int(run_id),
        evosuite_tests=int(mat_evo.shape[0]),
        randoop_tests=int(mat_ran.shape[0]),
        mean_max_jaccard=mean_max_jaccard,
        mean_max_dice=mean_max_dice,
    )


def compute_exclusive_lines(
    program_class: str,
    generation_time_sec: int,
    run_id: int,
    mat_evo: np.ndarray,
    mat_ran: np.ndarray,
) -> ExclusiveResult:
    total_lines = int(mat_evo.shape[1] if mat_evo.size else mat_ran.shape[1])
    if mat_evo.size == 0:
        evo_union = np.zeros(total_lines, dtype=np.int8)
    else:
        evo_union = (mat_evo.astype(bool).any(axis=0)).astype(np.int8)

    if mat_ran.size == 0:
        ran_union = np.zeros(total_lines, dtype=np.int8)
    else:
        ran_union = (mat_ran.astype(bool).any(axis=0)).astype(np.int8)

    shared = int(np.logical_and(evo_union == 1, ran_union == 1).sum())
    evo_excl = int(np.logical_and(evo_union == 1, ran_union == 0).sum())
    ran_excl = int(np.logical_and(evo_union == 0, ran_union == 1).sum())
    covered_any = int((evo_union | ran_union).sum())

    return ExclusiveResult(
        program_class=program_class,
        generation_time_sec=int(generation_time_sec),
        run=int(run_id),
        total_lines=total_lines,
        covered_by_any=covered_any,
        shared_lines=shared,
        evosuite_exclusive=evo_excl,
        randoop_exclusive=ran_excl,
    )


def validate_columns(df: pd.DataFrame, source: str) -> None:
    missing = [c for c in REQUIRED_COLUMNS if c not in df.columns]
    if missing:
        raise ValueError(f"{source} missing columns: {missing}")


def run_trace_method(
    java_exe: str,
    classpath: str,
    jacoco_agent: str,
    target_class: str,
    test_class: str,
    test_method: str,
    destfile: Path,
) -> str | None:
    jacoco_args = (
        f"destfile={destfile},append=false,dumponexit=false,includes={target_class.replace('.', '/') + '*'}"
    )
    result = subprocess.run(
        [
            java_exe,
            f"-javaagent:{jacoco_agent}={jacoco_args}",
            "-cp",
            classpath + f"{os.pathsep}{jacoco_agent}",
            "com.viktor.lab4.trace.TraceCollector",
            "--targetClass",
            target_class,
            "--testClass",
            test_class,
            "--testMethod",
            test_method,
        ],
        capture_output=True,
        text=True,
    )
    if result.returncode != 0:
        return None
    vector_line = result.stdout.splitlines()[-1].strip() if result.stdout else ""
    return vector_line or None


def collect_traces(
    repo: Path,
    generated_root: Path,
    traces_dir: Path,
    tools: list[str],
    classes: list[str] | None,
    times: list[int] | None,
    runs: list[int] | None,
    gradle_cmd: str,
    java_exe: str,
    collect_workers: int,
) -> None:
    ensure_main_classes(gradle_cmd, repo)
    traces_dir.mkdir(parents=True, exist_ok=True)

    for tool in tools:
        print(f"[collect] tool={tool}")
        tool_file = "evosuite_all_traces.csv" if tool == "EvoSuite" else "randoop_all_traces.csv"
        out_csv = traces_dir / tool_file
        file_exists = out_csv.exists()
        header = REQUIRED_COLUMNS + ["run"]

        if file_exists:
            with out_csv.open("r", encoding="utf-8", newline="") as reader:
                existing_header = next(csv.reader(reader), [])
            if "run" not in existing_header:
                raise RuntimeError(
                    f"Trace file missing 'run' column: {out_csv}. "
                    "Delete the file or use a new traces directory."
                )

        with out_csv.open("a", encoding="utf-8", newline="") as handle:
            writer = csv.writer(handle)
            if not file_exists:
                writer.writerow(header)

            tool_dir = generated_root / tool
            if not tool_dir.exists():
                print(f"[collect] skip missing tool dir: {tool_dir}")
                continue

            for class_dir in tool_dir.iterdir():
                if not class_dir.is_dir():
                    continue
                class_simple = class_dir.name
                if classes and class_simple not in classes:
                    continue
                target_class = f"com.viktor.lab4.{class_simple}"

                for budget_dir in class_dir.iterdir():
                    if not budget_dir.is_dir():
                        continue
                    try:
                        budget = int(budget_dir.name)
                    except ValueError:
                        continue
                    if times and budget not in times:
                        continue

                    for run_dir in budget_dir.iterdir():
                        if not run_dir.is_dir():
                            continue
                        match = re.match(r"^run(?P<run>\d+)-seed(?P<seed>\d+)$", run_dir.name)
                        if not match:
                            continue
                        run_id = int(match.group("run"))
                        seed = int(match.group("seed"))
                        if runs and run_id not in runs:
                            continue

                        java_files = list(run_dir.rglob("*.java"))
                        if not java_files:
                            continue

                        print(
                            f"[collect] class={class_simple} time={budget} "
                            f"run={run_id} seed={seed} tests={len(java_files)}"
                        )

                        work_dir = repo / "build" / "analysis-work" / tool / class_simple / str(budget) / run_dir.name
                        prepare_working_test_dir(tool, run_dir, work_dir)

                        run_cmd(
                            [
                                gradle_cmd,
                                "--no-daemon",
                                "cleanGeneratedAnalysis",
                                "generatedTestClasses",
                                f"-PgeneratedTestsDir={work_dir}",
                            ],
                            cwd=repo,
                        )

                        classpath = run_cmd(
                            [gradle_cmd, "-q", "printGeneratedTestClasspath", f"-PgeneratedTestsDir={work_dir}"],
                            cwd=repo,
                        )
                        jacoco_agent = run_cmd([gradle_cmd, "-q", "printJacocoAgentPath"], cwd=repo)

                        # Use per-method trace exec to avoid collisions under parallel execution.
                        trace_tmp = work_dir / "_trace_tmp"
                        trace_tmp.mkdir(parents=True, exist_ok=True)

                        tasks: list[tuple[str, str, Path]] = []
                        for test_class in get_test_class_fqns(work_dir):
                            methods = get_test_methods(java_exe, classpath + f"{os.pathsep}{jacoco_agent}", test_class)
                            for method in methods:
                                token = _safe_token(f"{test_class}__{method}")
                                destfile = trace_tmp / f"trace_{token}.exec"
                                tasks.append((test_class, method, destfile))

                        if not tasks:
                            continue

                        with ThreadPoolExecutor(max_workers=max(1, collect_workers)) as executor:
                            futures = {
                                executor.submit(
                                    run_trace_method,
                                    java_exe,
                                    classpath,
                                    jacoco_agent,
                                    target_class,
                                    test_class,
                                    method,
                                    destfile,
                                ): (test_class, method)
                                for (test_class, method, destfile) in tasks
                            }
                            for future in as_completed(futures):
                                test_class, method = futures[future]
                                vector_line = future.result()
                                if not vector_line:
                                    continue
                                writer.writerow(
                                    [
                                        class_simple,
                                        budget,
                                        seed,
                                        f"{test_class}#{method}",
                                        vector_line,
                                        run_id,
                                    ]
                                )


def compare_traces(
    traces_dir: Path,
    classes: list[str] | None,
    times: list[int] | None,
) -> tuple[pd.DataFrame, pd.DataFrame, pd.DataFrame]:
    evo_path = traces_dir / "evosuite_all_traces.csv"
    ran_path = traces_dir / "randoop_all_traces.csv"
    evo = pd.read_csv(evo_path)
    ran = pd.read_csv(ran_path)

    validate_columns(evo, "EvoSuite")
    validate_columns(ran, "Randoop")

    run_col = "run"
    if run_col not in evo.columns or run_col not in ran.columns:
        print("[compare] missing 'run' column, using seed as run key")
        run_col = "seed"

    if classes:
        evo = evo[evo["program_class"].isin(classes)]
        ran = ran[ran["program_class"].isin(classes)]
    if times:
        evo = evo[evo["generation_time_sec"].isin(times)]
        ran = ran[ran["generation_time_sec"].isin(times)]

    print(f"[compare] evo_rows={len(evo)} randoop_rows={len(ran)}")

    keys = ["program_class", "generation_time_sec", run_col]
    results: list[GroupResult] = []
    exclusive_records: list[ExclusiveResult] = []

    evo_keys = {tuple(row) for row in evo[keys].drop_duplicates().itertuples(index=False, name=None)}
    ran_keys = {tuple(row) for row in ran[keys].drop_duplicates().itertuples(index=False, name=None)}

    for (program_class, generation_time, run_id) in sorted(evo_keys | ran_keys):
        evo_group = evo[
            (evo["program_class"] == program_class)
            & (evo["generation_time_sec"] == generation_time)
            & (evo[run_col] == run_id)
        ]
        ran_group = ran[
            (ran["program_class"] == program_class)
            & (ran["generation_time_sec"] == generation_time)
            & (ran[run_col] == run_id)
        ]
        if evo_group.empty and ran_group.empty:
            continue
        print(
            f"[compare] class={program_class} time={generation_time} "
            f"run={run_id} evo={len(evo_group)} ran={len(ran_group)}"
        )
        mat_evo, mat_ran = build_group_matrices(evo_group, ran_group)
        results.append(compute_group_similarity(program_class, generation_time, run_id, mat_evo, mat_ran))
        exclusive_records.append(compute_exclusive_lines(program_class, generation_time, run_id, mat_evo, mat_ran))

    detail_df = pd.DataFrame([r.__dict__ for r in results]).sort_values(
        ["program_class", "generation_time_sec", "run"]
    )

    exclusive_df = pd.DataFrame([r.__dict__ for r in exclusive_records]).sort_values(
        ["program_class", "generation_time_sec", "run"]
    )

    agg_records: list[AggregateResult] = []
    for (program_class, generation_time), group in detail_df.groupby(["program_class", "generation_time_sec"]):
        values = group["mean_max_jaccard"].tolist()
        dice_values = group["mean_max_dice"].tolist()
        stats = calc_confidence_interval(values)
        dice_stats = calc_confidence_interval(dice_values)
        agg_records.append(
            AggregateResult(
                program_class=program_class,
                generation_time_sec=int(generation_time),
                runs=len(values),
                mean_max_jaccard=stats["mean"],
                variance=stats["variance"],
                stddev=stats["stddev"],
                ci_lower=stats["ci_lower"],
                ci_upper=stats["ci_upper"],
                mean_max_dice=dice_stats["mean"],
                variance_dice=dice_stats["variance"],
                stddev_dice=dice_stats["stddev"],
                ci_lower_dice=dice_stats["ci_lower"],
                ci_upper_dice=dice_stats["ci_upper"],
            )
        )

    agg_df = pd.DataFrame([r.__dict__ for r in agg_records]).sort_values(["program_class", "generation_time_sec"])
    return detail_df, agg_df, exclusive_df


def calc_confidence_interval(values: list[float], confidence: float = 0.95) -> dict[str, float | None]:
    if not values or len(values) < 2:
        return {
            "mean": round(values[0], 6) if values else 0.0,
            "variance": None,
            "stddev": None,
            "ci_lower": None,
            "ci_upper": None,
        }

    mean = sum(values) / len(values)
    var = variance(values)
    std = stdev(values)
    n = len(values)
    df = n - 1

    t_values = {
        1: 12.706, 2: 4.303, 3: 3.182, 4: 2.776, 5: 2.571, 6: 2.447, 7: 2.365,
        8: 2.306, 9: 2.262, 10: 2.228, 15: 2.131, 20: 2.086, 25: 2.060, 30: 2.042,
    }

    if df in t_values:
        t_val = t_values[df]
    elif df > 30:
        t_val = 1.96
    else:
        lower_df = max([k for k in t_values.keys() if k < df])
        upper_df = min([k for k in t_values.keys() if k > df])
        t_val = t_values[lower_df] + (df - lower_df) * (t_values[upper_df] - t_values[lower_df]) / (upper_df - lower_df)

    margin_error = t_val * (std / math.sqrt(n))

    return {
        "mean": round(mean, 6),
        "variance": round(var, 6),
        "stddev": round(std, 6),
        "ci_lower": round(mean - margin_error, 6),
        "ci_upper": round(mean + margin_error, 6),
    }


def main() -> None:
    parser = argparse.ArgumentParser(description="Collect per-test spectra and compare EvoSuite vs Randoop.")
    parser.add_argument("--project-root", default=None, help="Repo root; defaults to parent of this script.")
    parser.add_argument("--generated-tests", default="generated-tests", help="Root with generated tests.")
    parser.add_argument("--traces-dir", default="reports/traces", help="Directory to store trace CSVs.")
    parser.add_argument("--out", default="reports/trace_similarity.csv", help="Output CSV path.")
    parser.add_argument("--tools", default="EvoSuite,Randoop", help="Comma-separated tools.")
    parser.add_argument("--classes", default=None, help="Comma-separated class names.")
    parser.add_argument("--times", default=None, help="Comma-separated budgets in seconds.")
    parser.add_argument("--runs", default=None, help="Comma-separated run indices.")
    parser.add_argument("--gradle", default=".\\gradlew.bat", help="Gradle wrapper path.")
    parser.add_argument("--java", default="java", help="Java executable.")
    parser.add_argument("--skip-collect", action="store_true", help="Skip collection; use existing traces.")
    parser.add_argument(
        "--collect-workers",
        type=int,
        default=os.cpu_count() or 2,
        help="Parallel workers for collect stage.",
    )
    args = parser.parse_args()

    repo = Path(args.project_root).resolve() if args.project_root else Path(__file__).resolve().parents[1]
    generated_root = repo / args.generated_tests
    traces_dir = repo / args.traces_dir
    out_path = repo / args.out

    gradle_path = Path(args.gradle)
    if not gradle_path.is_absolute():
        gradle_path = (repo / gradle_path).resolve()

    tools = split_csv_arg(args.tools) or []
    classes = split_csv_arg(args.classes)
    times = [int(x) for x in split_csv_arg(args.times) or []] or None
    runs = [int(x) for x in split_csv_arg(args.runs) or []] or None

    out_path = out_path.with_name(
        out_path.stem
        + "__"
        + "__".join(
            [
                _format_filter("tools", tools),
                _format_filter("classes", classes),
                _format_filter("times", times),
                _format_filter("runs", runs),
            ]
        )
        + out_path.suffix
    )

    if "EvoSuite" not in tools or "Randoop" not in tools:
        raise ValueError("Both EvoSuite and Randoop are required for comparison.")

    if not args.skip_collect:
        collect_traces(
            repo=repo,
            generated_root=generated_root,
            traces_dir=traces_dir,
            tools=tools,
            classes=classes,
            times=times,
            runs=runs,
            gradle_cmd=str(gradle_path),
            java_exe=args.java,
            collect_workers=args.collect_workers,
        )

    result, aggregated, exclusive = compare_traces(traces_dir, classes, times)
    out_path.parent.mkdir(parents=True, exist_ok=True)
    result.to_csv(out_path, index=False)

    agg_path = out_path.with_name(out_path.stem + "_aggregated" + out_path.suffix)
    aggregated.to_csv(agg_path, index=False)

    excl_path = out_path.with_name(out_path.stem + "_exclusive" + out_path.suffix)
    exclusive.to_csv(excl_path, index=False)


if __name__ == "__main__":
    main()

