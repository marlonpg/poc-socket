@echo off
set JAVA_HOME=C:\Users\gamba\.jdks\corretto-25.0.1
set PATH=%JAVA_HOME%\bin;%PATH%
echo Compiling Java files...
javac *.java
echo Starting server...
java Server