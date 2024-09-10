FROM maven:3.9.9-eclipse-temurin-21-alpine

# copying src of your framework
COPY src /home/selenium-cucumber-bootcamp/src

# copying pom.xml of your framework
COPY pom.xml home/selenium-cucumber-bootcamp

#Running the actual command
RUN mvn -f /home/selenium-cucumber-bootcamp/pom.xml clean test -DskipTests=true