"""Scope and incremental-experiment checks; no model requests."""
import csv
import json
import tempfile
import hashlib
import unittest
from pathlib import Path
from unittest.mock import patch

import pandas as pd

from analyze_test_quality import get_jacoco_metrics, execute_gradle_analysis
from analyze_trace_similarity import compare_traces
from research_workflow import suite_inventory, validate_frozen_runs


class FamilyTests(unittest.TestCase):
    def test_finished_empty_run_is_reused_and_changed_config_is_rejected(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/p/Case.java'
            adapter = repo / 'scripts/llm_generator.py'
            source.parent.mkdir(parents=True)
            adapter.parent.mkdir(parents=True)
            source.write_text('package p; public class Case {}')
            adapter.write_text('# frozen adapter')
            run = repo / 'suites/QwenLLM/Case/1800/run1-seed101'
            run.mkdir(parents=True)
            config = {'model': 'fixture'}
            item = {'target': 'p.Case', 'protocol': 'qwen-focused-repair-v4', 'config': config,
                    'fingerprint': {'adapterSha256': hashlib.sha256(adapter.read_bytes()).hexdigest()},
                    'sourceSha256': hashlib.sha256(source.read_bytes()).hexdigest(), 'status': 'EMPTY', 'accepted': 0}
            (run / 'llm-run.json').write_text(json.dumps(item))
            inventory = {('Case', 101): run}
            self.assertIn(('Case', 101), validate_frozen_runs(inventory, config, repo))
            with self.assertRaisesRegex(ValueError, 'Frozen experiment changed'):
                validate_frozen_runs(inventory, {'model': 'other'}, repo)

    def test_counters_include_nested_and_anonymous_but_not_similar_names(self):
        with tempfile.TemporaryDirectory() as temp:
            path = Path(temp) / 'coverage.xml'
            path.write_text('''<report><package name="p">
              <class name="p/Outer"><counter type="LINE" covered="1" missed="1"/></class>
              <class name="p/Outer$Inner"><counter type="LINE" covered="2" missed="6"/></class>
              <class name="p/Outer$1"><counter type="LINE" covered="1" missed="0"/></class>
              <class name="p/OuterHelper"><counter type="LINE" covered="99" missed="0"/></class>
            </package></report>''')
            self.assertEqual(get_jacoco_metrics(str(path), 'p.Outer')['linePct'], 50)
            self.assertEqual(get_jacoco_metrics(str(path), 'p.Outer', 'class-family')['linePct'], 36.36)

    def test_gradle_gets_explicit_scope(self):
        with tempfile.TemporaryDirectory() as temp, patch('analyze_test_quality.subprocess.run') as run:
            run.return_value.returncode = 0
            execute_gradle_analysis(dict(repo=temp, gradle_cmd='gradlew', work_dir=temp, build_dir=temp,
                                         target_class='p.Outer', pit_tests_pattern='Tests*', scope='class-family'))
            self.assertIn('-PmeasurementScope=class-family', run.call_args.args[0])

    def test_inventory_is_by_seed_and_rejects_duplicate_seed(self):
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            for name in ('run1-seed101', 'run7-seed303'):
                (root / 'QwenLLM/Case/1800' / name).mkdir(parents=True)
            self.assertEqual(set(suite_inventory(root, 'QwenLLM', ['Case'], 1800)), {('Case', 101), ('Case', 303)})
            (root / 'QwenLLM/Case/1800/run8-seed303').mkdir()
            with self.assertRaisesRegex(ValueError, 'Multiple runs'):
                suite_inventory(root, 'QwenLLM', ['Case'], 1800)

    def test_family_pairing_uses_seed_and_checks_coordinates(self):
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            cols = ['program_class', 'generation_time_sec', 'seed', 'test_name', 'coverage_vector', 'run']
            for tool, budget, run in [('evosuite', 120, 2), ('qwenllm', 1800, 7)]:
                pd.DataFrame([['Case', budget, 202, 'test', '1,0', run]], columns=cols).to_csv(root / f'{tool}_test_traces.csv', index=False)
                (root / f'{tool}_test_traces.schema.json').write_text(json.dumps({'scope': 'class-family',
                    'classes': {'Case': {'coordinates': ['p/Case#1', 'p/Case$Inner#2'], 'sourceSha256': 'abc'}}}))
            rows, _, _ = compare_traces(root, None, None, None, 'EvoSuite', 'QwenLLM', 120, 1800)
            self.assertEqual(len(rows), 1)
            self.assertEqual(rows.iloc[0]['seed'], 202)
            self.assertEqual(rows.iloc[0]['mean_max_jaccard'], 1)
            (root / 'qwenllm_test_traces.schema.json').write_text(json.dumps({'scope': 'top-level', 'classes': {}}))
            with self.assertRaisesRegex(ValueError, 'different measurement scopes'):
                compare_traces(root, None, None, None, 'EvoSuite', 'QwenLLM', 120, 1800)


if __name__ == '__main__':
    unittest.main()
