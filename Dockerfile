FROM openjdk:8
ADD target/user-service-docker.jar user-service-docker.jar
EXPOSE 8092
ENTRYPOINT ["java", "-jar", "user-service-docker.jar"]