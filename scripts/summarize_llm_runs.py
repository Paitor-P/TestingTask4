"""Report ALL attempted LLM runs, including empty runs and rejected candidates."""
import csv
import argparse
import json
from pathlib import Path
from analysis_support import PROJECT_ROOT


def summarize(root: Path = PROJECT_ROOT, suites: str = 'src/generatedTest/suites', report_root: str = 'reports/data') -> list[dict]:
    records = []
    for path in sorted((root / suites / 'QwenLLM').glob('*/*/run*/llm-run.json')):
        item = json.loads(path.read_text(encoding='utf-8'))
        attempts = item['attempts']
        records.append({'case': item['target'].rsplit('.', 1)[-1], 'budgetSec': item['budgetSec'],
            'run': path.parent.name, 'seed': item['seed'], 'status': item['status'],
            'protocol': item['protocol'], 'budgetKind': item.get('budgetKind', 'wall_time'),
            'stopReason': item.get('stopReason', 'time_limit'),
            'targetAcceptedTests': item['config'].get('target_accepted_tests'),
            'quotaMet': item['accepted'] >= item['config']['target_accepted_tests'] if item['config'].get('target_accepted_tests') else None,
            'attempts': len(attempts), 'acceptedCandidates': item['accepted'],
            'repairAttempts': sum(a.get('phase') == 'repair' for a in attempts),
            'rejectedCandidates': sum(a['status'] == 'REJECTED' for a in attempts),
            'timedOutCandidates': sum(a['status'] == 'TIMEOUT' for a in attempts),
            'elapsedSec': item['elapsedSec'],
            'completedOutputTokens': sum(a.get('usage', {}).get('eval_count', 0) for a in attempts),
            'modelDigest': item['fingerprint']['model']['digest']})
    if records:
        output = root / report_root / 'quality/llm_generation_outcomes.csv'
        output.parent.mkdir(parents=True, exist_ok=True)
        with output.open('w', encoding='utf-8', newline='') as stream:
            writer = csv.DictWriter(stream, fieldnames=list(records[0]))
            writer.writeheader()
            writer.writerows(records)
        print(f'{len(records)} runs, {sum(r["status"] == "EMPTY" for r in records)} empty: {output}')
    return records


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--generated-tests-root', default='src/generatedTest/suites')
    parser.add_argument('--report-root', default='reports/data')
    args = parser.parse_args()
    summarize(suites=args.generated_tests_root, report_root=args.report_root)
