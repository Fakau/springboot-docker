package com.engine.fakau.springdocker;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RespApi {
	@GetMapping
	public List<String> getListOfPerson(){
		return SpringDockerApplication.personName;
	}
 
}
