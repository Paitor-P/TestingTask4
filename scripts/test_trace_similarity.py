"""Regression tests for the set-level trace-similarity calculation."""

import math
import sys
import unittest
import tempfile
from pathlib import Path

import numpy as np
import pandas as pd

sys.path.insert(0, str(Path(__file__).parent))

from analyze_trace_similarity import compute_group_similarity, compare_traces


class GroupSimilarityTests(unittest.TestCase):
    def test_reference_comparison_does_not_require_equal_budgets(self):
        with tempfile.TemporaryDirectory() as temp:
            directory = Path(temp)
            columns = ['program_class', 'generation_time_sec', 'seed', 'test_name', 'coverage_vector', 'run']
            pd.DataFrame([['Case', 120, 101, 'a', '1,0', 1], ['Case', 30, 101, 'a', '0,1', 1]], columns=columns).to_csv(directory / 'evosuite_test_traces.csv', index=False)
            pd.DataFrame([['Case', 1800, 101, 'b', '1,0', 1]], columns=columns).to_csv(directory / 'qwenllm_test_traces.csv', index=False)
            detail, summary, _ = compare_traces(directory, None, None, None, 'EvoSuite', 'QwenLLM', 120, 1800)
            self.assertEqual(len(detail), 1)
            self.assertEqual(summary.iloc[0]['mean_max_jaccard'], 1)
            self.assertEqual(summary.iloc[0]['tool_a_budget_sec'], 120)
            self.assertEqual(summary.iloc[0]['tool_b_budget_sec'], 1800)

    def test_new_pair_uses_own_file_and_only_observed_pairs(self):
        with tempfile.TemporaryDirectory() as temp:
            directory = Path(temp)
            columns = ['program_class', 'generation_time_sec', 'seed', 'test_name', 'coverage_vector', 'run']
            pd.DataFrame([['Case', 30, 101, 'a', '1,0', 1], ['Case', 30, 202, 'a', '0,1', 2]], columns=columns).to_csv(directory / 'evosuite_test_traces.csv', index=False)
            pd.DataFrame([['Case', 30, 101, 'b', '1,0', 1]], columns=columns).to_csv(directory / 'qwenllm_test_traces.csv', index=False)
            detail, summary, exclusive = compare_traces(directory, None, None, None, 'EvoSuite', 'QwenLLM')
            self.assertEqual(len(detail), 1)
            self.assertEqual(detail.iloc[0]['tool_b'], 'QwenLLM')
            self.assertEqual(summary.iloc[0]['mean_max_jaccard'], 1)
            self.assertIn('tool_a_exclusive', exclusive.columns)

    def test_best_match_average_is_symmetric(self) -> None:
        # The two sets deliberately have different sizes, which exposed the
        # former one-direction-only aggregation.
        evo = np.array([[1, 0], [0, 1]], dtype=np.int8)
        randoop = np.array([[1, 0]], dtype=np.int8)

        forward = compute_group_similarity("Case", 30, 1, 101, evo, randoop)
        reversed_ = compute_group_similarity("Case", 30, 1, 101, randoop, evo)

        self.assertEqual(forward.evosuite_to_randoop_jaccard, 0.5)
        self.assertEqual(forward.randoop_to_evosuite_jaccard, 1.0)
        self.assertEqual(forward.mean_max_jaccard, 0.75)
        self.assertEqual(forward.mean_max_jaccard, reversed_.mean_max_jaccard)
        self.assertEqual(forward.mean_max_dice, reversed_.mean_max_dice)

    def test_missing_suite_has_zero_similarity(self) -> None:
        evo = np.array([[1, 0]], dtype=np.int8)
        empty = np.zeros((0, 2), dtype=np.int8)

        result = compute_group_similarity("Case", 30, 1, 101, evo, empty)

        self.assertEqual(result.mean_max_jaccard, 0.0)
        self.assertEqual(result.mean_max_dice, 0.0)
        self.assertEqual(result.evosuite_to_randoop_jaccard, 0.0)
        self.assertTrue(math.isnan(result.randoop_to_evosuite_jaccard))


if __name__ == "__main__":
    unittest.main()
