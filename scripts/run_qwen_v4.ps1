param([string]$JavaHome = 'C:/Users/user/.jdks/jbr-17.0.14')
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
$python = Join-Path $PSScriptRoot '.venv/Scripts/python.exe'
$java = Join-Path $JavaHome 'bin/java.exe'
if (-not (Test-Path -LiteralPath $python)) { throw 'Python environment missing: run uv sync --project scripts --locked' }
if (-not (Test-Path -LiteralPath $java)) { throw 'JDK 17 missing: provide -JavaHome with its installation path' }
$batch = 'qwen-v4-' + (Get-Date -Format 'yyyyMMdd-HHmmss') + '-' + [guid]::NewGuid().ToString('N').Substring(0, 6)
$outputRoot = Join-Path $repo "src/generatedTest/$batch"
$logRoot = Join-Path $repo "reports/data/$batch"
New-Item -ItemType Directory -Path $logRoot | Out-Null
$logFile = Join-Path $logRoot 'generation.log'
$previousJavaHome = $env:JAVA_HOME
$previousEncoding = $env:PYTHONIOENCODING
Push-Location $repo
try {
    $env:JAVA_HOME = $JavaHome
    $env:PYTHONIOENCODING = 'utf-8'
    Write-Host "Batch: $batch"
    Write-Host "Tests: $outputRoot"
    Write-Host "Log: $logFile"
    Write-Host 'Four classes, seed 101; up to 30 minutes per class, plus preparation.'
    & "$PSScriptRoot/setup_llm.ps1" -SkipModelPull
    # Build production classes without deleting previous analysis artifacts.
    & "$repo/gradlew.bat" --no-daemon classes
    if ($LASTEXITCODE -ne 0) { throw 'Production build failed; generation was not started' }
    & $python -u "$PSScriptRoot/generate_test_suites.py" --tools QwenLLM --seeds 101 --skip-build --java-exe $java --output-root $outputRoot 2>&1 | Tee-Object -FilePath $logFile
    $generationExitCode = $LASTEXITCODE
    $runs = @(Get-ChildItem -LiteralPath $outputRoot -Recurse -Filter llm-run.json -ErrorAction SilentlyContinue | ForEach-Object {
        $item = Get-Content -LiteralPath $_.FullName -Raw | ConvertFrom-Json
        [pscustomobject]@{ target = $item.target; status = $item.status; accepted = $item.accepted; stopReason = $item.stopReason; elapsedSec = $item.elapsedSec; metadata = $_.FullName }
    })
    $completion = Join-Path $logRoot 'completion.json'
    [pscustomobject]@{ finishedAt = (Get-Date).ToString('o'); exitCode = $generationExitCode; outputRoot = $outputRoot; logFile = $logFile; runs = $runs } |
        ConvertTo-Json -Depth 5 | Set-Content -LiteralPath $completion -Encoding UTF8
    $runs | Format-Table target, status, accepted, stopReason -AutoSize
    Write-Host "Completion record: $completion"
    if ($generationExitCode -ne 0) { throw "Generation failed (exit $generationExitCode); inspect generation.log and completion.json" }
    if ($runs.Count -ne 4) { throw "Expected four completed runs, found $($runs.Count); inspect the log" }
    Write-Host 'QWEN V4 BATCH FINISHED. Empty or partial suites are possible; see the table above.'
} finally {
    $env:JAVA_HOME = $previousJavaHome
    $env:PYTHONIOENCODING = $previousEncoding
    Pop-Location
}
