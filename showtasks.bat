call runcrud.bat
if "%ERRORLEVEL%" == "0" goto runbrowser
echo.
echo Cannot run the file.

:runbrowser
start chrome http://localhost:8080/crud/v1/task/getTasks
goto end

:end
echo.
echo DONE