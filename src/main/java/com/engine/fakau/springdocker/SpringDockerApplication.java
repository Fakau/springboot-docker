package com.engine.fakau.springdocker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDockerApplication {
    public static List<String> personName = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}
	@Bean
	public void  addPerson() {
		personName.add("Laurent Kafka M.");
		personName.add("Lisa Naika G.");
		personName.add("Elita Daline M.");
		personName.add("Lange Hebertini");
		personName.add("Sammuel Lio");
		personName.add("Ignace Sammuel M.");
	}
	

}
