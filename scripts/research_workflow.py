"""Measure class families and extend one frozen Qwen experiment by seed."""
import argparse
import csv
import hashlib
import json
import os
import subprocess
import sys
import tomllib
import xml.etree.ElementTree as ET
from datetime import datetime
from pathlib import Path

from analysis_support import PROJECT_ROOT, load_experiment_config

DEFAULT_SUITES = 'src/generatedTest/qwen-v4-20260908-020700-5fa27f'
SCOPE = 'class-family'


def digest(path):
    return hashlib.sha256(Path(path).read_bytes()).hexdigest()


def read_rows(path):
    with Path(path).open(encoding='utf-8-sig', newline='') as handle:
        return list(csv.DictReader(handle))


def write_json(path, value):
    Path(path).parent.mkdir(parents=True, exist_ok=True)
    Path(path).write_text(json.dumps(value, indent=2, ensure_ascii=False), encoding='utf-8')


def suite_inventory(root, tool, cases, budget):
    result = {}
    for case in cases:
        for path in (root / tool / case / str(budget)).glob('run*-seed*'):
            if not path.is_dir():
                continue
            seed = int(path.name.rsplit('seed', 1)[1])
            key = (case, seed)
            if key in result:
                raise ValueError(f'Multiple runs for {key} in {root}; choose a single experiment')
            result[key] = path
    return result


def validate_frozen_runs(inventory, config, repo):
    """Do not silently reuse runs made with another prompt, model or source."""
    records = {}
    adapter_hash = digest(repo / 'scripts/llm_generator.py')
    for key, path in inventory.items():
        metadata_path = path / 'llm-run.json'
        if not metadata_path.exists():
            raise ValueError(f'Incomplete run: {path}. Keep its audit and resolve interruption before continuing.')
        item = json.loads(metadata_path.read_text(encoding='utf-8'))
        source = repo / 'src/main/java' / (item['target'].replace('.', '/') + '.java')
        if (item['protocol'] != 'qwen-focused-repair-v4' or item['config'] != config
                or item['fingerprint']['adapterSha256'] != adapter_hash or item['sourceSha256'] != digest(source)):
            raise ValueError(f'Frozen experiment changed: {path}. Do not mix different protocols/configurations/sources.')
        if item['status'] not in ('OK', 'EMPTY'):
            raise ValueError(f'Unfinished/failed run: {path} ({item["status"]}); do not silently replace it')
        if len(list(path.rglob('*.java'))) != item['accepted']:
            raise ValueError(f'Test file count changed: {path}')
        records[key] = item
    return records


def verify_scope(row, expected_tests):
    if row['status'] == 'EMPTY':
        row['uniqueTestMethods'] = 0
        if expected_tests != 0:
            raise ValueError('Unexpected empty suite')
        return {'case': row['case'], 'seed': int(row['seed']), 'empty': True}
    if row['status'] != 'OK' or int(row['testsExecuted']) != expected_tests:
        raise ValueError(f'Analysis/JUnit count failed: {row["tool"]}/{row["case"]}/{row["seed"]}')
    if int(row['testFailures']) or int(row['testSkipped']):
        raise ValueError('Failed or skipped JUnit tests')
    if row['measurementScope'] != SCOPE or any(not row[k] for k in
            ('lineCoveragePct', 'branchCoveragePct', 'instructionCoveragePct', 'mutationScorePct')):
        raise ValueError('Missing metrics or wrong scope')
    build = Path(row['buildDir'])
    # Randoop's suite runner can execute the same method twice in Gradle.
    # Spectra have one row per method, not per repeated execution.
    methods = {(e.get('classname'), e.get('name')) for path in (build / 'test-results/generatedTest').glob('TEST-*.xml')
               for e in ET.parse(path).getroot().findall('testcase')}
    row['uniqueTestMethods'] = len(methods)
    if not methods:
        raise ValueError('JUnit method identities missing')
    target = row['targetClass']
    internal = target.replace('.', '/')
    outer = build / 'classes/java/main' / (internal + '.class')
    expected = {internal} | {internal.rsplit('/', 1)[0] + '/' + p.stem
                            for p in outer.parent.glob(outer.stem + '$*.class')}
    xml = ET.parse(build / 'reports/jacoco/generated/jacocoGeneratedTestReport.xml').getroot()
    covered_classes = {e.get('name') for e in xml.findall('.//class')
                       if e.get('name') == internal or e.get('name', '').startswith(internal + '$')}
    if not outer.exists() or covered_classes != expected:
        raise ValueError(f'JaCoCo family incomplete for {target}: {covered_classes} vs {expected}')
    mutations = ET.parse(build / 'reports/pitest/generated/mutations.xml').getroot()
    mutated = {e.findtext('mutatedClass') for e in mutations}
    if any(name != target and not name.startswith(target + '$') for name in mutated):
        raise ValueError(f'PIT included unrelated classes: {mutated}')
    # These two project classes contain actual mutable nested implementation code.
    required_nested = {'SimpleJsonParser': target + '$Parser', 'LruCache': target + '$1'}.get(row['case'])
    if required_nested and required_nested not in mutated:
        raise ValueError(f'PIT did not mutate required nested implementation: {required_nested}')
    return {'tool': row['tool'], 'case': row['case'], 'seed': int(row['seed']),
            'jacocoClasses': sorted(covered_classes), 'pitClasses': sorted(mutated)}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('action', choices=['measure', 'extend'])
    parser.add_argument('--suites', default=DEFAULT_SUITES)
    parser.add_argument('--seeds', help='Comma-separated seeds; measure defaults to all completed Qwen seeds')
    parser.add_argument('--java-home', default='C:/Users/user/.jdks/jbr-17.0.14')
    parser.add_argument('--with-traces', action='store_true', help='Also recollect ALL selected tool spectra; can be slow for Randoop')
    args = parser.parse_args()
    repo = PROJECT_ROOT
    os.chdir(repo)
    java = str(Path(args.java_home) / 'bin/java.exe')
    os.environ['JAVA_HOME'] = args.java_home
    os.environ['PYTHONIOENCODING'] = 'utf-8'
    if not Path(java).is_file():
        raise ValueError('JDK 17 not found; use --java-home')
    root = (repo / args.suites).resolve()
    experiment = load_experiment_config(repo, 'experiment.toml')
    config = tomllib.loads((repo / 'llm.toml').read_text(encoding='utf-8'))['llm']
    qbudget = experiment.reference_budgets['QwenLLM']
    inventory = suite_inventory(root, 'QwenLLM', experiment.cases, qbudget)
    frozen = validate_frozen_runs(inventory, config, repo)
    if not frozen:
        raise ValueError('No reference Qwen v4 runs found')
    seeds = sorted(set(int(s) for s in args.seeds.split(','))) if args.seeds else sorted({seed for _, seed in frozen})
    if not seeds or any(seed < 0 for seed in seeds):
        raise ValueError('Specify nonnegative seeds')
    baseline_roots = {tool: suite_inventory(repo / 'src/generatedTest/suites', tool, experiment.cases,
                     experiment.reference_budgets[tool]) for tool in ('EvoSuite', 'Randoop')}
    for tool, suites in baseline_roots.items():
        for case in experiment.cases:
            for seed in seeds:
                if (case, seed) not in suites:
                    raise ValueError(f'Missing existing baseline {tool}/{case}/seed{seed}; generate that seed for the baseline first')
    key = hashlib.sha256(str(root).encode()).hexdigest()[:12]
    gate = repo / 'reports/data' / f'class-family-check-{key}.json'
    stamp = datetime.now().strftime('%Y%m%d-%H%M%S-%f')
    output = repo / 'reports/data' / f'family-{args.action}-{stamp}'
    output.mkdir(parents=True)
    log_path = output / 'workflow.log'

    def run(command):
        print('RUN:', ' '.join(map(str, command)), flush=True)
        with log_path.open('a', encoding='utf-8') as log:
            log.write('\nRUN: ' + ' '.join(map(str, command)) + '\n')
            process = subprocess.Popen(list(map(str, command)), cwd=repo, stdout=subprocess.PIPE,
                                       stderr=subprocess.STDOUT, text=True, encoding='utf-8', errors='replace')
            for line in process.stdout:
                print(line, end='', flush=True)
                log.write(line)
                log.flush()
            if process.wait() != 0:
                raise RuntimeError(f'Command failed; see {log_path}')

    def python(script, *options):
        run([sys.executable, '-u', repo / 'scripts' / script, *options])

    print(f'Existing suites: {root}\nResults/log: {output}\nSeeds: {seeds}', flush=True)
    if args.action == 'extend':
        if not args.seeds:
            raise ValueError('Extension requires --seeds, for example 202,303')
        if not gate.exists():
            raise ValueError('Run measure first and obtain CLASS FAMILY CHECK PASSED')
        checked = json.loads(gate.read_text(encoding='utf-8'))
        if (checked.get('scope') != SCOPE or checked.get('status') != 'PASSED'
                or checked['adapterSha256'] != digest(repo / 'scripts/llm_generator.py') or checked['config'] != config):
            raise ValueError('Generation configuration changed since the measurement check')
        missing = [(case, seed) for seed in seeds for case in experiment.cases if (case, seed) not in frozen]
        print(f'Skipping {len(seeds) * len(experiment.cases) - len(missing)} completed runs; new runs: {len(missing)}', flush=True)
        if missing:
            run(['powershell.exe', '-NoProfile', '-ExecutionPolicy', 'Bypass', '-File', repo / 'scripts/setup_llm.ps1', '-SkipModelPull'])
            run([repo / 'gradlew.bat', '--no-daemon', 'classes'])
            for seed in seeds:
                targets = ['com.viktor.lab4.' + case for case, s in missing if s == seed]
                if targets:
                    python('generate_test_suites.py', '--tools', 'QwenLLM', '--seeds', seed,
                           '--target-classes', *targets, '--skip-build', '--java-exe', java, '--output-root', root)
        after = validate_frozen_runs(suite_inventory(root, 'QwenLLM', experiment.cases, qbudget), config, repo)
        if any((case, seed) not in after for seed in seeds for case in experiment.cases):
            raise ValueError('Some requested series did not finish')
        write_json(output / 'completion.json', {'status': 'OK', 'action': 'extend', 'seeds': seeds,
                   'newRuns': len(missing), 'sourceRoot': str(root), 'log': str(log_path)})
        print('QWEN EXTENSION FINISHED', flush=True)
        return

    selected = {(case, seed) for case in experiment.cases for seed in seeds}
    if not selected <= frozen.keys():
        raise ValueError('Qwen has not completed all selected class/seed combinations')
    quality_rows, scope_checks = [], []
    for tool in ('EvoSuite', 'Randoop', 'QwenLLM'):
        source_root = root if tool == 'QwenLLM' else repo / 'src/generatedTest/suites'
        budget = experiment.reference_budgets[tool]
        python('analyze_test_quality.py', '--tools', tool, '--budgets', budget, '--seeds', *seeds,
               '--scope', SCOPE, '--generated-tests-root', source_root, '--report-root', output)
        files = list((output / 'quality').glob(f'quality_runs__tools-{tool}__*.csv'))
        if len(files) != 1:
            raise ValueError(f'Missing/ambiguous quality CSV for {tool}')
        rows = read_rows(files[0])
        if len(rows) != len(selected) or {(r['case'], int(r['seed'])) for r in rows} != selected:
            raise ValueError(f'Incomplete quality table for {tool}')
        old = {} if tool == 'QwenLLM' else {(r['case'], int(r['seed'])): int(r['testsExecuted']) for r in read_rows(
            repo / f'reports/data/quality/quality_runs__tools-{tool}__cases-all__budgets-all__runs-all.csv') if int(r['budgetSec']) == budget}
        for row in rows:
            k = row['case'], int(row['seed'])
            expected = frozen[k]['accepted'] if tool == 'QwenLLM' else old[k]
            scope_checks.append(verify_scope(row, expected))
        quality_rows.extend(rows)
    with (output / 'comparison.csv').open('w', encoding='utf-8', newline='') as handle:
        writer = csv.DictWriter(handle, fieldnames=list(quality_rows[0]))
        writer.writeheader()
        writer.writerows(quality_rows)
    write_json(output / 'scope-checks.json', scope_checks)
    if args.with_traces:
        for tool in ('EvoSuite', 'Randoop', 'QwenLLM'):
            source_root = root if tool == 'QwenLLM' else repo / 'src/generatedTest/suites'
            python('analyze_trace_similarity.py', '--tools', tool, '--collect-only', '--scope', SCOPE,
                   '--budgets', experiment.reference_budgets[tool], '--seeds', ','.join(map(str, seeds)),
                   '--generated-tests', source_root, '--traces-dir', output / 'traces', '--java', java)
            traces = read_rows(output / 'traces' / f'{tool.lower()}_test_traces.csv')
            for row in (r for r in quality_rows if r['tool'] == tool):
                count = sum(t['program_class'] == row['case'] and int(t['seed']) == int(row['seed']) for t in traces)
                if count != int(row['uniqueTestMethods']):
                    raise ValueError(f'Trace/JUnit count mismatch for {tool}/{row["case"]}/{row["seed"]}')
        python('analyze_trace_similarity.py', '--tools', 'EvoSuite,Randoop,QwenLLM', '--skip-collect',
               '--scope', SCOPE, '--traces-dir', output / 'traces', '--out', output / 'similarity/similarity_runs.csv')
    completion = {'status': 'PASSED', 'scope': SCOPE, 'seeds': seeds, 'suitesChecked': len(quality_rows),
                  'emptySuites': sum(r['status'] == 'EMPTY' for r in quality_rows), 'withTraces': args.with_traces,
                  'sourceRoot': str(root), 'reportRoot': str(output), 'adapterSha256': digest(repo / 'scripts/llm_generator.py'),
                  'config': config}
    write_json(output / 'completion.json', completion)
    write_json(gate, completion)
    print(f'CLASS FAMILY CHECK PASSED: {len(quality_rows)} suites, {completion["emptySuites"]} empty.\nResults: {output}', flush=True)


if __name__ == '__main__':
    try:
        main()
    except Exception as exc:
        print(f'WORKFLOW FAILED: {exc}', file=sys.stderr, flush=True)
        sys.exit(1)
