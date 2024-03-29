package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProjectApplication {

	@GetMapping("/")
	public String welcomeToSpar(){
		return "Welcome to Spar";
	}

	@GetMapping("/{input}")
	public String WelcomeToSparICS(@PathVariable String input){
		return "Welcome to Spar-ICS " + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
