param(
    [string]$RepoRoot = (Split-Path -Parent $PSScriptRoot),
    [string[]]$BudgetsSec = @("30", "60", "120"),
    [string[]]$Seeds = @("101", "202", "303"),
    [string[]]$Tools = @("EvoSuite", "Randoop"),
    [string[]]$TargetClasses = @(
        "com.viktor.lab4.LongestIncreasingSubsequence",
        "com.viktor.lab4.LruCache",
        "com.viktor.lab4.SimpleJsonParser",
        "com.viktor.lab4.PricingEngine"
    ),
    [string]$OutputRoot = "generated-tests",
    [string]$JavaExe = "java",
    [string[]]$EvoSuiteJvmArgs = @(
        "-Djava.awt.headless=true",
        "--add-opens", "java.desktop/java.awt=ALL-UNNAMED",
        "--add-opens", "java.base/java.lang=ALL-UNNAMED",
        "--add-opens", "java.base/java.util=ALL-UNNAMED",
        "--add-opens", "java.base/java.net=ALL-UNNAMED"
    ),
    [switch]$UseBundledJdk8,
    [switch]$SkipBuild,
    [switch]$DryRun
)

$ErrorActionPreference = "Stop"

function Get-ClassShortName {
    param([string]$Fqcn)
    return ($Fqcn.Split('.')[-1])
}

function Ensure-FileExists {
    param([string]$PathToCheck, [string]$Message)
    if (-not (Test-Path $PathToCheck)) {
        throw "${Message}: $PathToCheck"
    }
}

function Invoke-External {
    param(
        [string]$Exe,
        [string[]]$ArgList,
        [switch]$Dry,
        [int]$TimeoutSec = 0
    )

    $printable = "$Exe " + ($ArgList -join " ")
    Write-Host "`n>>> $printable"

    if ($Dry) {
        return
    }

    if ($TimeoutSec -le 0) {
        & $Exe @ArgList
        if ($LASTEXITCODE -ne 0) {
            throw "Command failed with code $LASTEXITCODE"
        }
        return
    }

    $proc = Start-Process -FilePath $Exe -ArgumentList $ArgList -PassThru -NoNewWindow
    try {
        Wait-Process -Id $proc.Id -Timeout $TimeoutSec -ErrorAction Stop
    }
    catch {
        try {
            Stop-Process -Id $proc.Id -Force -ErrorAction SilentlyContinue
        }
        catch {
        }
        throw "Command timed out after $TimeoutSec seconds"
    }

    $proc.Refresh()
    if ($proc.ExitCode -ne 0) {
        throw "Command failed with code $($proc.ExitCode)"
    }
}

function Expand-ListParameter {
    param([string[]]$Values)

    $expanded = @()
    foreach ($value in $Values) {
        if ([string]::IsNullOrWhiteSpace($value)) {
            continue
        }

        $parts = $value -split ","
        foreach ($part in $parts) {
            $trimmed = $part.Trim()
            if (-not [string]::IsNullOrWhiteSpace($trimmed)) {
                $expanded += $trimmed
            }
        }
    }

    return $expanded
}

function Expand-IntListParameter {
    param(
        [string[]]$Values,
        [string]$ParamName
    )

    $rawItems = @()
    foreach ($value in $Values) {
        if ([string]::IsNullOrWhiteSpace($value)) {
            continue
        }

        $parts = [regex]::Split($value, "[,;\\s]+")
        foreach ($part in $parts) {
            $trimmed = $part.Trim()
            if (-not [string]::IsNullOrWhiteSpace($trimmed)) {
                $rawItems += $trimmed
            }
        }
    }

    if ($rawItems.Count -eq 0) {
        throw "Parameter $ParamName is empty"
    }

    $parsed = @()
    foreach ($item in $rawItems) {
        $number = 0
        if (-not [int]::TryParse($item, [ref]$number)) {
            throw "Parameter $ParamName contains non-integer value: $item"
        }
        $parsed += $number
    }

    return $parsed
}

function Get-JavaMajorVersion {
    param([string]$JavaPath)

    $versionOutput = & cmd /c "`"$JavaPath`" -version 2>&1" | Out-String
    if (-not $versionOutput) {
        return $null
    }

    $firstLine = ($versionOutput -split "`r?`n")[0]
    if ($firstLine -match '"(?<ver>[0-9]+)(\.[0-9]+)?') {
        return [int]$Matches['ver']
    }

    return $null
}

function Find-EvoSuiteCompatibleJava {
    param([string]$RepoRootPath)

    $candidates = New-Object System.Collections.Generic.List[string]
    $seen = @{}

    function Add-Candidate {
        param([string]$CandidatePath)

        if ([string]::IsNullOrWhiteSpace($CandidatePath)) {
            return
        }
        if (-not (Test-Path $CandidatePath)) {
            return
        }

        $resolved = (Resolve-Path $CandidatePath).Path
        if (-not $seen.ContainsKey($resolved)) {
            $seen[$resolved] = $true
            $null = $candidates.Add($resolved)
        }
    }

    Add-Candidate -CandidatePath (Join-Path $RepoRootPath "tools/jdk8/bin/java.exe")
    Add-Candidate -CandidatePath (Join-Path $RepoRootPath "tools/jdk8_alt/bin/java.exe")

    if ($env:JAVA_HOME) {
        Add-Candidate -CandidatePath (Join-Path $env:JAVA_HOME "bin/java.exe")
    }

    $globPatterns = @(
        "C:\\Users\\user\\.jdks\\*\\bin\\java.exe",
        "C:\\Program Files\\Eclipse Adoptium\\jdk-*\\bin\\java.exe",
        "C:\\Program Files\\Java\\jdk*\\bin\\java.exe",
        "C:\\Program Files\\JetBrains\\IntelliJ IDEA*\\jbr\\bin\\java.exe",
        "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition*\\jbr\\bin\\java.exe",
        "$env:LOCALAPPDATA\\JetBrains\\Toolbox\\apps\\IDEA-U\\ch-0\\*\\jbr\\bin\\java.exe",
        "$env:LOCALAPPDATA\\JetBrains\\Toolbox\\apps\\IDEA-C\\ch-0\\*\\jbr\\bin\\java.exe"
    )

    foreach ($pattern in $globPatterns) {
        $matches = Get-ChildItem -Path $pattern -File -ErrorAction SilentlyContinue | Sort-Object FullName -Descending
        foreach ($match in $matches) {
            Add-Candidate -CandidatePath $match.FullName
        }
    }

    $compatible = @()
    foreach ($candidate in $candidates) {
        $major = Get-JavaMajorVersion -JavaPath $candidate
        if ($null -ne $major -and $major -le 17) {
            $compatible += [PSCustomObject]@{ Path = $candidate; Major = $major }
        }
    }

    if ($compatible.Count -eq 0) {
        return $null
    }

    return ($compatible | Sort-Object -Property @{ Expression = 'Major'; Descending = $true }, @{ Expression = 'Path'; Descending = $false } | Select-Object -First 1).Path
}

$repoAbs = (Resolve-Path $RepoRoot).Path
Set-Location $repoAbs

$Tools = Expand-ListParameter -Values $Tools
$TargetClasses = Expand-ListParameter -Values $TargetClasses
$BudgetsSec = Expand-IntListParameter -Values $BudgetsSec -ParamName "BudgetsSec"
$Seeds = Expand-IntListParameter -Values $Seeds -ParamName "Seeds"

$evosuiteJar = Join-Path $repoAbs "tools/evosuite-1.2.0.jar"
$randoopJar = Join-Path $repoAbs "tools/randoop-all-4.3.3.jar"
$gradlew = Join-Path $repoAbs "gradlew.bat"

Ensure-FileExists -PathToCheck $gradlew -Message "Gradle wrapper not found"

if ($Tools -contains "EvoSuite") {
    Ensure-FileExists -PathToCheck $evosuiteJar -Message "EvoSuite jar not found"
}
if ($Tools -contains "Randoop") {
    Ensure-FileExists -PathToCheck $randoopJar -Message "Randoop jar not found"
}

if ($UseBundledJdk8) {
    $candidateJava = Join-Path $repoAbs "tools/jdk8/bin/java.exe"
    Ensure-FileExists -PathToCheck $candidateJava -Message "Bundled JDK8 java.exe not found"
    $JavaExe = $candidateJava
}

if ($Tools -contains "EvoSuite") {
    $javaWasExplicit = $PSBoundParameters.ContainsKey("JavaExe") -or $UseBundledJdk8
    $javaMajor = Get-JavaMajorVersion -JavaPath $JavaExe
    $autoDetectTried = $false

    if (($null -eq $javaMajor -or $javaMajor -gt 17) -and -not $javaWasExplicit) {
        $autoDetectTried = $true
        $autoJava = Find-EvoSuiteCompatibleJava -RepoRootPath $repoAbs
        if ($autoJava) {
            Write-Warning "Auto-selected Java for EvoSuite: $autoJava"
            $JavaExe = $autoJava
            $javaMajor = Get-JavaMajorVersion -JavaPath $JavaExe
        }
    }

    if ($null -eq $javaMajor -or $javaMajor -gt 17) {
        if ($autoDetectTried) {
            throw "EvoSuite auto-detect could not find compatible Java (<=17). Current Java is $javaMajor. Use -JavaExe with JDK 8/11/17."
        }
        throw "EvoSuite 1.2.0 is incompatible with Java $javaMajor (unsupported class file major version). Use JDK 8/11/17 via -JavaExe."
    }
}

if (-not $SkipBuild) {
    Invoke-External -Exe $gradlew -ArgList @("--no-daemon", "clean", "classes") -Dry:$DryRun
}

$mainClasses = Join-Path $repoAbs "build/classes/java/main"
$mainResources = Join-Path $repoAbs "build/resources/main"

if (-not $DryRun) {
    Ensure-FileExists -PathToCheck $mainClasses -Message "Compiled main classes not found"
}

$classpathEntries = @()
if (Test-Path $mainClasses) {
    $classpathEntries += $mainClasses
}
if (Test-Path $mainResources) {
    $classpathEntries += $mainResources
}
else {
    Write-Warning "Optional classpath entry not found (continuing): $mainResources"
}

if ($classpathEntries.Count -eq 0) {
    throw "No valid classpath entries found for generators"
}

$projectCp = [string]::Join([IO.Path]::PathSeparator, $classpathEntries)
$outBase = Join-Path $repoAbs $OutputRoot
New-Item -ItemType Directory -Force -Path $outBase | Out-Null

$summaryFileName = "generation-summary.csv"
if ($DryRun) {
    $summaryFileName = "generation-summary-dryrun.csv"
}
$summaryPath = Join-Path $outBase $summaryFileName
$rows = New-Object System.Collections.Generic.List[object]

foreach ($tool in $Tools) {
    foreach ($target in $TargetClasses) {
        $classShort = Get-ClassShortName -Fqcn $target
        foreach ($budget in $BudgetsSec) {
            for ($i = 0; $i -lt $Seeds.Count; $i++) {
                $seed = $Seeds[$i]
                $runIndex = $i + 1

                $runDir = Join-Path $outBase "$tool/$classShort/$budget/run$runIndex-seed$seed"
                if (-not $DryRun) {
                    New-Item -ItemType Directory -Force -Path $runDir | Out-Null
                }

                $start = Get-Date
                $status = "OK"
                $errorText = ""

                try {
                    if ($tool -eq "EvoSuite") {
                        $args = @()
                        $args += $EvoSuiteJvmArgs
                        $args += @(
                            "-jar", $evosuiteJar,
                            "-generateMOSuite",
                            "-class", $target,
                            "-projectCP", $projectCp,
                            "-Dsearch_budget=$budget",
                            "-Dclient_on_thread=true",
                            "-Dsandbox=false",
                            "-seed", "$seed",
                            "-Dassertions=true",
                            "-Dtest_dir=$runDir",
                            "-Dreport_dir=$runDir"
                        )
                        Invoke-External -Exe $JavaExe -ArgList $args -Dry:$DryRun
                    }
                    elseif ($tool -eq "Randoop") {
                        $randoopCp = "$randoopJar;$projectCp"
                        $args = @(
                            "-cp", $randoopCp,
                            "randoop.main.Main", "gentests",
                            "--testclass=$target",
                            "--time-limit=$budget",
                            "--randomseed=$seed",
                            "--junit-output-dir=$runDir",
                            "--junit-package-name=com.viktor.lab4.autogen",
                            "--regression-test-basename=RegressionTest",
                            "--error-test-basename=ErrorTest"
                        )
                        Invoke-External -Exe $JavaExe -ArgList $args -Dry:$DryRun
                    }
                    else {
                        throw "Unsupported tool: $tool"
                    }
                }
                catch {
                    $status = "FAIL"
                    $errorText = $_.Exception.Message
                    Write-Warning "Run failed: tool=$tool class=$classShort budget=$budget seed=${seed}: $errorText"
                }

                $elapsed = [Math]::Round(((Get-Date) - $start).TotalSeconds, 3)

                $rows.Add([PSCustomObject]@{
                    timestamp = (Get-Date).ToString("s")
                    tool = $tool
                    targetClass = $target
                    budgetSec = $budget
                    run = $runIndex
                    seed = $seed
                    status = $status
                    elapsedSec = $elapsed
                    outputDir = $runDir
                    error = $errorText
                }) | Out-Null
            }
        }
    }
}

$rows | Export-Csv -Path $summaryPath -NoTypeInformation -Encoding UTF8
Write-Host "`nDone. Summary: $summaryPath"

