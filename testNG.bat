set projectLocation=C:\Users\tanumay123\Desktop\Automation\Selenium_projects_workspace\com.openMRS.pom.model2
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause