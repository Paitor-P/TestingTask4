# Исследование генерации unit-тестов

Сравнение Randoop и EvoSuite для `LongestIncreasingSubsequence`, `LruCache`, `PricingEngine` и `SimpleJsonParser`. Метрики: покрытие JaCoCo, мутационный анализ PIT и сходство спектров выполнения (Жаккар, Дайс).

## Структура

- `src/main/java/` — исследуемые классы, консольный пример и Java-инструменты сбора трасс.
- `src/main/resources/` — входные данные примеров.
- `src/test/java/` — ручные unit-тесты.
- `src/generatedTest/suites/{Tool}/{Class}/{Budget}/runN-seedS/` — серии генерации, Java-файлы и метаданные генераторов.
- `experiment.toml` — единая конфигурация инструментов, классов, бюджетов и seed для всего эксперимента.
- `scripts/` — Python-скрипты, `pyproject.toml`, `uv.lock` и локальная `.venv/`.
- `tools/` — JAR-файлы генераторов.
- `reports/data/` — исходные результаты экспериментов: журналы генерации, качество, трассы и сходство.
- `reports/generated/` — воспроизводимые таблицы, графики и notebook по исходным CSV.
- `reports/` — текст и экспорт исследовательского отчета.
- `docs/` — описание метрик и столбцов; `docs/archive/` — исторические выводы экспериментов.
- `build/` — временные файлы, подготовленные тесты и результаты Gradle, JaCoCo, PIT.

Серии тестов и результаты экспериментов хранятся в Git. Кэши, окружение Python и результаты сборки игнорируются. Устаревшие PowerShell-реализации заменены Python-скриптами.

## Подготовка

Команды выполняются из корня проекта в PowerShell. Нужны **JDK 17**, **Python 3.14+** и **uv**. Gradle 8.14 запускается через wrapper. Задайте свой JDK 17: системный Java 26 не подходит для этого набора инструментов.

```powershell
$env:JAVA_HOME = 'C:\path\to\jdk-17'
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
uv sync --project scripts --locked
.\gradlew.bat classes
```

LaTeX, TeX Live и MiKTeX не нужны. Matplotlib использует встроенный рендеринг. Необязательный экспорт Markdown-отчета в DOCX: `uv run --project scripts --with python-docx python scripts/export_report_docx.py`.

## Конфигурация эксперимента

`experiment.toml` — источник стандартных инструментов, классов, бюджетов и seed. Его читают генератор, анализ качества и анализ трасс; поэтому полный запуск не требует повторять один и тот же список параметров. У любого скрипта аргументы `--tools`, `--target-classes`, `--cases`, `--budgets` и `--seeds` имеют приоритет над манифестом. Другой файл можно передать через `--experiment-config путь/к/файлу.toml`.

## Генерация тестов

```powershell
uv run --project scripts python scripts/generate_test_suites.py
```

Для предварительного просмотра добавьте `--dry-run`; для выбора классов — `--target-classes com.viktor.lab4.LruCache`. `--java-exe` задает Java генератора. Новые серии получают следующий свободный номер run. Журнал текущего запуска записывается в `reports/data/generation_runs.csv`; dry run — в `reports/data/generation_runs_dry_run.csv`.

## Запуск одной серии в Gradle и IDE

У разных серий повторяются полные имена тестовых классов. Source set `generatedTest` подключает **одну** серию, по умолчанию `Randoop/LongestIncreasingSubsequence/30/run1-seed101`.

```powershell
.\gradlew.bat generatedTest jacocoGeneratedTestReport
.\gradlew.bat generatedTest '-PgeneratedSuite=EvoSuite/LruCache/30/run1-seed101'
```

`-PgeneratedTestsDir=<путь>` имеет приоритет над `generatedSuite`; анализ использует его для подготовленных копий в `build/analysis/work/`. `test` запускает ручные тесты, `generatedTest` — сгенерированные. Ошибки сгенерированных тестов записываются в отчет, но не прерывают Gradle: это данные исследования.

Откройте корневой `build.gradle.kts` как Gradle-проект и выполните **Reload All Gradle Projects**. Модули `main`, `test`, `generatedTest` соответствуют source sets одной сборки. Python-модуль `research-scripts` имеет корень `scripts/` и интерпретатор `scripts/.venv/Scripts/python.exe`. При новом клонировании добавьте этот модуль в IDE вручную. Для выбора серии при импорте IDE задайте `generatedSuite=...` в локальном `gradle.properties` и повторите импорт. Не отмечайте весь каталог suites как единый test source.

## Оценка качества

```powershell
uv run --project scripts python scripts/analyze_test_quality.py --tools EvoSuite
uv run --project scripts python scripts/analyze_test_quality.py --tools Randoop
```

Фильтры: `--cases LruCache`, `--budgets 30 60`, `--runs 1 2`. `--skip-execution` перечитывает существующие результаты сборки. Имена CSV включают фильтры и лежат в `reports/data/quality/`: `quality_runs__...csv` содержит отдельные прогоны, `quality_summary__...csv` — агрегаты. Результаты Gradle находятся в `build/analysis/results/{Tool}/{Class}/{Budget}/runN-seedS/`. Анализы выполняются последовательно: параллельные Gradle/PIT-процессы конкурировали за процессор, память, диск и кэши без выигрыша по общему времени.

## Трассы и итоговые графики

```powershell
uv run --project scripts python scripts/analyze_trace_similarity.py --tools EvoSuite,Randoop
uv run --project scripts python scripts/build_report_assets.py
```

В `analyze_trace_similarity.py` списки передаются через запятую: `--classes LruCache,PricingEngine --budgets 30,60 --runs 1,2`. `--skip-collect` рассчитывает сходство по сохраненным трассам из `reports/data/traces/`. Подробные и агрегированные результаты записываются в `reports/data/similarity/`. `build_report_assets.py` читает полные сводки каждого инструмента и общую сводку сходства; одних результатов с фильтрами недостаточно. `--output-dir` меняет каталог вывода. Notebook `reports/generated/notebooks/research_tables.ipynb` открывается с рабочим каталогом `notebooks`.

Описание: [столбцы CSV](docs/CSV_COLUMNS_REFERENCE.md), [алгоритм сходства](docs/similarity_pseudocode.md).

## Если IDE индексирует TeX Live

Источник — установленный **TeXiFy-IDEA**, а не Java/Python-зависимости проекта. В настройках TeXiFy отключите **Enable indexing of MiKTeX/TeX Live package files (requires restart)** и перезапустите IDE. Это глобальная настройка плагина (`enableExternalIndex=false`), поэтому она не хранится в репозитории.
