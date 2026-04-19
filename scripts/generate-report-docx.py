from pathlib import Path

from docx import Document


def main() -> None:
    repo = Path(__file__).resolve().parents[1]
    md_path = repo / "reports" / "REPORT.md"
    docx_path = repo / "reports" / "REPORT.docx"

    text = md_path.read_text(encoding="utf-8")
    doc = Document()

    for raw in text.splitlines():
        line = raw.rstrip()
        if not line:
            doc.add_paragraph("")
            continue

        if line.startswith("# "):
            doc.add_heading(line[2:].strip(), level=1)
            continue
        if line.startswith("## "):
            doc.add_heading(line[3:].strip(), level=2)
            continue
        if line.startswith("### "):
            doc.add_heading(line[4:].strip(), level=3)
            continue

        # Keep markdown table rows and bullets as plain text for fidelity.
        p = doc.add_paragraph(line)
        if line.startswith("- ") or line[:2].isdigit() and line[1:3] == ". ":
            p.style = "List Bullet"

    doc.save(docx_path)
    print(f"DOCX generated: {docx_path}")


if __name__ == "__main__":
    main()

