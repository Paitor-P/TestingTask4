param([switch]$SkipDownload, [switch]$SkipModelPull)
$ErrorActionPreference = 'Stop'
$repo = Split-Path $PSScriptRoot -Parent
$runtime = Join-Path $repo 'tools/ollama'
$version = '0.33.3'
$archive = Join-Path $runtime 'ollama-windows-amd64.zip'
New-Item -ItemType Directory -Force $runtime | Out-Null
if (-not (Test-Path (Join-Path $runtime 'ollama.exe'))) {
    if (-not $SkipDownload) {
        & curl.exe -L --fail --retry 3 -o $archive "https://github.com/ollama/ollama/releases/download/v$version/ollama-windows-amd64.zip"
        if ($LASTEXITCODE -ne 0) { throw 'Ollama download failed' }
    }
    $expectedHash = '52cb36a62e7e501f61514f60212dec7117b6c098811357585e02fffe32d2fcd7'
    if ((Get-FileHash -LiteralPath $archive -Algorithm SHA256).Hash.ToLowerInvariant() -ne $expectedHash) {
        throw 'Ollama archive checksum mismatch'
    }
    Expand-Archive -LiteralPath $archive -DestinationPath $runtime -Force
}
$env:OLLAMA_HOST = '127.0.0.1:11435'
$env:OLLAMA_MODELS = Join-Path $repo 'tools/ollama-models'
$env:OLLAMA_NUM_PARALLEL = '1'
$env:OLLAMA_MAX_LOADED_MODELS = '1'
$env:OLLAMA_NO_CLOUD = '1'
$exe = Join-Path $runtime 'ollama.exe'
try { $null = Invoke-RestMethod 'http://127.0.0.1:11435/api/version' } catch {
    $process = Start-Process -FilePath $exe -ArgumentList 'serve' -WindowStyle Hidden -PassThru -RedirectStandardOutput (Join-Path $runtime 'server.stdout.log') -RedirectStandardError (Join-Path $runtime 'server.stderr.log')
    $process.Id | Set-Content (Join-Path $runtime 'server.pid')
    $ready = $false
    for ($i = 0; $i -lt 30; $i++) {
        Start-Sleep -Seconds 1
        try { $null = Invoke-RestMethod 'http://127.0.0.1:11435/api/version'; $ready = $true; break } catch { }
    }
    if (-not $ready) { throw 'Ollama did not start; inspect tools/ollama/server.stderr.log' }
}
if (-not $SkipModelPull) {
    & $exe pull 'qwen2.5-coder:3b'
    if ($LASTEXITCODE -ne 0) { throw 'Model download failed' }
}
& $exe list
Write-Host 'Local endpoint: http://127.0.0.1:11435. Run this script again after a reboot.'
