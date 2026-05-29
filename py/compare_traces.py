import argparse
from dataclasses import dataclass
from pathlib import Path

import numpy as np
import pandas as pd


REQUIRED_COLUMNS = [
    "program_class",
    "generation_time_sec",
    "seed",
    "test_name",
    "coverage_vector",
]


@dataclass
class GroupResult:
    program_class: str
    generation_time_sec: int
    evosuite_tests: int
    randoop_tests: int
    mean_max_jaccard: float


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


def compute_group_similarity(
    program_class: str,
    generation_time_sec: int,
    evo: pd.DataFrame,
    ran: pd.DataFrame,
) -> GroupResult:
    vectors_evo = parse_vectors(evo["coverage_vector"]) if not evo.empty else []
    vectors_ran = parse_vectors(ran["coverage_vector"]) if not ran.empty else []

    mat_evo = stack_vectors(vectors_evo)
    mat_ran = stack_vectors(vectors_ran)

    cross = jaccard_cross(mat_evo, mat_ran)
    if mat_evo.shape[0] == 0:
        mean_max = float("nan")
    else:
        max_per_row = cross.max(axis=1) if mat_ran.shape[0] > 0 else np.zeros(mat_evo.shape[0])
        mean_max = float(np.mean(max_per_row))

    return GroupResult(
        program_class=program_class,
        generation_time_sec=int(generation_time_sec),
        evosuite_tests=int(mat_evo.shape[0]),
        randoop_tests=int(mat_ran.shape[0]),
        mean_max_jaccard=mean_max,
    )


def validate_columns(df: pd.DataFrame, source: str) -> None:
    missing = [c for c in REQUIRED_COLUMNS if c not in df.columns]
    if missing:
        raise ValueError(f"{source} missing columns: {missing}")


def main() -> None:
    parser = argparse.ArgumentParser(description="Compare EvoSuite and Randoop spectra via Jaccard.")
    parser.add_argument("--evosuite", required=True, help="Path to evosuite_all_traces.csv")
    parser.add_argument("--randoop", required=True, help="Path to randoop_all_traces.csv")
    parser.add_argument("--out", required=True, help="Output CSV path")
    args = parser.parse_args()

    evo_path = Path(args.evosuite)
    ran_path = Path(args.randoop)

    evo = pd.read_csv(evo_path)
    ran = pd.read_csv(ran_path)

    validate_columns(evo, "EvoSuite")
    validate_columns(ran, "Randoop")

    keys = ["program_class", "generation_time_sec"]
    results: list[GroupResult] = []

    evo_keys = {tuple(row) for row in evo[keys].drop_duplicates().itertuples(index=False, name=None)}
    ran_keys = {tuple(row) for row in ran[keys].drop_duplicates().itertuples(index=False, name=None)}

    for (program_class, generation_time) in sorted(evo_keys | ran_keys):
        evo_group = evo[(evo["program_class"] == program_class) & (evo["generation_time_sec"] == generation_time)]
        ran_group = ran[(ran["program_class"] == program_class) & (ran["generation_time_sec"] == generation_time)]
        if evo_group.empty and ran_group.empty:
            continue
        results.append(compute_group_similarity(program_class, generation_time, evo_group, ran_group))

    out_df = pd.DataFrame([r.__dict__ for r in results])
    out_df = out_df.sort_values(["program_class", "generation_time_sec"])
    out_path = Path(args.out)
    out_path.parent.mkdir(parents=True, exist_ok=True)
    out_df.to_csv(out_path, index=False)


if __name__ == "__main__":
    main()
