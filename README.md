# Pre-requisits
Before building the project please have the following tools installed.

### Java
###### Windows
For this project to run you must have installed a version of Java8 or higher on your machine.

1. [Download JAVA for Windows](https://www.oracle.com/java/technologies/downloads/#java8-windows)
2. Install following the steps in the installer
3. Create a JAVA_HOME system environment variable and add the path to the jdk folder on your system
4. Add jdkxxx/bin to PATH system environment variable
5. Restart machine and check that Java was installed in the command line with java -version (javac -version) if it prints the version java is configured correctly

###### Mac
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



###Maven
1. [Download Maven](https://maven.apache.org/download.cgi)
2. Extract the zip file
3. Add maven to System PATH 
4. On Windows machine go to Environment Variables > System Variables> PATH
5. Open PATH and click on New
6. Add the the path to the bin folder ```example C:\apache-maven-3.8.5\bin```
7. Click OK and Apply
8. Open the Command Line and type in the command ```mvn -v```  and it should return the maven version

###Git


### IntelIJ



###HOW TO RUN PROJECT
First time run -> ```mvn clean test``` 
Run All the tests with report generation ```mvn clean verify```
Run individual tests from 
