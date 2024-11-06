@echo off
setlocal enabledelayedexpansion

set cwd="linter/"

set cksty="checkstyle-10.20.0"

REM TODO: make it compatible with Windows
REM wget -qNO %cwd%/%cksty%.jar https://github.com/checkstyle/checkstyle/releases/download/%cksty%/%cksty%-all.jar

set output=""
for /f "delims=" %%i in ('java -jar %cwd%/%cksty%.jar -c %cwd%/sun_checks.xml src/') do (
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
