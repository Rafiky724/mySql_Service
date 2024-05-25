FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-docker-eureka.jar
ENTRYPOINT ["java","-jar", "/spring-boot-docker-eureka.jar"]