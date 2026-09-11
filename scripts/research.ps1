param(
    [ValidateSet('measure', 'extend')][string]$Action = 'measure',
    [int[]]$Seeds,
    [switch]$WithTraces,
    [string]$JavaHome = 'C:/Users/user/.jdks/jbr-17.0.14',
    [string]$Suites = 'src/generatedTest/qwen-v4-20260908-020700-5fa27f'
)
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
Push-Location $repo
try {
    $options = @($Action, '--java-home', $JavaHome, '--suites', $Suites)
    if ($Seeds) { $options += @('--seeds', ($Seeds -join ',')) }
    if ($WithTraces) { $options += '--with-traces' }
    & "$PSScriptRoot/.venv/Scripts/python.exe" -u "$PSScriptRoot/research_workflow.py" @options
    if ($LASTEXITCODE -ne 0) { throw 'Workflow did not finish successfully; inspect WORKFLOW FAILED and workflow.log' }
} finally { Pop-Location }
