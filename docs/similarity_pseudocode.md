# Псевдокод расчёта метрик сходства (Жаккар, Сёренсен–Дайс)

Идея: каждый тест имеет бинарный вектор покрытия `coverage_vector` (0/1). Для каждой группы
`(program_class, generation_time_sec, run, seed)` сравниваются все тесты EvoSuite со всеми тестами Randoop.
Итоговая метрика — среднее двух направлений: «лучший Randoop для каждого
EvoSuite-теста» и «лучший EvoSuite для каждого Randoop-теста». Поэтому
перестановка инструментов не меняет итоговое значение.

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

    if E is empty and R is empty:
        return NaN, NaN
    if E is empty or R is empty:
        return 0, 0

    E_to_R_J = average(max(jaccard(e, r) for each r in R) for each e in E)
    R_to_E_J = average(max(jaccard(r, e) for each e in E) for each r in R)
    E_to_R_D = average(max(dice(e, r)    for each r in R) for each e in E)
    R_to_E_D = average(max(dice(r, e)    for each e in E) for each r in R)

    mean_max_jaccard = (E_to_R_J + R_to_E_J) / 2
    mean_max_dice    = (E_to_R_D + R_to_E_D) / 2
    return mean_max_jaccard, mean_max_dice
```

## Пошаговое описание расчёта (словами)
1. Для каждой группы `(program_class, generation_time_sec, run, seed)` берутся тесты EvoSuite и Randoop.
2. У каждого теста строка `coverage_vector` превращается в бинарный вектор: непустые элементы — это покрытые позиции (1), остальные — 0.
3. Для каждой пары тестов `(e из EvoSuite, r из Randoop)` считается:
   - число общих покрытых позиций (`|A ∩ B|`);
   - количество покрытых позиций в каждом тесте (`|A|` и `|B|`);
   - коэффициенты Жаккара и Сёренсена–Дайса по формулам из раздела выше.
4. Для каждого EvoSuite‑теста выбирается **максимальное** сходство с любым Randoop‑тестом, а затем выполняется обратный расчёт для каждого Randoop‑теста.
5. Итоговая метрика группы — среднее значений двух направлений. Поля `evosuite_to_randoop_*` и `randoop_to_evosuite_*` остаются в детальном CSV для диагностики.
6. Если оба набора отсутствуют, результат помечается как `NaN`; если отсутствует один набор, итоговая схожесть равна 0.

## Агрегация запусков

Значения групп с одинаковыми `(program_class, generation_time_sec)` усредняются
по независимым запускам с одинаковым весом. `NaN` не входит в выборку. В CSV
отдельно сохраняются число сопоставленных запусков `runs` и число конечных
значений `samples`, а также выборочная дисперсия, стандартное отклонение и
95-процентный доверительный интервал среднего по Стьюденту. При одном конечном
значении среднее определено, но оценить дисперсию и интервал невозможно.
