from __future__ import annotations

import argparse
import json
from pathlib import Path
from typing import Iterable

import pandas as pd
import matplotlib.pyplot as plt


def repo_root() -> Path:
    return Path(__file__).resolve().parents[1]


def reports_dir() -> Path:
    return repo_root() / "reports"


def output_dir_path(base_output: Path | None) -> Path:
    if base_output is None:
        return repo_root() / "py" / "generated_results"
    return base_output


def ensure_columns(df: pd.DataFrame, required: Iterable[str], name: str) -> None:
    missing = [col for col in required if col not in df.columns]
    if missing:
        raise ValueError(f"Missing columns in {name}: {missing}")


def read_csv(path: Path, name: str) -> pd.DataFrame:
    if not path.exists():
        raise FileNotFoundError(f"File not found: {path}")
    df = pd.read_csv(path)
    if df.empty:
        raise ValueError(f"Empty CSV: {name}")
    return df


def apply_plot_style() -> None:
    plt.rcParams.update(
        {
            "figure.dpi": 120,
            "savefig.dpi": 120,
            "font.size": 10,
            "axes.titlesize": 12,
            "axes.labelsize": 10,
            "legend.fontsize": 9,
            "axes.grid": True,
            "grid.alpha": 0.3,
        }
    )


def save_table(df: pd.DataFrame, path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    df.to_csv(path, index=False)


def write_notebook(notebook_path: Path, tables: list[tuple[str, Path]], output_dir: Path) -> None:
    notebook_path.parent.mkdir(parents=True, exist_ok=True)

    cells = [
        {
            "cell_type": "markdown",
            "metadata": {},
            "source": ["# Tables for Results\n"],
        },
        {
            "cell_type": "code",
            "metadata": {},
            "source": ["import pandas as pd\n"],
            "execution_count": None,
            "outputs": [],
        },
    ]

    for title, csv_path in tables:
        rel_path = csv_path.relative_to(output_dir)
        cells.append(
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [f"## {title}\n"],
            }
        )
        cells.append(
            {
                "cell_type": "code",
                "metadata": {},
                "source": [
                    f"df = pd.read_csv(r'{rel_path.as_posix()}')\n",
                    "df\n",
                ],
                "execution_count": None,
                "outputs": [],
            }
        )

    notebook = {
        "cells": cells,
        "metadata": {
            "kernelspec": {"display_name": "Python 3", "language": "python", "name": "python3"},
            "language_info": {"name": "python"},
        },
        "nbformat": 4,
        "nbformat_minor": 5,
    }

    notebook_path.write_text(json.dumps(notebook, indent=2), encoding="utf-8")


def load_summary_aggregated() -> pd.DataFrame:
    reports = reports_dir()
    evo_path = reports / "summary-quality-aggregated__tools-EvoSuite__cases-all__budgets-all__runs-all.csv"
    ran_path = reports / "summary-quality-aggregated__tools-Randoop__cases-all__budgets-all__runs-all.csv"
    evo = read_csv(evo_path, "summary-quality-aggregated EvoSuite")
    ran = read_csv(ran_path, "summary-quality-aggregated Randoop")
    return pd.concat([evo, ran], ignore_index=True)


def load_summary_raw() -> pd.DataFrame:
    reports = reports_dir()
    evo_path = reports / "summary-quality__tools-EvoSuite__cases-all__budgets-all__runs-all.csv"
    ran_path = reports / "summary-quality__tools-Randoop__cases-all__budgets-all__runs-all.csv"
    evo = read_csv(evo_path, "summary-quality EvoSuite")
    ran = read_csv(ran_path, "summary-quality Randoop")
    return pd.concat([evo, ran], ignore_index=True)


def load_similarity_aggregated() -> pd.DataFrame:
    path = reports_dir() / "trace_similarity__tools-EvoSuite-Randoop__classes-all__times-all__runs-all_aggregated.csv"
    return read_csv(path, "trace_similarity_aggregated")


def load_similarity_exclusive() -> pd.DataFrame:
    path = reports_dir() / "trace_similarity__tools-EvoSuite-Randoop__classes-all__times-all__runs-all_exclusive.csv"
    return read_csv(path, "trace_similarity_exclusive")


def ordered_unique(values: Iterable) -> list:
    seen = []
    for value in values:
        if value not in seen:
            seen.append(value)
    return seen


def plot_grouped_bar_tool_metric(
    df: pd.DataFrame, case_name: str, output_path: Path, title: str
) -> None:
    metrics = [
        ("meanLineCoveragePct", "Line"),
        ("meanBranchCoveragePct", "Branch"),
        ("meanInstructionCoveragePct", "Instruction"),
    ]
    ensure_columns(df, ["tool", "budgetSec"] + [m[0] for m in metrics], f"{case_name} coverage")

    budgets = sorted(df["budgetSec"].unique())
    tools = ordered_unique(df["tool"].tolist())

    metric_colors = {
        "Line": "#1f77b4",
        "Branch": "#ff7f0e",
        "Instruction": "#2ca02c",
    }
    tool_hatches = {"EvoSuite": "//", "Randoop": ".."}

    series_count = len(metrics) * len(tools)
    bar_width = 0.8 / series_count
    x_positions = list(range(len(budgets)))

    plt.figure(figsize=(10, 6))

    offset = -0.4 + bar_width / 2
    for metric_col, metric_label in metrics:
        for tool in tools:
            values = []
            for budget in budgets:
                match = df[(df["tool"] == tool) & (df["budgetSec"] == budget)]
                values.append(match[metric_col].iloc[0] if not match.empty else 0)

            label = f"{tool} {metric_label}"
            plt.bar(
                [x + offset for x in x_positions],
                values,
                width=bar_width,
                label=label,
                color=metric_colors[metric_label],
                hatch=tool_hatches.get(tool, ""),
                edgecolor="black",
            )
            offset += bar_width

    plt.title(title)
    plt.xlabel("Budget (sec)")
    plt.ylabel("Coverage (%)")
    plt.xticks(x_positions, [str(b) for b in budgets])
    plt.ylim(0, 100)
    plt.legend(ncol=2)
    output_path.parent.mkdir(parents=True, exist_ok=True)
    plt.tight_layout()
    plt.savefig(output_path)
    plt.close()


def plot_grouped_bar(
    df: pd.DataFrame,
    x_col: str,
    series_col: str,
    value_col: str,
    output_path: Path,
    title: str,
    y_label: str,
    y_limit: tuple[float, float] | None = None,
) -> None:
    ensure_columns(df, [x_col, series_col, value_col], title)
    x_values = ordered_unique(df[x_col].tolist())
    series_values = ordered_unique(df[series_col].tolist())

    series_count = len(series_values)
    bar_width = 0.8 / max(series_count, 1)
    x_positions = list(range(len(x_values)))

    plt.figure(figsize=(10, 6))
    offset = -0.4 + bar_width / 2

    for series in series_values:
        values = []
        for x_val in x_values:
            match = df[(df[x_col] == x_val) & (df[series_col] == series)]
            values.append(match[value_col].iloc[0] if not match.empty else 0)
        plt.bar(
            [x + offset for x in x_positions],
            values,
            width=bar_width,
            label=str(series),
            edgecolor="black",
        )
        offset += bar_width

    plt.title(title)
    plt.xlabel(x_col)
    plt.ylabel(y_label)
    plt.xticks(x_positions, [str(v) for v in x_values])
    if y_limit:
        plt.ylim(*y_limit)
    plt.legend(title=series_col)
    output_path.parent.mkdir(parents=True, exist_ok=True)
    plt.tight_layout()
    plt.savefig(output_path)
    plt.close()


def plot_line(
    df: pd.DataFrame,
    x_col: str,
    y_col: str,
    series_col: str,
    output_path: Path,
    title: str,
    y_label: str,
    y_limit: tuple[float, float] | None = None,
) -> None:
    ensure_columns(df, [x_col, y_col, series_col], title)
    series_values = ordered_unique(df[series_col].tolist())

    plt.figure(figsize=(10, 6))
    for series in series_values:
        subset = df[df[series_col] == series].sort_values(x_col)
        plt.plot(
            subset[x_col],
            subset[y_col],
            marker="o",
            label=str(series),
        )

    plt.title(title)
    plt.xlabel(x_col)
    plt.ylabel(y_label)
    if y_limit:
        plt.ylim(*y_limit)
    plt.legend(title=series_col)
    output_path.parent.mkdir(parents=True, exist_ok=True)
    plt.tight_layout()
    plt.savefig(output_path)
    plt.close()


def plot_stacked_bar(
    df: pd.DataFrame,
    x_col: str,
    value_cols: list[str],
    output_path: Path,
    title: str,
    y_label: str,
) -> None:
    ensure_columns(df, [x_col] + value_cols, title)
    x_values = ordered_unique(df[x_col].tolist())

    plt.figure(figsize=(10, 6))
    bottoms = [0] * len(x_values)
    for value_col in value_cols:
        values = [df[df[x_col] == x_val][value_col].iloc[0] for x_val in x_values]
        plt.bar(x_values, values, bottom=bottoms, label=value_col.replace("_", " "))
        bottoms = [b + v for b, v in zip(bottoms, values)]

    plt.title(title)
    plt.xlabel(x_col)
    plt.ylabel(y_label)
    plt.legend()
    output_path.parent.mkdir(parents=True, exist_ok=True)
    plt.tight_layout()
    plt.savefig(output_path)
    plt.close()


def generate_tables_and_plots(output_dir: Path) -> None:
    apply_plot_style()

    summary_agg = load_summary_aggregated()
    summary_raw = load_summary_raw()
    similarity_agg = load_similarity_aggregated()
    similarity_excl = load_similarity_exclusive()

    tables_dir = output_dir / "tables"
    figures_dir = output_dir / "figures"
    notebook_path = output_dir / "notebook" / "tables.ipynb"

    tables = []

    rq1_cases = [
        "LongestIncreasingSubsequence",
        "LruCache",
        "PricingEngine",
        "SimpleJsonParser",
    ]

    for idx, case_name in enumerate(rq1_cases, start=1):
        df_case = summary_agg[summary_agg["case"] == case_name].copy()
        ensure_columns(
            df_case,
            [
                "tool",
                "budgetSec",
                "meanLineCoveragePct",
                "meanBranchCoveragePct",
                "meanInstructionCoveragePct",
            ],
            f"RQ1 {case_name}",
        )
        df_case = df_case[
            [
                "tool",
                "budgetSec",
                "meanLineCoveragePct",
                "meanBranchCoveragePct",
                "meanInstructionCoveragePct",
            ]
        ].sort_values(["tool", "budgetSec"])
        table_path = tables_dir / f"table_5_{idx}_{case_name}.csv"
        save_table(df_case, table_path)
        tables.append((f"Table 5.{idx} — {case_name}", table_path))

        fig_path = figures_dir / f"figure_5_{idx}_coverage_{case_name}.png"
        plot_grouped_bar_tool_metric(
            df_case,
            case_name,
            fig_path,
            title=f"Coverage Metrics — {case_name}",
        )

    df_tool_summary = summary_agg.groupby("tool", as_index=False).agg(
        {
            "meanLineCoveragePct": "mean",
            "meanBranchCoveragePct": "mean",
            "meanInstructionCoveragePct": "mean",
        }
    )
    df_tool_summary = df_tool_summary[
        [
            "tool",
            "meanLineCoveragePct",
            "meanBranchCoveragePct",
            "meanInstructionCoveragePct",
        ]
    ]
    table_path = tables_dir / "table_5_5_coverage_summary.csv"
    save_table(df_tool_summary, table_path)
    tables.append(("Table 5.5 — Coverage Summary", table_path))

    df_mutation = summary_agg[
        ["case", "tool", "budgetSec", "meanMutationScorePct"]
    ].sort_values(["case", "tool", "budgetSec"])
    table_path = tables_dir / "table_5_6_mutation_score.csv"
    save_table(df_mutation, table_path)
    tables.append(("Table 5.6 — Mutation Score by Class", table_path))

    df_mutant_analysis = summary_raw.groupby("tool", as_index=False).agg(
        {
            "mutationsTotal": "mean",
            "mutationsKilled": "mean",
            "mutationsSurvived": "mean",
            "mutationsNoCoverage": "mean",
        }
    )
    table_path = tables_dir / "table_5_7_mutant_analysis.csv"
    save_table(df_mutant_analysis, table_path)
    tables.append(("Table 5.7 — Mutant Analysis", table_path))

    df_mutation_avg = (
        summary_agg.groupby(["case", "tool"], as_index=False)["meanMutationScorePct"].mean()
    )
    fig_path = figures_dir / "figure_5_5_mutation_score_by_class.png"
    plot_grouped_bar(
        df_mutation_avg,
        x_col="case",
        series_col="tool",
        value_col="meanMutationScorePct",
        output_path=fig_path,
        title="Mutation Score by Class",
        y_label="Mutation Score (%)",
        y_limit=(0, 100),
    )

    for case_name in rq1_cases:
        df_case = summary_agg[summary_agg["case"] == case_name].copy()
        fig_path = figures_dir / f"figure_5_6_coverage_vs_budget_{case_name}.png"
        plot_line(
            df_case,
            x_col="budgetSec",
            y_col="meanLineCoveragePct",
            series_col="tool",
            output_path=fig_path,
            title=f"Coverage vs Generation Budget — {case_name}",
            y_label="Line Coverage (%)",
            y_limit=(0, 100),
        )

        fig_path = figures_dir / f"figure_5_7_mutation_vs_budget_{case_name}.png"
        plot_line(
            df_case,
            x_col="budgetSec",
            y_col="meanMutationScorePct",
            series_col="tool",
            output_path=fig_path,
            title=f"Mutation Score vs Generation Budget — {case_name}",
            y_label="Mutation Score (%)",
            y_limit=(0, 100),
        )

        fig_path = figures_dir / f"figure_5_8_tests_vs_budget_{case_name}.png"
        plot_line(
            df_case,
            x_col="budgetSec",
            y_col="meanTestsExecuted",
            series_col="tool",
            output_path=fig_path,
            title=f"Tests Executed vs Generation Budget — {case_name}",
            y_label="Tests Executed",
        )

    df_jaccard = similarity_agg[["program_class", "generation_time_sec", "mean_max_jaccard"]].copy()
    table_path = tables_dir / "table_5_8_jaccard.csv"
    save_table(df_jaccard, table_path)
    tables.append(("Table 5.8 — Jaccard Similarity", table_path))

    df_dice = similarity_agg[["program_class", "generation_time_sec", "mean_max_dice"]].copy()
    table_path = tables_dir / "table_5_9_dice.csv"
    save_table(df_dice, table_path)
    tables.append(("Table 5.9 — Dice Similarity", table_path))

    df_excl = similarity_excl.groupby(
        ["program_class", "generation_time_sec"], as_index=False
    ).agg(
        {
            "shared_lines": "mean",
            "evosuite_exclusive": "mean",
            "randoop_exclusive": "mean",
        }
    )
    table_path = tables_dir / "table_5_10_exclusive_coverage.csv"
    save_table(df_excl, table_path)
    tables.append(("Table 5.10 — Exclusive Coverage", table_path))

    fig_path = figures_dir / "figure_5_9_jaccard_similarity.png"
    plot_grouped_bar(
        df_jaccard,
        x_col="program_class",
        series_col="generation_time_sec",
        value_col="mean_max_jaccard",
        output_path=fig_path,
        title="Jaccard Similarity",
        y_label="Mean Jaccard",
    )

    fig_path = figures_dir / "figure_5_10_dice_similarity.png"
    plot_grouped_bar(
        df_dice,
        x_col="program_class",
        series_col="generation_time_sec",
        value_col="mean_max_dice",
        output_path=fig_path,
        title="Dice Similarity",
        y_label="Mean Dice",
    )

    df_excl_avg = df_excl.groupby("program_class", as_index=False).agg(
        {
            "shared_lines": "mean",
            "evosuite_exclusive": "mean",
            "randoop_exclusive": "mean",
        }
    )
    fig_path = figures_dir / "figure_5_11_exclusive_coverage.png"
    plot_stacked_bar(
        df_excl_avg,
        x_col="program_class",
        value_cols=["shared_lines", "evosuite_exclusive", "randoop_exclusive"],
        output_path=fig_path,
        title="Exclusive Coverage Analysis",
        y_label="Lines",
    )

    write_notebook(notebook_path, tables, output_dir)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Generate tables and charts for research results.")
    parser.add_argument(
        "--output-dir",
        type=Path,
        default=None,
        help="Output directory for tables, figures, and notebook.",
    )
    return parser.parse_args()


def main() -> None:
    args = parse_args()
    output_dir = output_dir_path(args.output_dir)
    generate_tables_and_plots(output_dir)
    print(f"Generated tables and figures in: {output_dir}")


if __name__ == "__main__":
    main()

