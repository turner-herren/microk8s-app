FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./build/libs/microk8s-app-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]