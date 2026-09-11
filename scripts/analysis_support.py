"""Shared paths, file naming, and descriptive statistics for research scripts."""

from __future__ import annotations

import math
import re
import tomllib
from dataclasses import dataclass, field
from pathlib import Path
from statistics import mean, stdev, variance
from typing import Iterable


PROJECT_ROOT = Path(__file__).resolve().parents[1]
GENERATED_SUITES_DIR = PROJECT_ROOT / "src" / "generatedTest" / "suites"
REPORTS_DIR = PROJECT_ROOT / "reports"
DATA_DIR = REPORTS_DIR / "data"
GENERATED_REPORT_DIR = REPORTS_DIR / "generated"

# Two-sided 95% Student t critical values for 1..30 degrees of freedom.
_T_CRITICAL_95 = (
    12.706, 4.303, 3.182, 2.776, 2.571, 2.447, 2.365, 2.306, 2.262, 2.228,
    2.201, 2.179, 2.160, 2.145, 2.131, 2.120, 2.110, 2.101, 2.093, 2.086,
    2.080, 2.074, 2.069, 2.064, 2.060, 2.056, 2.052, 2.048, 2.045, 2.042,
)


@dataclass(frozen=True)
class SampleSummary:
    """Descriptive sample statistics and a two-sided 95% CI for its mean.

    Variance and standard deviation use the sample definition (denominator n-1).
    The confidence interval assumes independent runs and an approximately normal
    sampling distribution. A single observation has a mean but cannot estimate
    dispersion or an interval. Student critical values are used through 30
    degrees of freedom and the normal 1.96 approximation for larger samples.
    """

    count: int
    mean: float | None
    variance: float | None
    stddev: float | None
    ci_lower: float | None
    ci_upper: float | None


@dataclass(frozen=True)
class ExperimentConfig:
    """Shared experimental factors loaded from ``experiment.toml``."""

    tools: list[str]
    target_classes: list[str]
    budgets: list[int]
    seeds: list[int]
    tool_budgets: dict[str, list[int]] = field(default_factory=dict)
    reference_budgets: dict[str, int] = field(default_factory=dict)

    def budgets_for(self, tool: str) -> list[int]:
        return self.tool_budgets.get(tool, self.budgets)

    @property
    def cases(self) -> list[str]:
        return [target_class.rsplit(".", 1)[-1] for target_class in self.target_classes]


def load_experiment_config(project_root: Path, value: str | Path) -> ExperimentConfig:
    """Load and validate the small, versioned experiment manifest."""
    config_path = resolve_project_path(project_root, value)
    with config_path.open("rb") as config_file:
        data = tomllib.load(config_file)

    experiment = data.get("experiment")
    if not isinstance(experiment, dict):
        raise ValueError(f"Missing [experiment] table in {config_path}")

    def values(name: str, value_type: type) -> list:
        configured_values = experiment.get(name)
        if not isinstance(configured_values, list) or not configured_values:
            raise ValueError(f"'{name}' in {config_path} must be a non-empty list")
        if not all(isinstance(item, value_type) for item in configured_values):
            raise ValueError(f"All '{name}' values in {config_path} must be {value_type.__name__}")
        return configured_values

    tool_budgets = data.get('tool_budgets', {})
    reference_budgets = data.get('comparison', {}).get('reference_budgets', {})
    for tool, budgets in tool_budgets.items():
        if not isinstance(budgets, list) or not budgets or any(not isinstance(b, int) or b <= 0 for b in budgets):
            raise ValueError(f'Invalid tool-specific budgets for {tool}')
    for tool, budget in reference_budgets.items():
        if not isinstance(budget, int) or budget <= 0:
            raise ValueError(f'Invalid comparison reference budget for {tool}')
    return ExperimentConfig(
        tools=values("tools", str),
        target_classes=values("target_classes", str),
        budgets=values("budgets", int),
        seeds=values("seeds", int),
        tool_budgets=tool_budgets,
        reference_budgets=reference_budgets,
    )


def summarize_sample(values: Iterable[float], digits: int = 6) -> SampleSummary:
    sample = []
    for value in values:
        numeric_value = float(value)
        if math.isfinite(numeric_value):
            sample.append(numeric_value)
    count = len(sample)
    if count == 0:
        return SampleSummary(0, None, None, None, None, None)

    sample_mean = mean(sample)
    if count == 1:
        return SampleSummary(1, round(sample_mean, digits), None, None, None, None)

    sample_variance = variance(sample)
    sample_stddev = stdev(sample)
    degrees_of_freedom = count - 1
    critical_value = (
        _T_CRITICAL_95[degrees_of_freedom - 1]
        if degrees_of_freedom <= len(_T_CRITICAL_95)
        else 1.96
    )
    margin = critical_value * sample_stddev / math.sqrt(count)
    return SampleSummary(
        count=count,
        mean=round(sample_mean, digits),
        variance=round(sample_variance, digits),
        stddev=round(sample_stddev, digits),
        ci_lower=round(sample_mean - margin, digits),
        ci_upper=round(sample_mean + margin, digits),
    )


def filter_token(label: str, values: Iterable[object] | None) -> str:
    """Return a stable, filename-safe description of a CLI filter."""
    if not values:
        return f"{label}-all"
    sanitized = [re.sub(r"[^A-Za-z0-9._-]+", "", str(value)) for value in values]
    return f"{label}-{'-'.join(sanitized)}"


def filtered_csv_path(directory: Path, stem: str, filters: Iterable[str]) -> Path:
    return directory / f"{stem}__{'__'.join(filters)}.csv"


def resolve_project_path(project_root: Path, value: str | Path) -> Path:
    path = Path(value)
    return path if path.is_absolute() else project_root / path
