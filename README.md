# Selenium - Cucumber Bootcamp Project

- Build Tool: Maven
- Test Framework: Cucumber BBD (with JUnit Assertions)
- Framework design is based on Page Object Model and Singleton Pattern

## System Requirements
Java 8+ JDK
Apache Maven (to be able to run tests by command line)
Docker (in case of Dockerization of test project)

## Environment
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login


## Report Generation
To generate "HTML Maven Cucumber Report":
- Open Maven right side panel  
- Double Click Project's Lifecycle  
- Click "verify"
- or in the root folder of project give the command `mvn verify`  
- It can be reached under target folder


## Dockerization


The driver should be RemoteWebDriver  
and url should be http://localhost:4444

Create DockerFile of project in root folder  
Create Docker Image of project within root folder
```
docker build -t {nameofimage} .
```

Run the container for selenium/standalone-chrome-debug:latest in same directory  
```
docker run -d -p 4444:4444 -p 7900:7900 --shm-size="2g" selenium/standalone-chrome-debug:latest
```
Run the container of docker image of test project  
```
docker run -d --network="host" {nameofimage} mvn -f /home/selenium-cucumber-bootcamp/pom.xml clean test -Dbrowser="chrome"
```

If you see the conatiner Id on the console your test should be runned.  
To see the details of testing:
```
docker logs {containerId}
```

