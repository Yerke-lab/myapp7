@echo off
setlocal

set ERROR_CODE=0

if "%MAVEN_PROJECTBASEDIR%" == "" (
  set MAVEN_PROJECTBASEDIR=%~dp0%
)

set MAVEN_CMD_LINE_ARGS=
if not "%1" == "" (
  set MAVEN_CMD_LINE_ARGS=%*
)

call "%MAVEN_PROJECTBASEDIR%.mvn\wrapper\maven-wrapper.jar" %MAVEN_CMD_LINE_ARGS%
set ERROR_CODE=%ERRORLEVEL%

exit /b %ERROR_CODE%
