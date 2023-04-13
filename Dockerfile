FROM openjdk:8 as builder
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]