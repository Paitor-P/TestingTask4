"""Regression tests for the set-level trace-similarity calculation."""

import math
import sys
import unittest
from pathlib import Path

import numpy as np

sys.path.insert(0, str(Path(__file__).parent))

from analyze_trace_similarity import compute_group_similarity


class GroupSimilarityTests(unittest.TestCase):
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
