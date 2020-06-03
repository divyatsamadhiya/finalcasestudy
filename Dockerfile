FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#maintainer
MAINTAINER ashutosh.2377@gmail.com
#expose port 8084
EXPOSE 8084

#default command
CMD java -jar /home/finalcasestudy-docker-jenkins.war



COPY --from=maven_build /tmp/target/finalcasestudy-docker-jenkins.war /home/finalcasestudy-docker-jenkins.war
