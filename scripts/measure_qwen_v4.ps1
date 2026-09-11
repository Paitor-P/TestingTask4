param([string]$JavaHome = 'C:/Users/user/.jdks/jbr-17.0.14')
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
$batch = 'qwen-v4-20260908-020700-5fa27f'
$suites = Join-Path $repo "src/generatedTest/$batch"
$python = Join-Path $PSScriptRoot '.venv/Scripts/python.exe'
$java = Join-Path $JavaHome 'bin/java.exe'
foreach ($required in @($suites, $python, $java)) {
    if (-not (Test-Path -LiteralPath $required)) { throw "Missing: $required" }
}
$metadataFiles = @(Get-ChildItem -LiteralPath "$suites/QwenLLM" -Recurse -Filter llm-run.json)
if ($metadataFiles.Count -ne 4) { throw 'Expected exactly four generated suites' }
$expectedTests = @{}
foreach ($file in $metadataFiles) {
    $item = Get-Content -LiteralPath $file.FullName -Raw | ConvertFrom-Json
    if ($item.status -ne 'OK' -or $item.protocol -ne 'qwen-focused-repair-v4') { throw "Unexpected generation status/protocol: $($file.FullName)" }
    $source = Join-Path $repo ('src/main/java/' + $item.target.Replace('.', '/') + '.java')
    if ((Get-FileHash -LiteralPath $source -Algorithm SHA256).Hash.ToLowerInvariant() -ne $item.sourceSha256) { throw "Production source changed: $source" }
    $expectedTests[$item.target.Split('.')[-1]] = [int]$item.accepted
}
$analysisName = 'analysis-' + (Get-Date -Format 'yyyyMMdd-HHmmss') + '-' + [guid]::NewGuid().ToString('N').Substring(0, 6)
$reportRoot = Join-Path $repo "reports/data/$batch/$analysisName"
$traces = Join-Path $reportRoot 'traces'
New-Item -ItemType Directory -Path $traces | Out-Null
$log = Join-Path $reportRoot 'analysis.log'
$previousJavaHome = $env:JAVA_HOME
$previousEncoding = $env:PYTHONIOENCODING
function Invoke-AnalysisStep([string]$Label, [string[]]$Arguments) {
    "STEP: $Label" | Tee-Object -FilePath $log -Append
    & $python -u @Arguments 2>&1 | Tee-Object -FilePath $log -Append
    if ($LASTEXITCODE -ne 0) { throw "$Label failed; see $log" }
}
Push-Location $repo
try {
    $env:JAVA_HOME = $JavaHome
    $env:PYTHONIOENCODING = 'utf-8'
    Write-Host "Analyzing existing suites: $suites"
    Write-Host "Results and log: $reportRoot"
    Invoke-AnalysisStep 'JUnit, JaCoCo and PIT (four suites)' @(
        'scripts/analyze_test_quality.py', '--tools', 'QwenLLM',
        '--generated-tests-root', $suites, '--report-root', $reportRoot)
    $qualityPath = Join-Path $reportRoot 'quality/quality_runs__tools-QwenLLM__cases-all__budgets-all__runs-all.csv'
    $quality = @(Import-Csv -LiteralPath $qualityPath)
    if ($quality.Count -ne 4 -or @($quality | Where-Object { $_.status -ne 'OK' }).Count) { throw "Not all four quality measurements succeeded; inspect $qualityPath" }
    foreach ($row in $quality) {
        if ([int]$row.testsExecuted -ne $expectedTests[$row.case] -or [int]$row.testFailures -ne 0 -or [int]$row.testSkipped -ne 0) { throw "Unexpected JUnit counts for $($row.case); inspect $qualityPath" }
        foreach ($metric in @('lineCoveragePct', 'branchCoveragePct', 'instructionCoveragePct', 'mutationScorePct')) {
            if ([string]::IsNullOrWhiteSpace($row.$metric)) { throw "Missing $metric for $($row.case)" }
        }
    }
    Invoke-AnalysisStep 'Generation outcome summary' @(
        'scripts/summarize_llm_runs.py', '--generated-tests-root', $suites, '--report-root', $reportRoot)
    Invoke-AnalysisStep 'Per-test coverage spectra (Qwen only)' @(
        'scripts/analyze_trace_similarity.py', '--tools', 'QwenLLM', '--collect-only',
        '--generated-tests', $suites, '--traces-dir', $traces, '--java', $java)
    $qwenTraces = @(Import-Csv -LiteralPath (Join-Path $traces 'qwenllm_test_traces.csv'))
    foreach ($caseName in $expectedTests.Keys) {
        if (@($qwenTraces | Where-Object { $_.program_class -eq $caseName }).Count -ne $expectedTests[$caseName]) { throw "Unexpected trace count for $caseName" }
    }
    # Compare with copies of the existing baseline traces; do not regenerate them.
    foreach ($tool in @('EvoSuite', 'Randoop')) {
        $traceName = $tool.ToLowerInvariant() + '_test_traces.csv'
        Copy-Item -LiteralPath (Join-Path $repo "reports/data/traces/$traceName") -Destination (Join-Path $traces $traceName)
        Invoke-AnalysisStep "Similarity: $tool vs QwenLLM" @(
            'scripts/analyze_trace_similarity.py', '--tools', "$tool,QwenLLM", '--skip-collect',
            '--traces-dir', $traces, '--out', (Join-Path $reportRoot 'similarity/similarity_runs.csv'))
        $pairCsv = Join-Path $reportRoot "similarity/similarity_runs__tools-${tool}-QwenLLM__classes-all__budgets-all__runs-all.csv"
        if (@(Import-Csv -LiteralPath $pairCsv).Count -ne 4) { throw "Expected four paired comparisons: $pairCsv" }
    }
    $quality | Format-Table case, testsExecuted, lineCoveragePct, branchCoveragePct, mutationScorePct, status -AutoSize
    [pscustomobject]@{ status = 'OK'; finishedAt = (Get-Date).ToString('o'); sourceRoot = $suites; reportRoot = $reportRoot; qualityCsv = $qualityPath; logFile = $log } |
        ConvertTo-Json | Set-Content -LiteralPath (Join-Path $reportRoot 'analysis-completion.json') -Encoding UTF8
    Write-Host "Results: $reportRoot"
    Write-Host 'QWEN V4 METRICS FINISHED'
} finally {
    $env:JAVA_HOME = $previousJavaHome
    $env:PYTHONIOENCODING = $previousEncoding
    Pop-Location
}
