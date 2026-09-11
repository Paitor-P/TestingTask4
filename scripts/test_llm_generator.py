"""Protocol checks without requiring a running model."""
import json
import tempfile
import time
import unittest
from types import SimpleNamespace
from pathlib import Path
from unittest.mock import patch

from llm_generator import extract_java, generate, prompt_for, add_target_import, repair_prompt_for, ensure_protocol_directory, PROTOCOL
from analysis_support import load_experiment_config, PROJECT_ROOT

VALID = '''package com.viktor.lab4.autogen;
public class QwenTest1 {
 @org.junit.Test(timeout=1000) public void test() { org.junit.Assert.assertEquals(1,1); }
}'''


class ProtocolTests(unittest.TestCase):
    def test_previous_protocol_cannot_be_mixed_with_new_runs(self):
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            metadata = root / 'QwenLLM/Target/1800/run1-seed101/llm-run.json'
            metadata.parent.mkdir(parents=True)
            metadata.write_text(json.dumps({'protocol': 'qwen-result-quota-v3'}))
            with self.assertRaisesRegex(ValueError, 'Cannot mix'):
                ensure_protocol_directory(root)
            metadata.write_text(json.dumps({'protocol': PROTOCOL}))
            ensure_protocol_directory(root)

    def test_repair_has_specific_diagnostic_and_no_new_generation_task(self):
        prompt = repair_prompt_for('public class Target {}', 'sample.Target', 'QwenTest2',
                                  VALID, 'JUnit validation failed',
                                  'expected:<42.95> but was:<40.49>\n\tat org.junit.Assert.fail(Assert.java:89)')
        self.assertIn('expected:<42.95> but was:<40.49>', prompt)
        self.assertIn('Keep the inputs', prompt)
        self.assertIn('public class QwenTest2', prompt)
        self.assertNotIn('independent scenario', prompt)
        self.assertNotIn('at org.junit.Assert', prompt)
        self.assertIn('non-static', prompt)

    def test_scenario_focus_is_generic_and_cycles(self):
        first = prompt_for('class Target {}', 'sample.Target', 'QwenTest1', 1)
        second = prompt_for('class Target {}', 'sample.Target', 'QwenTest2', 2)
        self.assertIn('One simple normal case', first)
        self.assertIn('One boundary case', second)
        self.assertNotIn('PricingEngine', first)
        self.assertIn('through an instance', first)

    def test_user_interrupt_is_recorded_not_reported_as_empty(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/sample/Target.java'
            source.parent.mkdir(parents=True)
            source.write_text('package sample; public class Target {}')
            run = repo / 'suites/run1-seed101'
            config = dict(model='test', temperature=.7, top_p=.9, num_ctx=8192,
                          num_predict=100, num_thread=1, max_attempts=1)
            with patch('llm_generator.stream_candidate', side_effect=KeyboardInterrupt):
                with self.assertRaises(KeyboardInterrupt):
                    generate(repo, 'sample.Target', 5, 101, run, {'config': config, 'fingerprint': {}})
            metadata = json.loads((run / 'llm-run.json').read_text())
            self.assertEqual(metadata['status'], 'INTERRUPTED')
            self.assertEqual(metadata['protocol'], PROTOCOL)

    def test_llm_has_separate_budget_and_reference_configuration(self):
        experiment = load_experiment_config(PROJECT_ROOT, 'experiment.toml')
        self.assertEqual(experiment.budgets_for('EvoSuite'), [30, 60, 120])
        self.assertEqual(experiment.budgets_for('QwenLLM'), [1800])
        self.assertEqual(experiment.reference_budgets['Randoop'], 120)

    def test_quota_stops_without_waiting_for_the_safety_ceiling(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/sample/Target.java'
            source.parent.mkdir(parents=True)
            source.write_text('package sample; public class Target {}')
            run = repo / 'suites/run1-seed101'
            context = {'config': {'model': 'test', 'temperature': .7, 'top_p': .9,
                'num_ctx': 8192, 'num_predict': 100, 'num_thread': 1, 'max_attempts': 100,
                'target_accepted_tests': 1, 'validation_repeats': 2, 'validation_timeout_sec': 10},
                'fingerprint': {}, 'javac': 'javac', 'java': 'java', 'classpath': 'unused'}
            good = SimpleNamespace(returncode=0, stdout='OK (1 test)', stderr='')
            with patch('llm_generator.stream_candidate', return_value=(VALID, {})) as model, patch(
                'llm_generator.subprocess.run', return_value=good):
                self.assertEqual(generate(repo, 'sample.Target', 1800, 101, run, context), 'OK')
                self.assertEqual(model.call_count, 1)
            metadata = json.loads((run / 'llm-run.json').read_text())
            self.assertEqual(metadata['stopReason'], 'accepted_test_quota')

    def test_scaffold_adds_only_target_import_and_is_idempotent(self):
        updated = add_target_import(VALID, 'sample.Target')
        self.assertIn('import sample.Target;', updated)
        self.assertEqual(updated.split('public class', 1)[1], VALID.split('public class', 1)[1])
        self.assertEqual(add_target_import(updated, 'sample.Target'), updated)

    def test_extract_rejects_disabled_and_wrong_class(self):
        self.assertIn('public class', extract_java('```java\n' + VALID + '\n```', 'QwenTest1'))
        for text in (VALID.replace('QwenTest1', 'Wrong'), VALID.replace('@org.junit.Test', '@org.junit.Ignore @org.junit.Test')):
            with self.assertRaises(ValueError):
                extract_java(text, 'QwenTest1')

    def test_prompt_contains_source_and_no_other_tests(self):
        prompt = prompt_for('public class Target {}', 'sample.Target', 'QwenTest1', 1)
        self.assertIn('public class Target {}', prompt)
        self.assertNotIn('RegressionTest', prompt)
        self.assertNotIn('ESTest', prompt)

    def test_timeout_keeps_empty_run_metadata(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/sample/Target.java'
            source.parent.mkdir(parents=True)
            source.write_text('package sample; public class Target {}')
            run = repo / 'suites/run1-seed101'
            context = {'config': {'model': 'test', 'temperature': .7, 'top_p': .9,
                'num_ctx': 8192, 'num_predict': 100, 'num_thread': 1, 'max_attempts': 1},
                'fingerprint': {}}
            with patch('llm_generator.stream_candidate', side_effect=TimeoutError('deadline')):
                self.assertEqual(generate(repo, 'sample.Target', 1, 101, run, context), 'EMPTY')
            metadata = json.loads((run / 'llm-run.json').read_text())
            self.assertEqual(metadata['attempts'][0]['status'], 'TIMEOUT')
            self.assertEqual(list(run.rglob('*.java')), [])

    def test_validation_failure_never_publishes_candidate(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/sample/Target.java'
            source.parent.mkdir(parents=True)
            source.write_text('package sample; public class Target {}')
            run = repo / 'suites/run1-seed101'
            context = {'config': {'model': 'test', 'temperature': .7, 'top_p': .9,
                'num_ctx': 8192, 'num_predict': 100, 'num_thread': 1, 'max_attempts': 1,
                'validation_repeats': 2, 'validation_timeout_sec': 10},
                'fingerprint': {}, 'javac': 'javac', 'java': 'java', 'classpath': 'unused'}
            with patch('llm_generator.stream_candidate', return_value=(VALID, {'done_reason': 'stop'})), patch(
                'llm_generator.subprocess.run', return_value=SimpleNamespace(returncode=1, stdout='', stderr='compile error')):
                self.assertEqual(generate(repo, 'sample.Target', 5, 101, run, context), 'EMPTY')
            self.assertFalse(list(run.rglob('*.java')))
            self.assertIn('compile error', (run / 'audit/validation-1-0.txt').read_text())

    def test_repair_uses_feedback_and_keeps_original_failure(self):
        with tempfile.TemporaryDirectory() as temp:
            repo = Path(temp)
            source = repo / 'src/main/java/sample/Target.java'
            source.parent.mkdir(parents=True)
            source.write_text('package sample; public class Target {}')
            run = repo / 'suites/run1-seed101'
            context = {'config': {'model': 'test', 'temperature': .7, 'top_p': .9,
                'num_ctx': 8192, 'num_predict': 100, 'num_thread': 1, 'max_attempts': 2,
                'max_repairs': 2, 'validation_repeats': 2, 'validation_timeout_sec': 10},
                'fingerprint': {}, 'javac': 'javac', 'java': 'java', 'classpath': 'unused'}
            bad = SimpleNamespace(returncode=1, stdout='', stderr='missing symbol')
            good = SimpleNamespace(returncode=0, stdout='OK (1 test)', stderr='')
            with patch('llm_generator.stream_candidate', side_effect=[(VALID, {}), (VALID.replace('QwenTest1', 'QwenTest2'), {})]), patch(
                'llm_generator.subprocess.run', side_effect=[bad, good, good, good]):
                self.assertEqual(generate(repo, 'sample.Target', 10, 101, run, context), 'OK')
            metadata = json.loads((run / 'llm-run.json').read_text())
            self.assertEqual([r['status'] for r in metadata['attempts']], ['REJECTED', 'ACCEPTED'])
            self.assertEqual(metadata['attempts'][1]['phase'], 'repair')
            request = json.loads((run / 'audit/request-2.json').read_text())
            self.assertIn('missing symbol', request['prompt'])
            self.assertEqual(len(list(run.rglob('*.java'))), 1)


if __name__ == '__main__':
    unittest.main()
