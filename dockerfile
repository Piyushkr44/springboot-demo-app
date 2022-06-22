FROM openjdk:11
MAINTAINER Piyush<piyush@gmail.com>
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/cruddemo-0.0.1-SNAPSHOT.jar 
ADD ${JAR_FILE} crud-demo.jar
ENTRYPOINT ["java","-jar","/crud-demo.jar"]
