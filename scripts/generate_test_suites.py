#!/usr/bin/env python3
"""
Generate reproducible test suites with EvoSuite and Randoop.
Generates test cases for multiple classes with various budgets and seeds.
"""

import argparse
import csv
import os
import re
import subprocess
import sys
from datetime import datetime
from glob import glob
from pathlib import Path
from typing import Optional

from analysis_support import PROJECT_ROOT, load_experiment_config, resolve_project_path


def get_class_short_name(fqcn: str) -> str:
    """Extract short class name from fully qualified class name."""
    return fqcn.split('.')[-1]


def ensure_file_exists(path: str, message: str) -> None:
    """Check if file exists, raise error if not."""
    if not Path(path).exists():
        raise FileNotFoundError(f"{message}: {path}")


def invoke_external(
    exe: str,
    args: list[str],
    dry_run: bool = False,
    timeout_sec: int | None = None
) -> int:
    """Execute external command with timeout support."""
    cmd_str = f"{exe} " + " ".join(args)
    print(f"\n>>> {cmd_str}")
    
    if dry_run:
        return 0
    
    try:
        result = subprocess.run(
            [exe] + args,
            timeout=timeout_sec,
            check=False
        )
        if result.returncode != 0:
            raise RuntimeError(f"Command failed with code {result.returncode}")
        return 0
    except subprocess.TimeoutExpired:
        raise RuntimeError(f"Command timed out after {timeout_sec} seconds")


def expand_list_parameter(values: list[str]) -> list[str]:
    """Expand comma-separated values into a flat list."""
    return [item.strip() for value in values for item in value.split(',') if item.strip()]


def expand_int_list_parameter(values: list[str], param_name: str) -> list[int]:
    """Parse list of integers from comma/semicolon/whitespace separated values."""
    raw_items = []
    for value in values:
        if not value or not value.strip():
            continue
        parts = re.split(r'[,;\s]+', value)
        for part in parts:
            trimmed = part.strip()
            if trimmed:
                raw_items.append(trimmed)
    
    if not raw_items:
        raise ValueError(f"Parameter {param_name} is empty")
    
    parsed = []
    for item in raw_items:
        try:
            parsed.append(int(item))
        except ValueError:
            raise ValueError(f"Parameter {param_name} contains non-integer value: {item}")
    
    return parsed


def get_java_major_version(java_path: str) -> Optional[int]:
    """Extract major Java version from java executable."""
    try:
        result = subprocess.run(
            [java_path, '-version'],
            capture_output=True,
            text=True,
            timeout=5
        )
        output = result.stdout + result.stderr
        if not output:
            return None
        
        first_line = output.split('\n')[0]
        match = re.search(r'"(\d+)(?:\.\d+)?', first_line)
        if match:
            return int(match.group(1))
    except Exception:
        pass
    
    return None


def find_evosuite_compatible_java(repo_root: str) -> Optional[str]:
    """Auto-detect Java compatible with EvoSuite."""
    candidates = []
    seen = set()
    
    def add_candidate(candidate_path: str) -> None:
        if not candidate_path or not Path(candidate_path).exists():
            return
        resolved = str(Path(candidate_path).resolve())
        if resolved not in seen:
            seen.add(resolved)
            candidates.append(resolved)
    
    add_candidate(os.path.join(repo_root, "tools/jdk8/bin/java.exe"))
    add_candidate(os.path.join(repo_root, "tools/jdk8_alt/bin/java.exe"))
    
    java_home = os.environ.get('JAVA_HOME')
    if java_home:
        add_candidate(os.path.join(java_home, "bin/java.exe"))
    
    glob_patterns = [
        str(Path.home() / ".jdks" / "*" / "bin" / "java.exe"),
        r"C:\Program Files\Eclipse Adoptium\jdk-*\bin\java.exe",
        r"C:\Program Files\Java\jdk*\bin\java.exe",
        r"C:\Program Files\JetBrains\IntelliJ IDEA*\jbr\bin\java.exe",
        r"C:\Program Files\JetBrains\IntelliJ IDEA Community Edition*\jbr\bin\java.exe",
    ]
    
    if 'LOCALAPPDATA' in os.environ:
        glob_patterns.extend([
            os.path.expandvars(r"$LOCALAPPDATA\JetBrains\Toolbox\apps\IDEA-U\ch-0\*\jbr\bin\java.exe"),
            os.path.expandvars(r"$LOCALAPPDATA\JetBrains\Toolbox\apps\IDEA-C\ch-0\*\jbr\bin\java.exe"),
        ])
    
    for pattern in glob_patterns:
        for match in sorted(glob(pattern), reverse=True):
            add_candidate(match)
    
    compatible = []
    for candidate in candidates:
        major = get_java_major_version(candidate)
        if major is not None and major <= 17:
            compatible.append((candidate, major))
    
    if not compatible:
        return None
    
    compatible.sort(key=lambda x: (-x[1], x[0]))
    return compatible[0][0]

def get_next_run_index(out_base: Path, tool: str, class_short: str, budget: int) -> int:
    """Возвращает следующий доступный run_index на основе существующих папок."""
    target_dir = out_base / tool / class_short / str(budget)
    if not target_dir.is_dir():
        return 1

    pattern = re.compile(r'^run(\d+)-')
    indices = [
        int(match.group(1))
        for entry in target_dir.iterdir()
        if entry.is_dir() and (match := pattern.match(entry.name))
    ]
    return max(indices, default=0) + 1

def main():
    parser = argparse.ArgumentParser(
        description='Generate test cases using EvoSuite and Randoop',
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )
    parser.add_argument(
        '--repo-root',
        default=str(PROJECT_ROOT),
        help='Repository root directory'
    )
    parser.add_argument(
        '--experiment-config',
        default='experiment.toml',
        help='TOML manifest with shared experiment factors'
    )
    parser.add_argument(
        '--budgets',
        nargs='+',
        default=None,
        help='Search budgets in seconds; overrides the manifest'
    )
    parser.add_argument(
        '--seeds',
        nargs='+',
        default=None,
        help='Random seeds; overrides the manifest'
    )
    parser.add_argument(
        '--tools',
        nargs='+',
        default=None,
        help='Tools to use; overrides the manifest'
    )
    parser.add_argument(
        '--target-classes',
        nargs='+',
        default=None,
        help='Target classes; overrides the manifest'
    )
    parser.add_argument(
        '--output-root',
        default='src/generatedTest/suites',
        help='Output directory for generated tests'
    )
    parser.add_argument(
        '--java-exe',
        default='java',
        help='Java executable to use'
    )
    parser.add_argument(
        '--use-bundled-jdk8',
        action='store_true',
        help='Use bundled JDK8'
    )
    parser.add_argument(
        '--skip-build',
        action='store_true',
        help='Skip gradle build'
    )
    parser.add_argument(
        '--dry-run',
        action='store_true',
        help='Print commands without executing'
    )
    
    args = parser.parse_args()
    
    repo_root = str(Path(args.repo_root).resolve())
    os.chdir(repo_root)
    experiment = load_experiment_config(Path(repo_root), args.experiment_config)

    tools = expand_list_parameter(args.tools) if args.tools else experiment.tools
    target_classes = expand_list_parameter(args.target_classes) if args.target_classes else experiment.target_classes
    budgets = expand_int_list_parameter(args.budgets, "budgets") if args.budgets else experiment.budgets
    seeds = expand_int_list_parameter(args.seeds, "seeds") if args.seeds else experiment.seeds
    
    evosuite_jar = os.path.join(repo_root, "tools/evosuite-1.2.0.jar")
    randoop_jar = os.path.join(repo_root, "tools/randoop-all-4.3.3.jar")
    gradlew = os.path.join(repo_root, "gradlew.bat")
    
    ensure_file_exists(gradlew, "Gradle wrapper not found")
    
    if "EvoSuite" in tools:
        ensure_file_exists(evosuite_jar, "EvoSuite jar not found")
    if "Randoop" in tools:
        ensure_file_exists(randoop_jar, "Randoop jar not found")
    
    java_exe = args.java_exe
    if args.use_bundled_jdk8:
        candidate_java = os.path.join(repo_root, "tools/jdk8/bin/java.exe")
        ensure_file_exists(candidate_java, "Bundled JDK8 java.exe not found")
        java_exe = candidate_java
    
    if "EvoSuite" in tools:
        java_was_explicit = args.use_bundled_jdk8 or (args.java_exe != parser.get_default('java_exe'))
        java_major = get_java_major_version(java_exe)
        
        if (java_major is None or java_major > 17) and not java_was_explicit:
            auto_java = find_evosuite_compatible_java(repo_root)
            if auto_java:
                print(f"WARNING: Auto-selected Java for EvoSuite: {auto_java}")
                java_exe = auto_java
                java_major = get_java_major_version(java_exe)
        
        if java_major is None or java_major > 17:
            raise RuntimeError(
                f"EvoSuite 1.2.0 is incompatible with Java {java_major} (unsupported class file major version). "
                f"Use JDK 8/11/17 via --java-exe."
            )
    
    if not args.skip_build:
        invoke_external(
            gradlew,
            ['--no-daemon', 'clean', 'classes'],
            dry_run=args.dry_run
        )
    
    main_classes = os.path.join(repo_root, "build/classes/java/main")
    main_resources = os.path.join(repo_root, "build/resources/main")
    
    if not args.dry_run:
        ensure_file_exists(main_classes, "Compiled main classes not found")
    
    classpath_entries = []
    if Path(main_classes).exists():
        classpath_entries.append(main_classes)
    if Path(main_resources).exists():
        classpath_entries.append(main_resources)
    else:
        print(f"WARNING: Optional classpath entry not found (continuing): {main_resources}")
    
    if not classpath_entries:
        raise RuntimeError("No valid classpath entries found for generators")
    
    project_cp = os.pathsep.join(classpath_entries)
    out_base = resolve_project_path(Path(repo_root), args.output_root)
    out_base.mkdir(parents=True, exist_ok=True)
    
    summary_file_name = "generation_runs_dry_run.csv" if args.dry_run else "generation_runs.csv"
    summary_dir = Path(repo_root) / "reports" / "data"
    summary_dir.mkdir(parents=True, exist_ok=True)
    summary_path = summary_dir / summary_file_name
    
    rows = []
    evosuite_jvm_args = [
        "-Djava.awt.headless=true",
        "--add-opens", "java.desktop/java.awt=ALL-UNNAMED",
        "--add-opens", "java.base/java.lang=ALL-UNNAMED",
        "--add-opens", "java.base/java.util=ALL-UNNAMED",
        "--add-opens", "java.base/java.net=ALL-UNNAMED"
    ]
    
    for tool in tools:
        print(f"Tool = {tool}")
        for target in target_classes:
            print(f"target = {target}")
            class_short = get_class_short_name(target)
            for budget in budgets:
                for seed in seeds:
                    print(f"budget = {budget}, seed = {seed}")
                    run_index = get_next_run_index(out_base, tool, class_short, budget)
                    run_dir = out_base / tool / class_short / str(budget) / f"run{run_index}-seed{seed}"
                    
                    if not args.dry_run:
                        run_dir.mkdir(parents=True, exist_ok=True)
                    
                    start_time = datetime.now()
                    status = "OK"
                    error_text = ""
                    
                    try:
                        if tool == "EvoSuite":
                            cmd_args = evosuite_jvm_args + [
                                "-jar", evosuite_jar,
                                "-generateMOSuite",
                                "-class", target,
                                "-projectCP", project_cp,
                                f"-Dsearch_budget={budget}",
                                "-Dclient_on_thread=true",
                                "-Dsandbox=false",
                                "-seed", str(seed),
                                "-Dassertions=true",
                                f"-Dtest_dir={run_dir}",
                                f"-Dreport_dir={run_dir}"
                            ]
                            invoke_external(java_exe, cmd_args, dry_run=args.dry_run)
                        
                        elif tool == "Randoop":
                            randoop_cp = f"{randoop_jar}{os.pathsep}{project_cp}"
                            cmd_args = [
                                "-cp", randoop_cp,
                                "randoop.main.Main", "gentests",
                                f"--testclass={target}",
                                f"--time-limit={budget}",
                                f"--randomseed={seed}",
                                f"--junit-output-dir={run_dir}",
                                "--junit-package-name=com.viktor.lab4.autogen",
                                "--regression-test-basename=RegressionTest",
                                "--error-test-basename=ErrorTest"
                            ]
                            invoke_external(java_exe, cmd_args, dry_run=args.dry_run)
                        
                        else:
                            raise ValueError(f"Unsupported tool: {tool}")
                    
                    except Exception as e:
                        status = "FAIL"
                        error_text = str(e)
                        print(f"WARNING: Run failed: tool={tool} class={class_short} budget={budget} seed={seed}: {error_text}")
                    
                    elapsed = round((datetime.now() - start_time).total_seconds(), 3)
                    
                    rows.append({
                        'timestamp': datetime.now().isoformat(),
                        'tool': tool,
                        'targetClass': target,
                        'budgetSec': budget,
                        'run': run_index,
                        'seed': seed,
                        'status': status,
                        'elapsedSec': elapsed,
                        'outputDir': str(run_dir),
                        'error': error_text
                    })
    
    with open(summary_path, 'w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=[
            'timestamp', 'tool', 'targetClass', 'budgetSec', 'run', 'seed',
            'status', 'elapsedSec', 'outputDir', 'error'
        ])
        writer.writeheader()
        writer.writerows(rows)
    
    print(f"\nDone. Summary: {summary_path}")


if __name__ == '__main__':
    sys.exit(main())
