#!/usr/bin/env python3
"""
Quality analysis script for generated tests.
Executes JaCoCo and PIT mutation testing analysis.

OPTIMIZATIONS:
- Parallel gradle execution: Uses ThreadPoolExecutor to run multiple gradle analysis jobs concurrently
  (default 2 workers to avoid system overload). Adjust with --max-workers if needed.
- Working directories are prepared sequentially before parallel execution to avoid filesystem conflicts
- Gradle output is captured instead of printed to speed up execution
- Results are collected and aggregated after all parallel tasks complete

STATISTICS IN AGGREGATED REPORT:
- For each key metric (tests executed, line/branch/mutation coverage):
  * Mean value (sample average)
  * Variance (measure of spread)
  * Standard deviation (sqrt of variance)
  * 95% Confidence Interval (CI_lower, CI_upper) using t-distribution for small samples (n<30)
- CI calculation: mean ± t_α/2 * (stddev / sqrt(n)) where t_α/2 from Student's t-distribution
"""

import argparse
import csv
import os
import re
import shutil
import subprocess
import sys
import xml.etree.ElementTree as ET
from concurrent.futures import ThreadPoolExecutor, as_completed
from datetime import datetime
from pathlib import Path
from typing import Optional, Dict
from statistics import stdev, variance
import math


def _sanitize_token(value: str) -> str:
    return re.sub(r"[^A-Za-z0-9._-]+", "", value)


def _format_filter(label: str, values: list | None) -> str:
    if not values:
        return f"{label}-all"
    joined = "-".join(_sanitize_token(str(v)) for v in values)
    return f"{label}-{joined}"


def parse_generation_summary(summary_path: str) -> Dict[str, Optional[float]]:
    """Parse generation summary CSV and extract elapsed times."""
    gen_map = {}
    if not Path(summary_path).exists():
        return gen_map

    try:
        with open(summary_path, 'r', encoding='utf-8') as f:
            reader = csv.DictReader(f)
            for row in reader:
                if row.get('status') != 'OK':
                    continue
                class_simple = row.get('targetClass', '').split('.')[-1]
                key = "{0}|{1}|{2}|{3}".format(
                    row.get('tool', ''),
                    class_simple,
                    row.get('budgetSec', ''),
                    row.get('run', '')
                )
                elapsed = None
                if row.get('elapsedSec'):
                    try:
                        elapsed = float(row.get('elapsedSec').replace(',', '.'))
                    except (ValueError, AttributeError):
                        pass
                gen_map[key] = elapsed
    except Exception:
        pass

    return gen_map


def get_jacoco_metrics(xml_path: str, target_class_fqn: str) -> Dict[str, Optional[float]]:
    """Extract JaCoCo code coverage metrics from XML report."""
    default_result = {'linePct': None, 'branchPct': None, 'instPct': None}

    if not Path(xml_path).exists():
        return default_result

    try:
        tree = ET.parse(xml_path)
        root = tree.getroot()

        target_name = target_class_fqn.replace('.', '/')

        for pkg in root.findall('.//package'):
            for class_elem in pkg.findall('class'):
                if class_elem.get('name') == target_name:
                    line_pct = None
                    branch_pct = None
                    inst_pct = None

                    for counter in class_elem.findall('counter'):
                        counter_type = counter.get('type')
                        missed = int(counter.get('missed', '0'))
                        covered = int(counter.get('covered', '0'))

                        if counter_type == 'LINE' and (missed + covered) > 0:
                            line_pct = round(100.0 * covered / (covered + missed), 2)
                        elif counter_type == 'BRANCH' and (missed + covered) > 0:
                            branch_pct = round(100.0 * covered / (covered + missed), 2)
                        elif counter_type == 'INSTRUCTION' and (missed + covered) > 0:
                            inst_pct = round(100.0 * covered / (covered + missed), 2)

                    return {
                        'linePct': line_pct,
                        'branchPct': branch_pct,
                        'instPct': inst_pct
                    }
    except Exception:
        pass

    return default_result


def get_pit_metrics(xml_path: str) -> Dict:
    """Extract PIT mutation testing metrics from XML report."""
    default_result = {
        'mutationPct': None,
        'total': 0,
        'killed': 0,
        'survived': 0,
        'timedOut': 0,
        'noCoverage': 0
    }

    if not Path(xml_path).exists():
        return default_result

    try:
        tree = ET.parse(xml_path)
        root = tree.getroot()

        mutations = root.findall('.//mutation')
        if not mutations:
            return {
                'mutationPct': 0.0,
                'total': 0,
                'killed': 0,
                'survived': 0,
                'timedOut': 0,
                'noCoverage': 0
            }

        killed = sum(1 for m in mutations if m.get('detected') == 'true')
        survived = sum(1 for m in mutations if m.get('status') == 'SURVIVED')
        timed_out = sum(1 for m in mutations if m.get('status') == 'TIMED_OUT')
        no_coverage = sum(1 for m in mutations if m.get('status') == 'NO_COVERAGE')
        total = len(mutations)

        mutation_pct = round(100.0 * killed / total, 2) if total > 0 else 0.0

        return {
            'mutationPct': mutation_pct,
            'total': total,
            'killed': killed,
            'survived': survived,
            'timedOut': timed_out,
            'noCoverage': no_coverage
        }
    except Exception:
        pass

    return default_result


def get_test_counts(results_dir: str) -> Dict[str, int]:
    """Extract test execution counts from JUnit results directory."""
    default_result = {'tests': 0, 'failures': 0, 'skipped': 0}

    if not Path(results_dir).exists():
        return default_result

    tests_count = 0
    failures_count = 0
    skipped_count = 0

    for xml_file in Path(results_dir).glob("TEST-*.xml"):
        try:
            tree = ET.parse(xml_file)
            root = tree.getroot()

            if root.tag == 'testsuite':
                tests_count += int(root.get('tests', '0'))
                failures_count += int(root.get('failures', '0')) + int(root.get('errors', '0'))
                skipped_count += int(root.get('skipped', '0'))
        except Exception:
            pass

    return {
        'tests': tests_count,
        'failures': failures_count,
        'skipped': skipped_count
    }


def prepare_working_test_dir(tool: str, source_dir: str, work_dir: str) -> None:
    """Prepare working directory with test sources, apply tool-specific transformations."""
    if Path(work_dir).exists():
        shutil.rmtree(work_dir)
    Path(work_dir).mkdir(parents=True, exist_ok=True)

    source_path = Path(source_dir)
    work_path = Path(work_dir)

    for java_file in source_path.glob("**/*.java"):
        relative = java_file.relative_to(source_path)
        dest = work_path / relative
        dest.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(java_file, dest)

    if tool == "EvoSuite":
        for java_file in work_path.glob("**/*.java"):
            if java_file.name.endswith("_ESTest_scaffolding.java"):
                java_file.unlink()
                continue

            if java_file.name.endswith("_ESTest.java"):
                content = java_file.read_text()
                content = re.sub(r'import org\.evosuite\.runtime\.EvoRunner;\r?\n', '', content)
                content = re.sub(r'import org\.evosuite\.runtime\.EvoRunnerParameters;\r?\n', '', content)
                content = re.sub(r'import org\.junit\.runner\.RunWith;\r?\n', '', content)
                content = re.sub(r'@RunWith\(EvoRunner\.class\)\s*@EvoRunnerParameters\([^\)]*\)\s*', '', content)
                content = re.sub(r'extends\s+[A-Za-z0-9_]+_ESTest_scaffolding\s*\{', '{', content)
                java_file.write_text(content)


def execute_gradle_analysis(params: Dict) -> Dict:
    """Execute gradle analysis for one test run (for parallel execution)."""
    repo = params['repo']
    gradle_cmd = params['gradle_cmd']
    work_dir = params['work_dir']
    target_class = params['target_class']
    pit_tests_pattern = params['pit_tests_pattern']

    cmd_args = [
        "--no-daemon",
        "cleanGeneratedAnalysis",
        "generatedTest",
        "jacocoGeneratedTestReport",
        "pitest",
        f"-PgeneratedTestsDir={work_dir}",
        f"-PpitTargetClass={target_class}",
        f"-PpitTargetTests={pit_tests_pattern}"
    ]

    status = "OK"
    error_text = ""
    started = datetime.now()

    try:
        result = subprocess.run(
            [gradle_cmd] + cmd_args,
            check=False,
            capture_output=True,
            text=True,
            timeout=600
        )
        if result.returncode != 0 and result.returncode != 1:
            status = "FAILED"
            error_text = f"Gradle exit code: {result.returncode}"
    except subprocess.TimeoutExpired:
        status = "FAILED"
        error_text = "Gradle execution timed out"
    except Exception as e:
        status = "FAILED"
        error_text = str(e)

    elapsed_analysis = round((datetime.now() - started).total_seconds(), 3)

    # Collect metrics after gradle execution
    jacoco_xml = os.path.join(repo, "build/reports/jacoco/generated/jacocoGeneratedTestReport.xml")
    pit_xml = os.path.join(repo, "build/reports/pitest/generated/mutations.xml")
    test_results_dir = os.path.join(repo, "build/test-results/generatedTest")

    coverage = get_jacoco_metrics(jacoco_xml, target_class)
    pit = get_pit_metrics(pit_xml)
    tests = get_test_counts(test_results_dir)

    return {
        'status': status,
        'error_text': error_text,
        'elapsed_analysis': elapsed_analysis,
        'coverage': coverage,
        'pit': pit,
        'tests': tests
    }


def calc_confidence_interval(values: list, confidence: float = 0.95) -> Dict:
    """Calculate mean, variance, std dev and 95% confidence interval for a list of values.
    
    Uses Student's t-distribution for CI calculation (appropriate for small samples).
    CI is calculated as: mean ± t_α/2,n-1 * (std / sqrt(n))
    Returns None values if sample has less than 2 points.
    """
    if not values or len(values) < 2:
        return {'mean': 0.0, 'variance': None, 'stddev': None, 'ci_lower': None, 'ci_upper': None}
    
    mean = sum(values) / len(values)
    var = variance(values)
    std = stdev(values)
    
    n = len(values)
    # Simplified t-value for 95% CI: approximate using Welch-Satterthwaite approach
    # For df=n-1, use approximation: t ≈ 2 + 1/df (simplified, works for df > 1)
    df = n - 1
    alpha = 1 - confidence
    
    # Use approximation of t-quantile: t_crit ≈ sqrt(f(1-alpha/2)*df/(1-alpha/2)) 
    # For 0.975 quantile with small df, use pre-calculated values
    t_values = {
        1: 12.706, 2: 4.303, 3: 3.182, 4: 2.776, 5: 2.571, 6: 2.447, 7: 2.365,
        8: 2.306, 9: 2.262, 10: 2.228, 15: 2.131, 20: 2.086, 25: 2.060, 30: 2.042
    }
    
    if df in t_values:
        t_val = t_values[df]
    elif df > 30:
        t_val = 1.96  # z-score for normal distribution at 0.975
    else:
        # Linear interpolation for values between those in table
        lower_df = max([k for k in t_values.keys() if k < df])
        upper_df = min([k for k in t_values.keys() if k > df])
        t_val = t_values[lower_df] + (df - lower_df) * (t_values[upper_df] - t_values[lower_df]) / (upper_df - lower_df)
    
    margin_error = t_val * (std / math.sqrt(n))
    
    return {
        'mean': round(mean, 2),
        'variance': round(var, 4),
        'stddev': round(std, 2),
        'ci_lower': round(mean - margin_error, 2),
        'ci_upper': round(mean + margin_error, 2)
    }


def build_output_paths(reports_dir: str, args: argparse.Namespace) -> tuple[str, str]:
    parts = [
        _format_filter("tools", args.tools),
        _format_filter("cases", args.cases),
        _format_filter("budgets", args.budgets),
        _format_filter("runs", args.runs),
    ]
    if args.skip_execution:
        parts.append("skip-exec")
    suffix = "__" + "__".join(parts)
    summary_csv = os.path.join(reports_dir, f"summary-quality{suffix}.csv")
    agg_csv = os.path.join(reports_dir, f"summary-quality-aggregated{suffix}.csv")
    return summary_csv, agg_csv


def main():
    parser = argparse.ArgumentParser(
        description='Analyze quality of generated tests using JaCoCo and PIT',
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )
    parser.add_argument(
        '--project-root',
        default=os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
        help='Project root directory'
    )
    parser.add_argument(
        '--tools',
        nargs='+',
        default=['EvoSuite', 'Randoop'],
        help='Tools to analyze'
    )
    parser.add_argument(
        '--gradle-cmd',
        default='gradlew.bat' if sys.platform == 'win32' else './gradlew',
        help='Gradle command'
    )
    parser.add_argument(
        '--cases',
        nargs='+',
        default=[],
        help='Filter by test case names'
    )
    parser.add_argument(
        '--budgets',
        type=int,
        nargs='+',
        default=[],
        help='Filter by budget seconds'
    )
    parser.add_argument(
        '--runs',
        type=int,
        nargs='+',
        default=[],
        help='Filter by run numbers'
    )
    parser.add_argument(
        '--skip-execution',
        action='store_true',
        help='Skip gradle execution'
    )
    parser.add_argument(
        '--stop-on-error',
        action='store_true',
        help='Stop on first error'
    )
    parser.add_argument(
        '--max-workers',
        type=int,
        default=2,
        help='Number of parallel gradle executions (default: 2, reduce if out of memory)'
    )

    args = parser.parse_args()

    repo = str(Path(args.project_root).resolve())
    os.chdir(repo)

    generated_root = os.path.join(repo, "generated-tests")
    reports_dir = os.path.join(repo, "reports")
    raw_dir = os.path.join(reports_dir, "raw")
    Path(raw_dir).mkdir(parents=True, exist_ok=True)

    summary_csv, agg_csv = build_output_paths(reports_dir, args)

    generation_map = parse_generation_summary(os.path.join(generated_root, "generation-summary.csv"))
    records = []

    # Debug: Show applied filters
    print("=" * 60)
    print("Active filters:")
    print(f"  Tools: {args.tools if args.tools else 'ALL'}")
    print(f"  Cases: {args.cases if args.cases else 'ALL'}")
    print(f"  Budgets (sec): {args.budgets if args.budgets else 'ALL'}")
    print(f"  Runs: {args.runs if args.runs else 'ALL'}")
    print(f"  Max workers: {args.max_workers}")
    print()
    print("Syntax note: Use '--cases LruCache' (space before value)")
    print("            not '--cases=LruCache' (avoid = with nargs='+')")
    print("=" * 60)
    print()

    generated_path = Path(generated_root)
    if not generated_path.exists():
        print("ERROR: generated-tests directory not found")
        return 1

    # Collect all tasks for parallel execution
    tasks = []
    task_metadata = {}
    total_found = 0
    filtered_out = 0

    for tool_dir in generated_path.iterdir():
        if not tool_dir.is_dir() or tool_dir.name not in args.tools:
            continue

        tool = tool_dir.name

        for class_dir in tool_dir.iterdir():
            if not class_dir.is_dir():
                continue

            class_simple = class_dir.name
            if args.cases and class_simple not in args.cases:
                filtered_out += 1
                continue

            target_class = f"com.viktor.lab4.{class_simple}"

            for budget_dir in class_dir.iterdir():
                if not budget_dir.is_dir():
                    continue

                try:
                    budget = int(budget_dir.name)
                except ValueError:
                    continue

                if args.budgets and budget not in args.budgets:
                    filtered_out += 1
                    continue

                for run_dir in budget_dir.iterdir():
                    if not run_dir.is_dir():
                        continue

                    match = re.match(r'^run(\d+)-seed(\d+)$', run_dir.name)
                    if not match:
                        continue

                    run = int(match.group(1))
                    seed = int(match.group(2))

                    if args.runs and run not in args.runs:
                        filtered_out += 1
                        continue

                    java_files = list(run_dir.glob("**/*.java"))
                    if not java_files:
                        continue

                    total_found += 1

                    pit_tests_pattern = (
                        "com.viktor.lab4.*ESTest*" if tool == "EvoSuite"
                        else "com.viktor.lab4.autogen.*"
                    )

                    work_dir = os.path.join(
                        repo,
                        f"build/analysis-work/{tool}/{class_simple}/{budget}/run{run}-seed{seed}"
                    )

                    # Prepare working directory before parallel execution
                    prepare_working_test_dir(tool, str(run_dir), work_dir)

                    if not args.skip_execution:
                        # Create task for parallel execution
                        task_id = len(tasks)
                        params = {
                            'repo': repo,
                            'gradle_cmd': args.gradle_cmd,
                            'work_dir': work_dir,
                            'target_class': target_class,
                            'pit_tests_pattern': pit_tests_pattern
                        }
                        tasks.append(params)
                        task_metadata[task_id] = {
                            'tool': tool,
                            'class_simple': class_simple,
                            'target_class': target_class,
                            'budget': budget,
                            'run': run,
                            'seed': seed,
                            'java_files': java_files,
                            'run_dir': run_dir,
                            'work_dir': work_dir
                        }
                    else:
                        # If skipping execution, add record immediately
                        gen_key = f"{tool}|{class_simple}|{budget}|{run}"
                        gen_elapsed = generation_map.get(gen_key)

                        jacoco_xml = os.path.join(repo, "build/reports/jacoco/generated/jacocoGeneratedTestReport.xml")
                        pit_xml = os.path.join(repo, "build/reports/pitest/generated/mutations.xml")
                        test_results_dir = os.path.join(repo, "build/test-results/generatedTest")

                        coverage = get_jacoco_metrics(jacoco_xml, target_class)
                        pit = get_pit_metrics(pit_xml)
                        tests = get_test_counts(test_results_dir)

                        record = {
                            'tool': tool,
                            'case': class_simple,
                            'targetClass': target_class,
                            'budgetSec': budget,
                            'run': run,
                            'seed': seed,
                            'generatedTestFiles': len(java_files),
                            'testsExecuted': tests['tests'],
                            'testFailures': tests['failures'],
                            'testSkipped': tests['skipped'],
                            'lineCoveragePct': coverage['linePct'],
                            'branchCoveragePct': coverage['branchPct'],
                            'instructionCoveragePct': coverage['instPct'],
                            'mutationScorePct': pit['mutationPct'],
                            'mutationsTotal': pit['total'],
                            'mutationsKilled': pit['killed'],
                            'mutationsSurvived': pit['survived'],
                            'mutationsTimedOut': pit['timedOut'],
                            'mutationsNoCoverage': pit['noCoverage'],
                            'generationElapsedSec': gen_elapsed,
                            'analysisElapsedSec': 0,
                            'status': 'OK',
                            'error': '',
                            'sourceDir': str(run_dir),
                            'preparedDir': work_dir
                        }
                        records.append(record)

    # Show results of filtering
    print(f"\nTest collection summary:")
    print(f"  Total matching filters: {total_found}")
    print(f"  Filtered out by constraints: {filtered_out}")
    print(f"  Will process: {len(tasks)} tasks")
    if not tasks and not args.skip_execution:
        if args.cases or args.budgets or args.runs:
            print("\n⚠️  WARNING: No tasks found after applying filters!")
            print("   Check that filter values match exactly (case-sensitive for cases).")
            print("   Tip: Run without filters to see available options.")
        else:
            print("\n❌ ERROR: No test tasks found at all!")
    print()

    # Execute tasks in parallel (configurable max workers)
    if tasks:
        print(f"Executing {len(tasks)} gradle analysis tasks with max {args.max_workers} workers...")
        results_by_task = {}
        completed_count = 0
        with ThreadPoolExecutor(max_workers=args.max_workers) as executor:
            futures = {executor.submit(execute_gradle_analysis, task): idx for idx, task in enumerate(tasks)}

            for future in as_completed(futures):
                task_idx = futures[future]
                try:
                    result = future.result()
                    results_by_task[task_idx] = result
                except Exception as e:
                    results_by_task[task_idx] = {
                        'status': 'FAILED',
                        'error_text': str(e),
                        'elapsed_analysis': 0,
                        'coverage': {'linePct': None, 'branchPct': None, 'instPct': None},
                        'pit': {'mutationPct': None, 'total': 0, 'killed': 0, 'survived': 0, 'timedOut': 0, 'noCoverage': 0},
                        'tests': {'tests': 0, 'failures': 0, 'skipped': 0}
                    }
                    if args.stop_on_error:
                        raise

                completed_count += 1
                meta = task_metadata.get(task_idx, {})
                print(f"  [{completed_count}/{len(tasks)}] {meta.get('tool', '?')}/{meta.get('class_simple', '?')}/{meta.get('budget', '?')}/run{meta.get('run', '?')} - {results_by_task[task_idx]['status']}")

        # Build records from execution results
        for task_idx, metadata in task_metadata.items():
            result = results_by_task.get(task_idx, {})

            gen_key = f"{metadata['tool']}|{metadata['class_simple']}|{metadata['budget']}|{metadata['run']}"
            gen_elapsed = generation_map.get(gen_key)

            record = {
                'tool': metadata['tool'],
                'case': metadata['class_simple'],
                'targetClass': metadata['target_class'],
                'budgetSec': metadata['budget'],
                'run': metadata['run'],
                'seed': metadata['seed'],
                'generatedTestFiles': len(metadata['java_files']),
                'testsExecuted': result.get('tests', {}).get('tests', 0),
                'testFailures': result.get('tests', {}).get('failures', 0),
                'testSkipped': result.get('tests', {}).get('skipped', 0),
                'lineCoveragePct': result.get('coverage', {}).get('linePct'),
                'branchCoveragePct': result.get('coverage', {}).get('branchPct'),
                'instructionCoveragePct': result.get('coverage', {}).get('instPct'),
                'mutationScorePct': result.get('pit', {}).get('mutationPct'),
                'mutationsTotal': result.get('pit', {}).get('total', 0),
                'mutationsKilled': result.get('pit', {}).get('killed', 0),
                'mutationsSurvived': result.get('pit', {}).get('survived', 0),
                'mutationsTimedOut': result.get('pit', {}).get('timedOut', 0),
                'mutationsNoCoverage': result.get('pit', {}).get('noCoverage', 0),
                'generationElapsedSec': gen_elapsed,
                'analysisElapsedSec': result.get('elapsed_analysis', 0),
                'status': result.get('status', 'UNKNOWN'),
                'error': result.get('error_text', ''),
                'sourceDir': str(metadata['run_dir']),
                'preparedDir': metadata['work_dir']
            }
            records.append(record)

    records.sort(key=lambda r: (r['tool'], r['case'], r['budgetSec'], r['run']))

    if records:
        fieldnames = [
            'tool', 'case', 'targetClass', 'budgetSec', 'run', 'seed',
            'generatedTestFiles', 'testsExecuted', 'testFailures', 'testSkipped',
            'lineCoveragePct', 'branchCoveragePct', 'instructionCoveragePct',
            'mutationScorePct', 'mutationsTotal', 'mutationsKilled',
            'mutationsSurvived', 'mutationsTimedOut', 'mutationsNoCoverage',
            'generationElapsedSec', 'analysisElapsedSec', 'status', 'error',
            'sourceDir', 'preparedDir'
        ]

        # CSV Columns Description (summary-quality.csv):
        # tool: Test generation tool (EvoSuite, Randoop)
        # case: Target class short name (e.g. LruCache)
        # targetClass: Fully qualified class name (e.g. com.viktor.lab4.LruCache)
        # budgetSec: Search budget in seconds
        # run: Run number (1-3)
        # seed: Random seed used
        # generatedTestFiles: Number of generated *.java test files
        # testsExecuted: Total number of tests executed
        # testFailures: Number of failed/error tests
        # testSkipped: Number of skipped tests
        # lineCoveragePct: Line coverage percentage (JaCoCo)
        # branchCoveragePct: Branch coverage percentage (JaCoCo)
        # instructionCoveragePct: Instruction coverage percentage (JaCoCo)
        # mutationScorePct: Mutation score percentage (PIT killed/total)
        # mutationsTotal: Total number of mutations generated (PIT)
        # mutationsKilled: Number of detected/killed mutations
        # mutationsSurvived: Number of mutations that survived (not caught)
        # mutationsTimedOut: Number of mutations that timed out
        # mutationsNoCoverage: Number of mutations not covered by tests
        # generationElapsedSec: Time spent on test generation (from generation-summary.csv)
        # analysisElapsedSec: Time spent on JaCoCo+PIT analysis
        # status: Execution status (OK or FAILED)
        # error: Error message if status is FAILED
        # sourceDir: Directory with generated test sources
        # preparedDir: Working directory used for analysis

        with open(summary_csv, 'w', newline='', encoding='utf-8') as f:
            writer = csv.DictWriter(f, fieldnames=fieldnames)
            writer.writeheader()
            writer.writerows(records)

    aggregated = {}
    for record in records:
        if record['status'] != 'OK':
            continue

        key = (record['tool'], record['case'], record['budgetSec'])
        if key not in aggregated:
            aggregated[key] = []
        aggregated[key].append(record)

    agg_records = []
    for (tool, case, budget), rows in aggregated.items():
        line_coverages = [r['lineCoveragePct'] for r in rows if r['lineCoveragePct'] is not None]
        branch_coverages = [r['branchCoveragePct'] for r in rows if r['branchCoveragePct'] is not None]
        instruction_coverages = [r['instructionCoveragePct'] for r in rows if r['instructionCoveragePct'] is not None]
        mutation_scores = [r['mutationScorePct'] for r in rows if r['mutationScorePct'] is not None]
        tests_executed = [r['testsExecuted'] for r in rows if r['testsExecuted'] is not None]

        # Calculate statistics for each metric with CI and variance
        tests_stats = calc_confidence_interval(tests_executed)
        line_stats = calc_confidence_interval(line_coverages)
        branch_stats = calc_confidence_interval(branch_coverages)
        instruction_stats = calc_confidence_interval(instruction_coverages)
        mutation_stats = calc_confidence_interval(mutation_scores)

        agg_records.append({
            'tool': tool,
            'case': case,
            'budgetSec': budget,
            'runs': len(rows),
            'meanTestsExecuted': tests_stats['mean'],
            'testsVariance': tests_stats['variance'],
            'testsStddev': tests_stats['stddev'],
            'testsCI_lower': tests_stats['ci_lower'],
            'testsCI_upper': tests_stats['ci_upper'],
            'meanLineCoveragePct': line_stats['mean'],
            'lineVariance': line_stats['variance'],
            'lineStddev': line_stats['stddev'],
            'lineCI_lower': line_stats['ci_lower'],
            'lineCI_upper': line_stats['ci_upper'],
            'meanBranchCoveragePct': branch_stats['mean'],
            'branchVariance': branch_stats['variance'],
            'branchStddev': branch_stats['stddev'],
            'branchCI_lower': branch_stats['ci_lower'],
            'branchCI_upper': branch_stats['ci_upper'],
            'meanInstructionCoveragePct': instruction_stats['mean'],
            'instructionVariance': instruction_stats['variance'],
            'instructionStddev': instruction_stats['stddev'],
            'instructionCI_lower': instruction_stats['ci_lower'],
            'instructionCI_upper': instruction_stats['ci_upper'],
            'meanMutationScorePct': mutation_stats['mean'],
            'mutationVariance': mutation_stats['variance'],
            'mutationStddev': mutation_stats['stddev'],
            'mutationCI_lower': mutation_stats['ci_lower'],
            'mutationCI_upper': mutation_stats['ci_upper']
        })

    agg_records.sort(key=lambda r: (r['tool'], r['case'], r['budgetSec']))

    if agg_records:
        agg_fieldnames = [
            'tool', 'case', 'budgetSec', 'runs',
            'meanTestsExecuted', 'testsVariance', 'testsStddev', 'testsCI_lower', 'testsCI_upper',
            'meanLineCoveragePct', 'lineVariance', 'lineStddev', 'lineCI_lower', 'lineCI_upper',
            'meanBranchCoveragePct', 'branchVariance', 'branchStddev', 'branchCI_lower', 'branchCI_upper',
            'meanInstructionCoveragePct', 'instructionVariance', 'instructionStddev', 'instructionCI_lower', 'instructionCI_upper',
            'meanMutationScorePct', 'mutationVariance', 'mutationStddev', 'mutationCI_lower', 'mutationCI_upper'
        ]

        # CSV Columns Description (summary-quality-aggregated.csv):
        # Aggregated statistics across multiple runs for each (tool, case, budget) combination
        #
        # Basic identification:
        # tool: Test generation tool (EvoSuite, Randoop)
        # case: Target class short name
        # budgetSec: Search budget in seconds
        # runs: Number of runs aggregated
        #
        # Test Execution Statistics:
        # meanTestsExecuted: Average number of tests executed across runs
        # testsVariance: Variance of test execution count
        # testsStddev: Standard deviation of test execution count
        # testsCI_lower: 95% confidence interval lower bound
        # testsCI_upper: 95% confidence interval upper bound
        #
        # Line Coverage Statistics (JaCoCo):
        # meanLineCoveragePct: Average line coverage percentage
        # lineVariance: Variance of line coverage
        # lineStddev: Standard deviation of line coverage
        # lineCI_lower: 95% CI lower bound for line coverage
        # lineCI_upper: 95% CI upper bound for line coverage
        #
        # Branch Coverage Statistics (JaCoCo):
        # meanBranchCoveragePct: Average branch coverage percentage
        # branchVariance: Variance of branch coverage
        # branchStddev: Standard deviation of branch coverage
        # branchCI_lower: 95% CI lower bound for branch coverage
        # branchCI_upper: 95% CI upper bound for branch coverage
        #
        # Instruction Coverage Statistics (JaCoCo):
        # meanInstructionCoveragePct: Average instruction coverage percentage
        # instructionVariance: Variance of instruction coverage
        # instructionStddev: Standard deviation of instruction coverage
        # instructionCI_lower: 95% CI lower bound for instruction coverage
        # instructionCI_upper: 95% CI upper bound for instruction coverage
        #
        # Mutation Score Statistics (PIT):
        # meanMutationScorePct: Average mutation score (killed/total)
        # mutationVariance: Variance of mutation score
        # mutationStddev: Standard deviation of mutation score
        # mutationCI_lower: 95% CI lower bound for mutation score
        # mutationCI_upper: 95% CI upper bound for mutation score
        #
        # Confidence Interval (95%) calculation uses Student's t-distribution
        # for small samples (n < 30): CI = mean ± t_α/2,n-1 * (stddev / sqrt(n))
        # Useful for: identifying stable metrics, comparing tool effectiveness,
        # determining statistical significance of differences

        with open(agg_csv, 'w', newline='', encoding='utf-8') as f:
            writer = csv.DictWriter(f, fieldnames=agg_fieldnames)
            writer.writeheader()
            writer.writerows(agg_records)

    print()
    print("Done.")
    print(f"Detailed:   {summary_csv}")
    print(f"Aggregated: {agg_csv}")

    return 0


if __name__ == '__main__':
    sys.exit(main())

