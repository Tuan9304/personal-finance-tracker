@echo off
setlocal enabledelayedexpansion

set cksty=checkstyle-10.20.0
set jar_path=linter\%cksty%.jar

REM Check if the Checkstyle JAR file already exists and download it if not
if exist %jar_path% (
    echo Checkstyle JAR file already exists, skipping download.
) else (
    echo Downloading Checkstyle JAR file...
    powershell -Command "Invoke-WebRequest -Uri https://github.com/checkstyle/checkstyle/releases/download/%cksty%/%cksty%-all.jar -OutFile %jar_path%"
)

REM Find the index of the first parameter with a Java file path
set idx=1
set files=

:find_java_file
if "%~1"=="" goto :run_checkstyle
if "%~x1"==".java" (
    set idx=%1
    goto :set_files
)
shift
goto :find_java_file

:set_files
set files=%*
goto :run_checkstyle

:run_checkstyle
REM Run Checkstyle on the specified files
java -jar %jar_path% -c linter\sun_checks.xml %files%

REM Capture the exit code from the java command
set exit_code=%ERRORLEVEL%

endlocal & exit /b %exit_code%
