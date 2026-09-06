# Псевдокод расчёта метрик сходства (Жаккар, Сёренсен–Дайс)

Идея: каждый тест имеет бинарный вектор покрытия `coverage_vector` (0/1). Для каждой группы
`(program_class, generation_time_sec, run)` сравниваются все тесты EvoSuite со всеми тестами Randoop.
Итоговая метрика группы — это среднее по EvoSuite‑тестам от их **максимального** сходства с любым Randoop‑тестом.

Это направленная метрика покрытия одного набора другим. Она отвечает на вопрос
«насколько хорошо для каждого теста EvoSuite находится аналог среди тестов
Randoop». Хотя Жаккар и Дайс симметричны для одной пары, операция «максимум для
каждого теста, затем среднее» не симметрична для наборов разного размера.
Перестановка EvoSuite и Randoop поэтому может дать другое значение. Для
симметричной оценки можно отдельно вычислить оба направления и усреднить их,
но текущий отчёт этого не делает.

## Метрики для пары тестов (два бинарных вектора)
Пусть `A` и `B` — множества покрытых элементов (позиции с 1), либо бинарные векторы.

- **Жаккар**: `J = |A ∩ B| / |A ∪ B|`, где `|A ∪ B| = |A| + |B| − |A ∩ B|`
- **Сёренсен–Дайс**: `D = 2·|A ∩ B| / (|A| + |B|)`

Если знаменатель равен 0 (оба покрытия пустые), в проекте возвращается `0`.

## Псевдокод (как в проекте)
```text
# Вход: таблицы EvoSuiteTests и RandoopTests для фиксированной группы
# Каждая строка: coverage_vector = строка вида "0,1,0,1,..."

function parse_vector(s):             # s = строка coverage_vector
    if s is empty:
        return []
    v = parse comma-separated ints from s   # v = числа из строки
    return to_bool(v)                       # всё ненулевое -> 1, иначе 0

function jaccard(A, B):               # A,B = покрытия двух тестов
    inter = count(A & B)              # inter = |A ∩ B|
    union = count(A) + count(B) - inter  # union = |A ∪ B|
    if union == 0: return 0
    return inter / union

function dice(A, B):                  # A,B = покрытия двух тестов
    inter = count(A & B)              # inter = |A ∩ B|
    denom = count(A) + count(B)       # denom = |A| + |B|
    if denom == 0: return 0
    return (2 * inter) / denom

function compute_group_similarity(EvoSuiteTests, RandoopTests):
    E = [parse_vector(t.coverage_vector) for t in EvoSuiteTests]   # E = векторы EvoSuite
    R = [parse_vector(t.coverage_vector) for t in RandoopTests]    # R = векторы Randoop

    if E is empty:
        return NaN, NaN        # в проекте так и делается

    if R is empty:
        maxJ = [0 for each e in E]    # maxJ = максимум Жаккара для каждого e
        maxD = [0 for each e in E]    # maxD = максимум Дайса для каждого e
    else:
        maxJ = []
        maxD = []
        for each e in E:              # e = текущий тест EvoSuite
            bestJ = 0                 # bestJ = лучший Жаккар для e
            bestD = 0                 # bestD = лучший Дайс для e
            for each r in R:          # r = текущий тест Randoop
                bestJ = max(bestJ, jaccard(e, r))
                bestD = max(bestD, dice(e, r))
            maxJ.append(bestJ)        # список максимумов по e
            maxD.append(bestD)

    mean_max_jaccard = average(maxJ)  # итог по группе (Жаккар)
    mean_max_dice    = average(maxD)  # итог по группе (Дайс)
    return mean_max_jaccard, mean_max_dice
```

## Пошаговое описание расчёта (словами)
1. Для каждой группы `(program_class, generation_time_sec, run)` берутся тесты EvoSuite и Randoop.
2. У каждого теста строка `coverage_vector` превращается в бинарный вектор: непустые элементы — это покрытые позиции (1), остальные — 0.
3. Для каждой пары тестов `(e из EvoSuite, r из Randoop)` считается:
   - число общих покрытых позиций (`|A ∩ B|`);
   - количество покрытых позиций в каждом тесте (`|A|` и `|B|`);
   - коэффициенты Жаккара и Сёренсена–Дайса по формулам из раздела выше.
4. Для каждого EvoSuite‑теста выбирается **максимальное** сходство с любым Randoop‑тестом (отдельно для Жаккара и для Дайса).
5. Итоговая метрика группы — это среднее значение этих максимумов по всем EvoSuite‑тестам.
6. Если у группы нет EvoSuite‑тестов, результат помечается как `NaN`. Если нет Randoop‑тестов, все максимумы считаются равными 0.

## Агрегация запусков

Значения групп с одинаковыми `(program_class, generation_time_sec)` усредняются
по независимым запускам с одинаковым весом. `NaN` не входит в выборку. В CSV
отдельно сохраняются число сопоставленных запусков `runs` и число конечных
значений `samples`, а также выборочная дисперсия, стандартное отклонение и
95-процентный доверительный интервал среднего по Стьюденту. При одном конечном
значении среднее определено, но оценить дисперсию и интервал невозможно.
