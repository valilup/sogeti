# JAVA - CUCUMBER FRAMEWORK
## This is a BDD-Cucumber framework testing a website using GUI and API tests
#### TOOLS:
- Maven - project builder and dependency manager
- Java
- Cucumber - supports behavior-driven development It allows expected software behaviors to be specified in a logical language that customers can understand
- SeleniumWebDriver - API that gives us the possibility to interact with the browser elements 
- TestNG - as a test runner
- RestAssured - library for API testing
- SimpleJson - library to parse JSON objects
- JavaFaker - library to create fake data
- GitHub - online repository
- Git - version control 

#TODO: 
- Integrate the framework into a CI/CD pipeline
- Create env file to hide sensitive data 


# Pre-requisites
Before building the project, please have the following tools installed:
1. Java
2. Maven
3. Git
4. IntelliJ


### Java
##### Windows
For this project to run, you must have installed a version of Java8 or higher on your machine.

1. [Download JAVA for Windows](https://www.oracle.com/java/technologies/downloads/#java8-windows)
2. Install following the steps in the installer
3. Create a JAVA_HOME system environment variable and add the path to the jdk folder on your system
4. Add jdkxxx/bin to the PATH system environment variable
5. Restart machine and check that Java was installed in the command line with java -version (javac -version) if it prints the version java is configured correctly

##### Mac
1. Check if Java is installed on your mac 
   1. Open Terminal
   2. Insert ```java -version```
   3. If it returns ```java version "xx"
      Java(TM) SE Runtime Environment (build xx)
      Java HotSpot(TM) 64-Bit Server VM (build 23.2-b04, mixed mode)```
   4. This means you should be set
2. [Download Java](https://www.oracle.com/java/technologies/downloads/#java8-mac)
3. Install the downloaded package
4. Open Terminal
5. Check location of java_home path ``` /usr/libexec/java_home``` this will return the java_home path
6. Open the .bash_profile ```open -e .bash_profile```
7. Edit the .bash_profile and add the ```export JAVA_HOME=/Library/Java/JavaVirutalMachines/jdkxxx.jdk/Content/Home``` and path that was returned at java_home (step 5)
8. Save the .bash_profile file
9. In the terminal refresh the .bash_profile file ```source ~/.bash_profile```
10. Echo the value of JAVA_HOME ```echo $JAVA_HOME``` it should return the value stored in the /.bash_profile
11. Check java version ```java -version```it should return ```java version "xx"
    Java(TM) SE Runtime Environment (build xx)
    Java HotSpot(TM) 64-Bit Server VM (build 23.2-b04, mixed mode)```
12. Check java compiler version ```javac -version``` it should return ```javac xxxx```



### Maven
#### Windows
1. [Download Maven](https://maven.apache.org/download.cgi) -> ```apache-maven-3.8.5-bin.zip```
2. Extract the zip file
3. Add maven to System PATH 
4. On Windows machine go to Environment Variables > System Variables> PATH
5. Open PATH and click on New
6. Add the path to the bin folder ```example C:\apache-maven-3.8.5\bin```
7. Click OK and Apply
8. Open the Command Line and type in the command ```mvn -v```  and it should return the maven version

#### Mac
1. [Download Maven](https://maven.apache.org/download.cgi) -> ```apache-maven-3.8.5-bin.zip```
2. Extract the zip file
3. Open Terminal 
   - check that you are in your users location on terminal by typing ```pwd```
         it should return ```/Users/youruser```
   - type ```ls -a``` and the ```.bash_profile``` should be there
   - open in text editor the ```.bash_profile``` by typing ```open -e```
   - add these in your ````.bash_profile```` file 
   - ```export M2_HOME=/Applications/apache-maven-3.8.5```
   - ```export PATH=$PATH:$M2_HOME/bin```
   - save the file and close it
   - close Terminal and open Terminal again
   - to check if maven is installed on your system check with ```mvn -v``` command
   - and the version of maven should be returned ```Apache Maven 3.8.5```

### Git
#### Windows
1. [Download Git](https://git-scm.com/download/win)
2. Download ```64-bit Git for Windows Setup``` 
3. Open the installer and follow the instructions to install 
4. Open Command Prompt 
5. Type ```git --version```
6. Should return the example```git version 2.xx.x.windows.2``` git version you installed

### Mac
1. [Download Git](https://git-scm.com/download/mac)
2. Click on installer button from the Binary installer section
3. Click on download
4. Open the downloaded file
5. Double-click on the git-2.xx.x.pkg file
6. The installer should open
7. Follow the instructions to install
8. After the installation is finished, open Terminal
9. Type ```git --version```
10. Should return the example ```git version 2.xx.x```


### IntelliJ
- Installing IntelliJ is similar on mac and windows machines 
- [Download IntelliJ IDEA Community - Windows](https://www.jetbrains.com/idea/download/#section=windows)
- [Download IntelliJ IDEA Community - Mac](https://www.jetbrains.com/idea/download/#section=mac)
- Download the Community edition 
- Double-click on the downloaded installer
- Follow the instructions from the installer
- After the installation is finished, launch the IntelliJ IDEA


### Clone Project
Clone the sogeti project with IntelliJ
- Open IntelliJ
- click on Get from VCS
- paste the url from the sogeti project into the URL field
- click on the Clone button


### HOW TO RUN PROJECT
- Open integrated Terminal in IntelliJ
- In the folder where the pom.xml is run the following command 
- First time run -> ```mvn clean test```

#### Run in IntelliJ
- Run All tests from ```runner/TestRunner.java``` file by clicking on the Green Arrow and clicking ```Run:TestRunner```
- Feature files can be found in the ```resources/features/``` folder
- Run all the Scenarios in a Feature by clicking on the Green Arrows from on the left of the Feature and clicking ```Run:'Feature:FeatureName'```
- Run 1 Scenario from a Feature by clicking on the Green Arrows from on the left of the Scenario and clicking ```Run:'Scenario:ScenarioName'```

#### Report
After running the tests with ```mvn clean test``` command
a online cucumber report is generated 
and the link to the report can be found in the console, after the execution of the tests.

To view the report of the tests you can click on the link

```
????????????????????????????????????????????????????????????????????????????
? View your Cucumber Report at:                                            ?
? https://reports.cucumber.io/reports/89bed6d2-80c1-4190-8f11-3623f9bf90e4 ?
?                                                                          ?
? This report will self-destruct in 24h.                                   ?
? Keep reports forever: https://reports.cucumber.io/profile                ?
????????????????????????????????????????????????????????????????????????????
```