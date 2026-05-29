# Lab4_3 Console App

This project includes a simple console runner for the four sample classes.

## Run

```powershell
cd "C:\Users\user\Documents\Polytech\Testing\Lab4_3"
.\gradlew.bat run
```

If there is no run task configured, you can run the main class directly:

```powershell
.\gradlew.bat -q classes
java -cp "build\classes\java\main" com.viktor.lab4.ConsoleApp
```

## Generate Tests (EvoSuite/Randoop)

Script: `scripts\run-all-generators.ps1`

```powershell
# PowerShell
Set-Location C:\Users\user\Documents\Polytech\Testing\Lab4_3
.\scripts\run-all-generators.ps1 -Tools EvoSuite,Randoop -BudgetsSec 30,60,120 -Seeds 101,202,303
```

```bat
REM cmd.exe
cd /d C:\Users\user\Documents\Polytech\Testing\Lab4_3
powershell -ExecutionPolicy Bypass -File scripts\run-all-generators.ps1 -Tools EvoSuite Randoop -BudgetsSec 30 60 120 -Seeds 101 202 303
```

Parameters:
- `-Tools` (string[]): `EvoSuite`, `Randoop`.
- `-BudgetsSec` (int[]): search time per class.
- `-Seeds` (int[]): random seeds; run index is derived from position (run1, run2, ...).
- `-TargetClasses` (string[]): FQCN list to generate tests for.
- `-OutputRoot` (string): output folder (default `generated-tests`).
- `-JavaExe` (string): path to `java.exe`.
- `-UseBundledJdk8` (switch): use `tools\jdk8` if present.
- `-SkipBuild` (switch): skip Gradle `clean classes`.
- `-DryRun` (switch): print commands only.

Results:
- Generated tests: `generated-tests\{Tool}\{Case}\{Budget}\runX-seedY\*.java`
- Generation summary: `generated-tests\generation-summary.csv`

## Generate Quality Reports (coverage + mutation)

Script: `scripts\run-quality-analysis.ps1`

```powershell
# PowerShell
Set-Location C:\Users\user\Documents\Polytech\Testing\Lab4_3
.\scripts\run-quality-analysis.ps1 -Tools EvoSuite,Randoop -BudgetsSec 30,60,120 -Runs 1,2,3
```

```bat
REM cmd.exe
cd /d C:\Users\user\Documents\Polytech\Testing\Lab4_3
powershell -ExecutionPolicy Bypass -File scripts\run-quality-analysis.ps1 -Tools EvoSuite Randoop -BudgetsSec 30 60 120 -Runs 1 2 3
```

Parameters:
- `-Tools` (string[]): `EvoSuite`, `Randoop`.
- `-Cases` (string[]): simple class names: `LongestIncreasingSubsequence`, `LruCache`, `SimpleJsonParser`, `PricingEngine`.
- `-BudgetsSec` (int[]): filter budgets to analyze.
- `-Runs` (int[]): filter run indices (`run1`, `run2`, ...).
- `-SkipExecution` (switch): skip Gradle execution (only scan).
- `-StopOnError` (switch): stop on first failure.

Results:
- Detailed CSV: `reports\summary-quality.csv`
- Aggregated CSV: `reports\summary-quality-aggregated.csv`
- JaCoCo HTML: `build\reports\jacoco\generated\html\index.html`
- PIT HTML: `build\reports\pitest\generated\index.html`

## Collect Spectral Traces (JaCoCo per-test)

Script: `scripts\collect-spectra.ps1`

```powershell
# PowerShell
Set-Location C:\Users\user\Documents\Polytech\Testing\Lab4up
.\scripts\collect-spectra.ps1 -Tools EvoSuite,Randoop -BudgetsSec 30,60,120 -Runs 1,2,3
```

Results:
- Traces: `reports\traces\evosuite_all_traces.csv`, `reports\traces\randoop_all_traces.csv`
- CSV columns: `program_class`, `generation_time_sec`, `seed`, `test_name`, `coverage_vector`

## Compare Spectral Traces (Python)

Script: `py\compare_traces.py`

```powershell
# PowerShell
Set-Location C:\Users\user\Documents\Polytech\Testing\Lab4up
python .\py\compare_traces.py --evosuite .\reports\traces\evosuite_all_traces.csv --randoop .\reports\traces\randoop_all_traces.csv --out .\reports\trace_similarity.csv
```

Results:
- Similarity table: `reports\trace_similarity.csv`
