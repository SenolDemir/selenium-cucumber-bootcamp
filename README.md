# Selenium - Cucumber Bootcamp Project

- Build Tool: Maven
- Test Framework: Cucumber BBD (with JUnit Assertions)
- Framework design is based on Page Object Model

## System Requirements
Java 8+ JDK
Apache Maven (to be able to run tests by command line)

## Environment
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login



### Remote driver
it is created to use with selenium grid in local or in any other urls




## Running Test with Docker

The driver should be RemoteWebDriver  
and url should be localhost:4444

Create DockerFile of project in root folder  
Create Docker Image of project within root folder
```
docker build -t dockertestimage .
```

Run the container for selenium/standalone-chrome-debug:latest in same directory  
```
docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome-debug:latest
```
Run the container of docker image of test project  
```
docker run -d --network="host" dockertestimage mvn -f /home/selenium-cucumber-bootcamp/pom.xml clean test -Dbrowser="chrome"
```

If you see the conatiner Id on the console your test should be runned.  
To see the details of testing:
```
docker logs {containerId}
```

