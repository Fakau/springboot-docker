FROM openjdk:8
ADD target/spring-docker.jar spring-docker.jar
EXPOSE 8484
ENTRYPOINT ["java","-jar","spring-docker.jar"]