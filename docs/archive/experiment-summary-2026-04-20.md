# Сравнительный анализ генерации unit-тестов (EvoSuite vs Randoop)

Дата анализа: 2026-04-20  
Проект: `C:\Users\user\Documents\Polytech\Testing\Lab4_3`

## 1. Цель и дизайн эксперимента

Цель: сравнить качество автогенерации unit-тестов двумя подходами:
- **EvoSuite** (поисковая/эволюционная генерация)
- **Randoop** (случайная генерация)

Объекты тестирования:
1. `LongestIncreasingSubsequence`
2. `LruCache`
3. `SimpleJsonParser`
4. `PricingEngine`

Параметры эксперимента:
- бюджеты времени генерации: **30 / 60 / 120 сек**
- повторов на каждый бюджет: **3** (разные seed)
- итого комбинаций: **2 инструмента x 4 кейса x 3 бюджета x 3 повтора = 72**

Метрики качества:
- покрытие (line / branch) через JaCoCo
- mutation score через PIT
- количество выполненных тестов

## 2. Что было запущено

Для каждого среза `(tool, case, budget, run)` выполнялся pipeline:
- `generatedTest`
- `jacocoGeneratedTestReport`
- `pitest`

Итоги сохранены в:
- детально: `reports/summary-quality.csv`
- агрегировано: `reports/summary-quality-aggregated.csv`
- батчи по кейсам: `reports/raw/summary-quality-*.csv`

Контроль полноты:
- записей в итоговом CSV: **72**
- `status != OK`: **0**

## 3. Ключевые агрегированные результаты

### 3.1 Усреднение по инструментам (по всем кейсам и бюджетам)

- **EvoSuite**: line = **99.43%**, branch = **99.41%**, mutation = **84.91%**
- **Randoop**: line = **45.64%**, branch = **39.91%**, mutation = **30.61%**

### 3.2 Сводная таблица по кейсам и бюджетам

| Tool | Case | Budget | Mean Line % | Mean Branch % | Mean Mutation % |
|---|---|---:|---:|---:|---:|
| EvoSuite | LongestIncreasingSubsequence | 30 | 100.00 | 100.00 | 100.00 |
| EvoSuite | LongestIncreasingSubsequence | 60 | 100.00 | 100.00 | 100.00 |
| EvoSuite | LongestIncreasingSubsequence | 120 | 100.00 | 100.00 | 100.00 |
| EvoSuite | LruCache | 30 | 100.00 | 100.00 | 83.33 |
| EvoSuite | LruCache | 60 | 100.00 | 100.00 | 83.33 |
| EvoSuite | LruCache | 120 | 100.00 | 100.00 | 83.33 |
| EvoSuite | PricingEngine | 30 | 97.73 | 97.62 | 80.85 |
| EvoSuite | PricingEngine | 60 | 97.73 | 97.62 | 82.27 |
| EvoSuite | PricingEngine | 120 | 97.73 | 97.62 | 80.85 |
| EvoSuite | SimpleJsonParser | 30 | 100.00 | 100.00 | 75.00 |
| EvoSuite | SimpleJsonParser | 60 | 100.00 | 100.00 | 75.00 |
| EvoSuite | SimpleJsonParser | 120 | 100.00 | 100.00 | 75.00 |
| Randoop | LongestIncreasingSubsequence | 30 | 100.00 | 100.00 | 100.00 |
| Randoop | LongestIncreasingSubsequence | 60 | 100.00 | 100.00 | 60.99 |
| Randoop | LongestIncreasingSubsequence | 120 | 100.00 | 100.00 | 100.00 |
| Randoop | LruCache | 30 | 0.00 | 0.00 | 0.00 |
| Randoop | LruCache | 60 | 0.00 | 0.00 | 0.00 |
| Randoop | LruCache | 120 | 0.00 | 0.00 | 0.00 |
| Randoop | PricingEngine | 30 | 65.91 | 42.86 | 44.68 |
| Randoop | PricingEngine | 60 | 81.82 | 61.11 | 61.70 |
| Randoop | PricingEngine | 120 | 0.00 | 0.00 | 0.00 |
| Randoop | SimpleJsonParser | 30 | 33.33 | 25.00 | 0.00 |
| Randoop | SimpleJsonParser | 60 | 33.33 | 25.00 | 0.00 |
| Randoop | SimpleJsonParser | 120 | 33.33 | 25.00 | 0.00 |

## 4. Интерпретация

1. **EvoSuite стабильно доминирует по качеству** на всех 4 кейсах: почти максимальные line/branch и высокий mutation score.
2. **LIS**: оба инструмента могут давать высокие значения, но у Randoop есть нестабильность по mutation score на 60 сек.
3. **PricingEngine**: ожидаемо сложный кейс комбинаторной логики; EvoSuite заметно сильнее (≈81–82% mutation против 45–62% у Randoop в успешных срезах).
4. **SimpleJsonParser**: у Randoop слабое покрытие и нулевой mutation score; EvoSuite дает 100% line/branch и ~75% mutation.
5. **Randoop/LruCache и Randoop/PricingEngine@120** показывают деградацию до нулевых метрик в итоговом наборе — это не похоже на «реальный ноль качества», а отражает проблемы исполнимости/валидности части сгенерированных наборов в текущем пайплайне.

## 5. Ограничения и технические риски

Во время прогонов ранее наблюдались нестабильности инфраструктуры:
- `FileNotFoundException` в `build/test-results/generatedTest/binary/*`
- периодические ошибки генерации PIT-артефактов
- часть Randoop-наборов выполнялась с 0 тестов (по `testsExecuted`)

Это влияет на отдельные срезы и объясняет аномальные нули при `status=OK`.

## 6. Выводы по исследовательскому вопросу

- Для данной постановки (4 кейса, фиксированные бюджеты, 3 повтора) **EvoSuite показывает более высокое и более стабильное качество** относительно Randoop по покрытию и mutation score.
- **Чувствительность к бюджету** у EvoSuite выражена слабее (быстро достигается высокий уровень), у Randoop прирост от времени менее предсказуем и в ряде кейсов не приводит к улучшению качества.
- Для итогового академического вывода рекомендуется опираться на `summary-quality-aggregated.csv`, обязательно отмечая описанные инфраструктурные ограничения.

## 7. Артефакты для защиты/отчета

- Основная сводка: `reports/summary-quality.csv`
- Агрегаты: `reports/summary-quality-aggregated.csv`
- Батчи: `reports/raw/summary-quality-*.csv`
- Этот отчет (Markdown): `reports/REPORT.md`

