package com.spring_intro.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {
	//create a logger object
	private static final Logger logger = LoggerFactory.getLogger(GreetingApplication.class);

	public static void main(String[] args) {
		logger.info("Spring Boot application is starting...");
		SpringApplication.run(GreetingApplication.class, args);
		logger.info("Spring Boot application started successfully");
	}

}
