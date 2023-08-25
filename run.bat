set projectLocation=D:\EclipseFiles\AppiumProject
cd %projectLocation%
java -classpath %projectLocation%\bin;%projectLocation%\lib;%projectLocation%\lib\testng-7.0.0.jar
java -jar lib\testng-7.0.0.jar %projectLocation%\testng.xml
pause