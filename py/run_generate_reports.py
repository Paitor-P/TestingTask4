from pathlib import Path

from generate_reports import generate_tables_and_plots


def main() -> None:
    output_dir = Path(__file__).resolve().parent / "generated_results"
    generate_tables_and_plots(output_dir)
    print(f"Generated tables and figures in: {output_dir}")


if __name__ == "__main__":
    main()

