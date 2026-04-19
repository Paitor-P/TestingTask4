param(
    [string]$ProjectRoot = (Split-Path -Parent $PSScriptRoot),
    [string[]]$Tools = @("EvoSuite", "Randoop"),
    [string]$GradleCmd = ".\gradlew.bat",
    [string[]]$Cases,
    [int[]]$BudgetsSec,
    [int[]]$Runs,
    [switch]$SkipExecution,
    [switch]$StopOnError
)

$ErrorActionPreference = "Stop"

function Parse-GenerationSummary {
    param([string]$SummaryPath)

    $map = @{}
    if (-not (Test-Path $SummaryPath)) {
        return $map
    }

    $rows = Import-Csv -Path $SummaryPath
    foreach ($row in $rows) {
        if ($row.status -ne "OK") { continue }
        $simple = ($row.targetClass -split "\.")[-1]
        $key = "{0}|{1}|{2}|{3}" -f $row.tool, $simple, $row.budgetSec, $row.run
        $elapsed = $null
        if ($row.elapsedSec) {
            $elapsed = [double](($row.elapsedSec -replace ',', '.'))
        }
        $map[$key] = $elapsed
    }
    return $map
}

function Get-JacocoMetrics {
    param(
        [string]$XmlPath,
        [string]$TargetClassFqn
    )

    if (-not (Test-Path $XmlPath)) {
        return @{ linePct = $null; branchPct = $null; instPct = $null }
    }

    [xml]$doc = Get-Content $XmlPath
    $targetName = $TargetClassFqn -replace '\.', '/'
    $classNode = $doc.report.package.class | Where-Object { $_.name -eq $targetName } | Select-Object -First 1
    if (-not $classNode) {
        return @{ linePct = $null; branchPct = $null; instPct = $null }
    }

    $line = $classNode.counter | Where-Object { $_.type -eq "LINE" } | Select-Object -First 1
    $branch = $classNode.counter | Where-Object { $_.type -eq "BRANCH" } | Select-Object -First 1
    $instr = $classNode.counter | Where-Object { $_.type -eq "INSTRUCTION" } | Select-Object -First 1

    $linePct = $null
    $branchPct = $null
    $instPct = $null

    if ($line -and ([int]$line.missed + [int]$line.covered) -gt 0) {
        $linePct = [math]::Round((100.0 * [int]$line.covered) / ([int]$line.covered + [int]$line.missed), 2)
    }
    if ($branch -and ([int]$branch.missed + [int]$branch.covered) -gt 0) {
        $branchPct = [math]::Round((100.0 * [int]$branch.covered) / ([int]$branch.covered + [int]$branch.missed), 2)
    }
    if ($instr -and ([int]$instr.missed + [int]$instr.covered) -gt 0) {
        $instPct = [math]::Round((100.0 * [int]$instr.covered) / ([int]$instr.covered + [int]$instr.missed), 2)
    }

    return @{ linePct = $linePct; branchPct = $branchPct; instPct = $instPct }
}

function Get-PitMetrics {
    param([string]$XmlPath)

    if (-not (Test-Path $XmlPath)) {
        return @{ mutationPct = $null; total = 0; killed = 0; survived = 0; timedOut = 0; noCoverage = 0 }
    }

    [xml]$doc = Get-Content $XmlPath
    $mutations = @($doc.mutations.mutation)
    if ($mutations.Count -eq 0) {
        return @{ mutationPct = 0.0; total = 0; killed = 0; survived = 0; timedOut = 0; noCoverage = 0 }
    }

    $killed = @($mutations | Where-Object { $_.detected -eq "true" }).Count
    $survived = @($mutations | Where-Object { $_.status -eq "SURVIVED" }).Count
    $timedOut = @($mutations | Where-Object { $_.status -eq "TIMED_OUT" }).Count
    $noCoverage = @($mutations | Where-Object { $_.status -eq "NO_COVERAGE" }).Count
    $total = $mutations.Count
    $mutationPct = [math]::Round((100.0 * $killed) / $total, 2)

    return @{ mutationPct = $mutationPct; total = $total; killed = $killed; survived = $survived; timedOut = $timedOut; noCoverage = $noCoverage }
}

function Get-TestCounts {
    param([string]$ResultsDir)

    if (-not (Test-Path $ResultsDir)) {
        return @{ tests = 0; failures = 0; skipped = 0 }
    }

    $files = Get-ChildItem -Path $ResultsDir -Filter "TEST-*.xml" -File -ErrorAction SilentlyContinue
    $tests = 0
    $failures = 0
    $skipped = 0

    foreach ($f in $files) {
        [xml]$x = Get-Content $f.FullName
        if ($x.testsuite) {
            $tests += [int]$x.testsuite.tests
            $failures += [int]$x.testsuite.failures + [int]$x.testsuite.errors
            $skipped += [int]$x.testsuite.skipped
        }
    }

    return @{ tests = $tests; failures = $failures; skipped = $skipped }
}

function Prepare-WorkingTestDir {
    param(
        [string]$Tool,
        [string]$SourceDir,
        [string]$WorkDir
    )

    Remove-Item $WorkDir -Recurse -Force -ErrorAction SilentlyContinue
    New-Item -ItemType Directory -Force -Path $WorkDir | Out-Null

    $files = Get-ChildItem -Path $SourceDir -Filter "*.java" -Recurse -File
    foreach ($file in $files) {
        $relative = $file.FullName.Substring($SourceDir.Length).TrimStart('\\')
        $dest = Join-Path $WorkDir $relative
        New-Item -ItemType Directory -Force -Path (Split-Path -Parent $dest) | Out-Null
        Copy-Item $file.FullName $dest -Force
    }

    if ($Tool -eq "EvoSuite") {
        $allJava = Get-ChildItem -Path $WorkDir -Filter "*.java" -Recurse -File
        foreach ($j in $allJava) {
            if ($j.Name -like "*_ESTest_scaffolding.java") {
                Remove-Item $j.FullName -Force
                continue
            }

            if ($j.Name -like "*_ESTest.java") {
                $content = Get-Content $j.FullName -Raw
                $content = $content -replace 'import org\.evosuite\.runtime\.EvoRunner;\r?\n', ''
                $content = $content -replace 'import org\.evosuite\.runtime\.EvoRunnerParameters;\r?\n', ''
                $content = $content -replace 'import org\.junit\.runner\.RunWith;\r?\n', ''
                $content = $content -replace '@RunWith\(EvoRunner\.class\)\s*@EvoRunnerParameters\([^\)]*\)\s*', ''
                $content = $content -replace 'extends\s+[A-Za-z0-9_]+_ESTest_scaffolding\s*\{', '{'
                $utf8NoBom = New-Object System.Text.UTF8Encoding($false)
                [System.IO.File]::WriteAllText($j.FullName, $content, $utf8NoBom)
            }
        }
    }
}

$repo = (Resolve-Path $ProjectRoot).Path
Set-Location $repo

$generatedRoot = Join-Path $repo "generated-tests"
$reportsDir = Join-Path $repo "reports"
$rawDir = Join-Path $reportsDir "raw"
New-Item -ItemType Directory -Force -Path $rawDir | Out-Null

$summaryCsv = Join-Path $reportsDir "summary-quality.csv"
$aggCsv = Join-Path $reportsDir "summary-quality-aggregated.csv"

$generationMap = Parse-GenerationSummary -SummaryPath (Join-Path $generatedRoot "generation-summary.csv")
$records = New-Object System.Collections.Generic.List[object]

$toolDirs = Get-ChildItem -Path $generatedRoot -Directory | Where-Object { $Tools -contains $_.Name }

foreach ($toolDir in $toolDirs) {
    $tool = $toolDir.Name
    $classDirs = Get-ChildItem -Path $toolDir.FullName -Directory

    foreach ($classDir in $classDirs) {
        $classSimple = $classDir.Name
        if ($Cases -and ($Cases -notcontains $classSimple)) { continue }
        $targetClass = "com.viktor.lab4.$classSimple"
        $budgetDirs = Get-ChildItem -Path $classDir.FullName -Directory

        foreach ($budgetDir in $budgetDirs) {
            $budget = [int]$budgetDir.Name
            if ($BudgetsSec -and ($BudgetsSec -notcontains $budget)) { continue }
            $runDirs = Get-ChildItem -Path $budgetDir.FullName -Directory

            foreach ($runDir in $runDirs) {
                if ($runDir.Name -notmatch '^run(?<run>\d+)-seed(?<seed>\d+)$') {
                    continue
                }

                $run = [int]$Matches.run
                $seed = [int]$Matches.seed
                if ($Runs -and ($Runs -notcontains $run)) { continue }
                $javaCount = @(Get-ChildItem -Path $runDir.FullName -Filter "*.java" -Recurse -File).Count
                if ($javaCount -eq 0) {
                    continue
                }

                $pitTestsPattern = if ($tool -eq "EvoSuite") { "com.viktor.lab4.*ESTest*" } else { "com.viktor.lab4.autogen.*" }

                $status = "OK"
                $errorText = ""
                $started = Get-Date

                $workDir = Join-Path $repo ("build\\analysis-work\\{0}\\{1}\\{2}\\run{3}-seed{4}" -f $tool, $classSimple, $budget, $run, $seed)
                Prepare-WorkingTestDir -Tool $tool -SourceDir $runDir.FullName -WorkDir $workDir

                if (-not $SkipExecution) {
                    $cmdArgs = @(
                        "--no-daemon",
                        "cleanGeneratedAnalysis",
                        "generatedTest",
                        "jacocoGeneratedTestReport",
                        "pitest",
                        "-PgeneratedTestsDir=$workDir",
                        "-PpitTargetClass=$targetClass",
                        "-PpitTargetTests=$pitTestsPattern"
                    )

                    Write-Host ""
                    Write-Host ">>> $GradleCmd $($cmdArgs -join ' ')"
                    try {
                        & $GradleCmd @cmdArgs | Out-Host
                    } catch {
                        $status = "FAILED"
                        $errorText = $_.Exception.Message
                        if ($StopOnError) { throw }
                    }
                }

                $elapsedAnalysisSec = [math]::Round(((Get-Date) - $started).TotalSeconds, 3)

                $jacocoXml = Join-Path $repo "build\reports\jacoco\generated\jacocoGeneratedTestReport.xml"
                $pitXml = Join-Path $repo "build\reports\pitest\generated\mutations.xml"
                $testResultsDir = Join-Path $repo "build\test-results\generatedTest"

                $coverage = Get-JacocoMetrics -XmlPath $jacocoXml -TargetClassFqn $targetClass
                $pit = Get-PitMetrics -XmlPath $pitXml
                $tests = Get-TestCounts -ResultsDir $testResultsDir

                $genKey = "{0}|{1}|{2}|{3}" -f $tool, $classSimple, $budget, $run
                $genElapsed = $null
                if ($generationMap.ContainsKey($genKey)) {
                    $genElapsed = $generationMap[$genKey]
                }

                $records.Add([pscustomobject]@{
                    tool = $tool
                    case = $classSimple
                    targetClass = $targetClass
                    budgetSec = $budget
                    run = $run
                    seed = $seed
                    generatedTestFiles = $javaCount
                    testsExecuted = $tests.tests
                    testFailures = $tests.failures
                    testSkipped = $tests.skipped
                    lineCoveragePct = $coverage.linePct
                    branchCoveragePct = $coverage.branchPct
                    instructionCoveragePct = $coverage.instPct
                    mutationScorePct = $pit.mutationPct
                    mutationsTotal = $pit.total
                    mutationsKilled = $pit.killed
                    mutationsSurvived = $pit.survived
                    mutationsTimedOut = $pit.timedOut
                    mutationsNoCoverage = $pit.noCoverage
                    generationElapsedSec = $genElapsed
                    analysisElapsedSec = $elapsedAnalysisSec
                    status = $status
                    error = $errorText
                    sourceDir = $runDir.FullName
                    preparedDir = $workDir
                })
            }
        }
    }
}

$records | Sort-Object tool, case, budgetSec, run | Export-Csv -Path $summaryCsv -NoTypeInformation -Encoding UTF8

$agg = $records |
    Group-Object tool, case, budgetSec |
    ForEach-Object {
        $rows = $_.Group | Where-Object { $_.status -eq "OK" }
        $line = $rows | Where-Object { $_.lineCoveragePct -ne $null } | Measure-Object -Property lineCoveragePct -Average
        $branch = $rows | Where-Object { $_.branchCoveragePct -ne $null } | Measure-Object -Property branchCoveragePct -Average
        $mutation = $rows | Where-Object { $_.mutationScorePct -ne $null } | Measure-Object -Property mutationScorePct -Average
        $tests = $rows | Measure-Object -Property testsExecuted -Average

        $parts = $_.Name -split ", "
        [pscustomobject]@{
            tool = ($parts[0] -replace '^tool=', '')
            case = ($parts[1] -replace '^case=', '')
            budgetSec = [int]($parts[2] -replace '^budgetSec=', '')
            runs = $rows.Count
            meanTestsExecuted = [math]::Round(($tests.Average | ForEach-Object { if ($_ -eq $null) { 0 } else { $_ } }), 2)
            meanLineCoveragePct = [math]::Round(($line.Average | ForEach-Object { if ($_ -eq $null) { 0 } else { $_ } }), 2)
            meanBranchCoveragePct = [math]::Round(($branch.Average | ForEach-Object { if ($_ -eq $null) { 0 } else { $_ } }), 2)
            meanMutationScorePct = [math]::Round(($mutation.Average | ForEach-Object { if ($_ -eq $null) { 0 } else { $_ } }), 2)
        }
    }

$agg | Sort-Object tool, case, budgetSec | Export-Csv -Path $aggCsv -NoTypeInformation -Encoding UTF8

Write-Host ""
Write-Host "Done."
Write-Host "Detailed:   $summaryCsv"
Write-Host "Aggregated: $aggCsv"





