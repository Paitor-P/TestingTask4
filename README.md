# Исследование генерации unit-тестов

Полное развёртывание после клонирования и порядок воспроизведения результатов:
[EXPERIMENT_REPRODUCTION.md](docs/EXPERIMENT_REPRODUCTION.md).

Текущий рабочий процесс с вложенными классами и добавлением повторов:
[CLASS_FAMILY_WORKFLOW.md](docs/CLASS_FAMILY_WORKFLOW.md).
Пересчёт готовых наборов: `.\scripts\research.ps1 -Action measure -Seeds 101`.
После успешной проверки: `.\scripts\research.ps1 -Action extend -Seeds 202,303`.

Сравнение Randoop, EvoSuite и **QwenLLM** (локальная Qwen2.5-Coder 3B через Ollama) для `LongestIncreasingSubsequence`, `LruCache`, `PricingEngine` и `SimpleJsonParser`. Метрики: покрытие JaCoCo, мутационный анализ PIT и сходство спектров выполнения (Жаккар, Дайс).

QwenLLM — отдельный авторский baseline, не ChatUniTest. Основное сравнение оценивает качество результатов: EvoSuite/Randoop при 120 секундах и Qwen с целью получить 10 проверенных JUnit-сценариев на класс. Для Qwen предусмотрен защитный предел 1800 секунд, но генерация останавливается раньше при достижении цели. Вторичное исследование зависимости от 30/60/120 секунд относится только к EvoSuite и Randoop. Протокол и команды: [LLM_PROTOCOL.md](docs/LLM_PROTOCOL.md).

Первичная установка локального движка и модели: `.\scripts\setup_llm.ps1` (около 3,4 ГБ загрузок, больше места после распаковки). После перезагрузки: `.\scripts\setup_llm.ps1 -SkipModelPull`. Сервер работает на `127.0.0.1:11435`. Конфигурация LLM — `llm.toml`. Для генерации только новым инструментом используйте `--tools QwenLLM`; по умолчанию `experiment.toml` включает все три инструмента.

## Структура

Актуальная проверка **v4** запускается командой `.\scripts\run_qwen_v4.ps1`.
Она выполняет по одной серии (seed 101) для всех четырёх классов, создаёт отдельные
каталоги тестов и журнала и в конце печатает `QWEN V4 BATCH FINISHED`.
Старые результаты v3 остаются в `src/generatedTest/suites/QwenLLM/`.
Подробности запуска и признаков завершения — в [протоколе](docs/LLM_PROTOCOL.md#запуск).

- `src/main/java/` — исследуемые классы, консольный пример и Java-инструменты сбора трасс.
- `src/main/resources/` — входные данные примеров.
- `src/test/java/` — ручные unit-тесты.
- `src/generatedTest/suites/{Tool}/{Class}/{Budget}/runN-seedS/` — серии генерации, Java-файлы и метаданные генераторов.
- `experiment.toml` — единая конфигурация инструментов, классов, бюджетов и seed для всего эксперимента.
- `scripts/` — Python-скрипты, `pyproject.toml`, `uv.lock` и локальная `.venv/`.
- `tools/` — JAR-файлы генераторов.
- `reports/data/` — исходные результаты экспериментов: журналы генерации, качество, трассы и сходство.
- `reports/generated/` — воспроизводимые таблицы, графики и notebook по исходным CSV.
- `reports/` — рассчитанные CSV, таблицы, графики и notebook для отдельного LaTeX-отчёта.
- `docs/` — протокол, порядок воспроизведения и описание метрик.
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

Для выполнения эксперимента LaTeX, TeX Live и MiKTeX не нужны. Matplotlib использует встроенный рендеринг. LaTeX-отчёт оформляется отдельно на основе агрегированных CSV, таблиц и графиков.

## Конфигурация эксперимента

`experiment.toml` — источник стандартных инструментов, классов, бюджетов и seed. Его читают генератор, анализ качества и анализ трасс. `[tool_budgets]` задаёт отдельный предел Qwen, `[comparison.reference_budgets]` — настройки основного сравнения. Доступные у конкретного скрипта CLI-фильтры имеют приоритет над манифестом; их список выводится через `--help`. Другой файл можно передать через `--experiment-config путь/к/файлу.toml`.

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
uv run --project scripts python scripts/analyze_test_quality.py --tools QwenLLM
uv run --project scripts python scripts/summarize_llm_runs.py
```

Фильтры: `--cases LruCache`, `--budgets 30 60`, `--runs 1 2`. `--skip-execution` перечитывает существующие результаты сборки. Имена CSV включают фильтры и лежат в `reports/data/quality/`: `quality_runs__...csv` содержит отдельные прогоны, `quality_summary__...csv` — агрегаты. Результаты Gradle находятся в `build/analysis/results/{Tool}/{Class}/{Budget}/runN-seedS/`. Анализы выполняются последовательно: параллельные Gradle/PIT-процессы конкурировали за процессор, память, диск и кэши без выигрыша по общему времени.

## Трассы и итоговые графики

```powershell
uv run --project scripts python scripts/analyze_trace_similarity.py --tools EvoSuite,Randoop
uv run --project scripts python scripts/build_report_assets.py
```

Чтобы добавить только новые трассы к сохранённым старым: `uv run --project scripts python scripts/analyze_trace_similarity.py --tools QwenLLM --collect-only`, затем `uv run --project scripts python scripts/analyze_trace_similarity.py --tools EvoSuite,Randoop,QwenLLM --skip-collect`. Каждая пара получает отдельный CSV; для новых пар используются только совпадающие доступные серии. Сводки качества условны по успешным измерениям, поэтому рядом обязательно приводить `llm_generation_outcomes.csv` с неудачами и пустыми сериями.

В `analyze_trace_similarity.py` списки передаются через запятую: `--classes LruCache,PricingEngine --budgets 30,60 --runs 1,2`. `--skip-collect` рассчитывает сходство по сохраненным трассам из `reports/data/traces/`. Подробные и агрегированные результаты записываются в `reports/data/similarity/`. `build_report_assets.py` читает полные сводки каждого инструмента и общую сводку сходства; одних результатов с фильтрами недостаточно. `--output-dir` меняет каталог вывода. Notebook `reports/generated/notebooks/research_tables.ipynb` открывается с рабочим каталогом `notebooks`.

Описание: [столбцы CSV](docs/CSV_COLUMNS_REFERENCE.md), [алгоритм сходства](docs/similarity_pseudocode.md).

## Эталонный пример

Эталонные JSON-входы, ожидаемые результаты и ссылки на источники для всех четырёх
классов находятся в `src/test/resources/reference/`. Команда `.\gradlew.bat test`
вычисляет результаты и автоматически сравнивает их с эталонными.

## Если IDE индексирует TeX Live

Источник — установленный **TeXiFy-IDEA**, а не Java/Python-зависимости проекта. В настройках TeXiFy отключите **Enable indexing of MiKTeX/TeX Live package files (requires restart)** и перезапустите IDE. Это глобальная настройка плагина (`enableExternalIndex=false`), поэтому она не хранится в репозитории.
