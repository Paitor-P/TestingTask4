# Развёртывание и воспроизведение эксперимента

Этот документ описывает воспроизведение сравнения EvoSuite, Randoop и QwenLLM
после чистого клонирования репозитория. Основной воспроизводимый сценарий повторно
измеряет сохранённые наборы тестов. Повторная генерация Qwen существенно дороже и
описана отдельно.

## Ветки и состав данных

- `main` содержит исходный код, скрипты и сохранённые наборы тестов, но не
  содержит рассчитанные CSV, трассы, таблицы и графики. Это основная ветка для
  разработки и независимого пересчёта.
- `experiment-results` дополнительно содержит результаты выполнения
  аналитических скриптов. Эту ветку удобно использовать для проверки готовых
  чисел, а не для независимого пересчёта.

Для независимой проверки результатов начинайте с `main`.

## Требования

Команды ниже рассчитаны на Windows PowerShell. Нужны:

- Git;
- 64-битный JDK 17;
- Python 3.14 или новее;
- `uv` для установки зафиксированных Python-зависимостей;
- доступ в интернет при первом запуске Gradle и при установке Ollama;
- достаточно свободного места: сборка и анализ всех серий создают более 1 ГБ
  временных файлов; Ollama и модель требуют ещё несколько гигабайт.

Gradle устанавливать отдельно не требуется: в репозитории находится wrapper.
JAR-файлы EvoSuite и Randoop также хранятся в репозитории.

## Клонирование и подготовка

```powershell
git clone https://github.com/Paitor-P/TestingTask4.git
Set-Location TestingTask4
git switch main

$env:JAVA_HOME = 'C:\path\to\jdk-17'
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"

uv sync --project scripts --locked
.\gradlew.bat --no-daemon clean classes test
```

Проверьте версии и доступность команд:

```powershell
java -version
uv --version
.\gradlew.bat --version
```

Эксперимент рассчитан на JDK 17. Подмена версии Java может изменить совместимость
EvoSuite, Randoop, JaCoCo или PIT и нарушить сопоставимость результатов.

## Зафиксированный дизайн

Файл `experiment.toml` задаёт классы, seed, бюджеты и reference-конфигурации.
Текущий основной срез использует:

- EvoSuite: 120 секунд;
- Randoop: 120 секунд;
- QwenLLM: квота до 10 принятых тестов, защитный предел 1800 секунд;
- seed: `101, 202, 303, 404, 505, 606, 707, 808, 909, 10010`;
- область измерения `class-family`: внешний класс и принадлежащие ему вложенные,
  анонимные и локальные классы.

Не меняйте `experiment.toml`, `llm.toml`, исследуемые Java-классы или
`scripts/llm_generator.py` внутри одного сравниваемого эксперимента. Метаданные
Qwen содержат контрольные суммы и workflow отклонит смешивание несовместимых
серий.

## Повторный расчёт агрегированных результатов

Сохранённые тесты позволяют повторить измерения без новой генерации. Полный
class-family анализ всех десяти seed запускается так:

```powershell
.\scripts\research.ps1 `
  -Action measure `
  -Seeds 101,202,303,404,505,606,707,808,909,10010 `
  -JavaHome $env:JAVA_HOME
```

Чтобы одновременно пересобрать спектры выполнения и показатели сходства, добавьте
`-WithTraces`. Этот вариант работает заметно дольше, особенно для Randoop:

```powershell
.\scripts\research.ps1 `
  -Action measure `
  -Seeds 101,202,303,404,505,606,707,808,909,10010 `
  -WithTraces `
  -JavaHome $env:JAVA_HOME
```

Каждый запуск создаёт новый каталог
`reports/data/family-measure-<timestamp>/` и не перезаписывает предыдущие
результаты. Успешный запуск заканчивается сообщением `CLASS FAMILY CHECK PASSED`
и создаёт `completion.json` со статусом `PASSED`. Основная объединённая таблица —
`comparison.csv`; детальные и сводные метрики находятся в `quality/`, а при
использовании `-WithTraces` — также в `traces/` и `similarity/`.

Для быстрого контрольного прогона можно передать один seed, например `-Seeds 101`.
Такой прогон проверяет инфраструктуру, но не заменяет полный эксперимент.

## Построение таблиц и графиков

Скрипт построения артефактов читает канонические CSV из `reports/data/`:

```powershell
uv run --project scripts python scripts/build_report_assets.py
```

Результаты появляются в `reports/generated/tables/`,
`reports/generated/figures/` и `reports/generated/notebooks/`. Эти файлы являются
входными данными для отдельного LaTeX-отчёта; сам текст отчёта в репозитории не
хранится.

Если расчёт выполнялся в отдельном timestamp-каталоге, сначала явно выберите
проверенный набор CSV для публикации. Не объединяйте старую область `top-level` с
актуальной областью `class-family` и не подменяйте результаты одного seed средними
по нескольким seed.

## Полная повторная генерация

EvoSuite и Randoop можно запустить через общий генератор:

```powershell
uv run --project scripts python scripts/generate_test_suites.py `
  --tools EvoSuite Randoop `
  --budgets 30 60 120 `
  --seeds 101 202 303 404 505 606 707 808 909 10010 `
  --java-exe "$env:JAVA_HOME\bin\java.exe" `
  --output-root src/generatedTest/reproduction
```

Для Qwen сначала установите зафиксированную portable-версию Ollama и модель:

```powershell
.\scripts\setup_llm.ps1
```

После перезагрузки достаточно запустить
`.\scripts\setup_llm.ps1 -SkipModelPull`. Endpoint и параметры модели находятся в
`llm.toml`. Затем генерация выполняется отдельно:

```powershell
uv run --project scripts python scripts/generate_test_suites.py `
  --tools QwenLLM `
  --budgets 1800 `
  --seeds 101 202 303 404 505 606 707 808 909 10010 `
  --java-exe "$env:JAVA_HOME\bin\java.exe" `
  --output-root src/generatedTest/reproduction
```

Генерация Qwen недетерминирована даже при одинаковом seed и может занять много
часов. Новые результаты нельзя смешивать с сохранённой v4-серией: анализируйте их
через отдельные `--generated-tests-root` и `--report-root`.

## Проверка целостности результата

Перед использованием чисел в отчёте проверьте:

1. `completion.json` содержит `"status": "PASSED"` и ожидаемые десять seed.
2. В `comparison.csv` присутствуют все три инструмента и четыре целевых класса.
3. Столбец `measurementScope` равен `class-family`.
4. Нет неожиданных `testFailures`, `testSkipped` или пропавших наборов.
5. Для Qwen приведено число успешных, пустых и неудачных генераций, а средние не
   выданы за результаты отсутствующих серий.
6. В публикации указаны версии Git-коммита, JDK, Python, модели и параметры из
   `experiment.toml` и `llm.toml`.

Подробное значение CSV-столбцов описано в `docs/CSV_COLUMNS_REFERENCE.md`, правила
Qwen — в `docs/LLM_PROTOCOL.md`, а алгоритм сходства — в
`docs/similarity_pseudocode.md`.
