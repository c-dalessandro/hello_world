FROM openjdk:17.0.2
EXPOSE 8080
ARG JAR_FILE=target/hello_world-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]