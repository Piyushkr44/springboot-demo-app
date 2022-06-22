FROM maven AS MAVEN_BUILD
#copy the source tree and pom.xml to our new container
COPY ./ ./
#package our application code
RUN mvn clean package
#set the startup command to execute the jar file #second stage of our build will use openjdk
FROM openjdk:11
#copy only the artifacct from the first stage and discard rest
COPY --from=MAVEN_BUILD /target/springdemoapp-0.0.1-SNAPSHOT.jar /springdemoapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/springdemoapp-0.0.1-SNAPSHOT.jar"]
