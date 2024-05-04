FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/spring-boot-devops-integration.jar spring-boot-devops-integration.jar
ENTRYPOINT ["java","-jar","spring-boot-devops-integration.jar"]