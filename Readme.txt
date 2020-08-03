Spring-boot with dorcker.
A spring boot project is a Java project you will need java to compile and build the app.

1-create a spring boot project / run in port 8484
2-create a dockerFile 
3-add 
	FROM openjdk:8
	ADD target/spring-docker.jar spring-docker.jar  
	EXPOSE 8484
	ENTRYPOINT ["java","-jar","spring-docker.jar"]
	
	3.1- FROM openjdk:8  
		this command allow you to pull an image with jdk
	3.2- ADD target/spring-docker.jar spring-docker.jar
		this command allow you to add your app.jar file
	3.3- EXPOSE 8484
		this command allow you expose port for using the app
	3.4- ENTRYPOINT ["java","-jar","spring-docker.jar"]
		this command allow you execute your jar file
4- mvn clean insall //to build your app
5- docker build -f Dockerfile -t spring-docker .
6- docker run -p 8484:8484 spring-docker
7- tryyyyyyyyyyyyyyyyyyy


Alternative 2
1-clone my project
2-install and configure docker
3-install maven
4-mvn clean insall
5-docker build -f Dockerfile -t spring-docker .
6-docker run -p 8484:8484 spring-docker
7-open a browser and test
	http://localhost:8484/api