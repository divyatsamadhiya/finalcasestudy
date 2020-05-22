FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#maintainer
MAINTAINER parameshrdgowda97@gmail.com
#expose port 8083
EXPOSE 8083

#default command
CMD java -jar /home/docker-image.war



COPY --from=maven_build /tmp/target/docker-image.war /home/docker-image.war