param(
    [string]$ProjectRoot = (Split-Path -Parent $PSScriptRoot),
    [string[]]$Tools = @("EvoSuite", "Randoop"),
    [string]$GradleCmd = ".\gradlew.bat",
    [string]$JavaExe = "java",
    [string[]]$Cases,
    [int[]]$BudgetsSec,
    [int[]]$Runs,
    [string]$OutputDir = $null,
    [switch]$StopOnError
)

$ErrorActionPreference = "Stop"

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
        $relative = $file.FullName.Substring($SourceDir.Length).TrimStart('\')
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

function Get-TestClassFqns {
    param([string]$SourceDir)

    $result = New-Object System.Collections.Generic.HashSet[string]
    $files = Get-ChildItem -Path $SourceDir -Filter "*.java" -Recurse -File
    foreach ($file in $files) {
        $content = Get-Content $file.FullName -Raw
        $package = ""
        if ($content -match 'package\s+([A-Za-z0-9_\.]+)\s*;') {
            $package = $Matches[1]
        }
        if ($content -match 'class\s+([A-Za-z0-9_]+)') {
            $class = $Matches[1]
            $fqn = if ($package) { "$package.$class" } else { $class }
            $result.Add($fqn) | Out-Null
        }
    }
    return $result
}

function Get-TestMethods {
    param(
        [string]$Classpath,
        [string]$TestClass,
        [string]$JavaExe
    )

    $output = & $JavaExe -cp $Classpath com.viktor.lab4.trace.TestLister --testClass $TestClass 2>$null
    if (-not $output) {
        return @()
    }
    return @($output | Where-Object { $_ -and $_.Trim().Length -gt 0 })
}

$repo = (Resolve-Path $ProjectRoot).Path
Set-Location $repo

$generatedRoot = Join-Path $repo "generated-tests"
if (-not $OutputDir) {
    $OutputDir = Join-Path $repo "reports\traces"
}
New-Item -ItemType Directory -Force -Path $OutputDir | Out-Null

$toolDirs = Get-ChildItem -Path $generatedRoot -Directory | Where-Object { $Tools -contains $_.Name }

foreach ($toolDir in $toolDirs) {
    $tool = $toolDir.Name
    $toolFile = if ($tool -eq "EvoSuite") { "evosuite_all_traces.csv" } else { "randoop_all_traces.csv" }
    $outCsv = Join-Path $OutputDir $toolFile

    if (-not (Test-Path $outCsv)) {
        "program_class,generation_time_sec,seed,test_name,coverage_vector" | Set-Content -Path $outCsv -Encoding UTF8
    }

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
                if ($javaCount -eq 0) { continue }

                $workDir = Join-Path $repo ("build\analysis-work\{0}\{1}\{2}\run{3}-seed{4}" -f $tool, $classSimple, $budget, $run, $seed)
                Prepare-WorkingTestDir -Tool $tool -SourceDir $runDir.FullName -WorkDir $workDir

                $cmdArgs = @(
                    "--no-daemon",
                    "cleanGeneratedAnalysis",
                    "generatedTestClasses",
                    "-PgeneratedTestsDir=$workDir"
                )

                Write-Host ""
                Write-Host ">>> $GradleCmd $($cmdArgs -join ' ')"
                try {
                    & $GradleCmd @cmdArgs | Out-Host
                } catch {
                    if ($StopOnError) { throw }
                    continue
                }

                $classpath = (& $GradleCmd -q "printGeneratedTestClasspath" "-PgeneratedTestsDir=$workDir").Trim()
                $jacocoAgent = (& $GradleCmd -q "printJacocoAgentPath").Trim()
                $classpathWithAgent = "$classpath;$jacocoAgent"

                $tempExec = Join-Path $repo "build\jacoco\trace.exec"
                New-Item -ItemType Directory -Force -Path (Split-Path -Parent $tempExec) | Out-Null
                $includePattern = $targetClass.Replace('.', '/') + "*"
                $jacocoArgs = "destfile=$tempExec,append=false,dumponexit=false,includes=$includePattern"

                $testClasses = Get-TestClassFqns -SourceDir $workDir
                foreach ($testClass in $testClasses) {
                    $methods = Get-TestMethods -Classpath $classpathWithAgent -TestClass $testClass -JavaExe $JavaExe
                    foreach ($method in $methods) {
                        $vectorLines = & $JavaExe -javaagent:$jacocoAgent=$jacocoArgs -cp $classpathWithAgent `
                            com.viktor.lab4.trace.TraceCollector --targetClass $targetClass --testClass $testClass --testMethod $method 2>$null

                        if (-not $vectorLines) {
                            continue
                        }
                        $vector = ($vectorLines | Select-Object -Last 1).Trim()
                        $testName = "$testClass#$method"

                        $safeTest = $testName -replace '"', '""'
                        $safeVector = $vector -replace '"', '""'
                        $line = "{0},{1},{2},\"{3}\",\"{4}\"" -f $classSimple, $budget, $seed, $safeTest, $safeVector
                        Add-Content -Path $outCsv -Value $line -Encoding UTF8
                    }
                }
            }
        }
    }
}

Write-Host ""
Write-Host "Done. Output in $OutputDir"

