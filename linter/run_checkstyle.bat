@echo off
setlocal enabledelayedexpansion

set cwd="linter/"

set output=""
for /f "delims=" %%i in ('java -jar %cwd%/checkstyle-10.20.0-all.jar -c %cwd%/google_checks.xml src/') do (
    echo %%i
    set output=!output! %%i
)

echo !output! | findstr /C:"[WARN]" >nul
if %ERRORLEVEL% == 0 (
    exit /b 1
) else (
    exit /b 0
)

endlocal
