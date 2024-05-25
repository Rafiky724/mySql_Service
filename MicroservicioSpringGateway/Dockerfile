FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-docker-gateway.jar
ENTRYPOINT ["java","-jar", "/spring-boot-docker-gateway.jar"]