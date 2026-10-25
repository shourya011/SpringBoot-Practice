package com.shourya.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		// Starts the Spring Boot application and creates the ApplicationContext or simply it create a IOC container
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		// Retrieves the Dev bean managed by Spring from the ApplicationContext or points to the object which is present in the IOC container
		//Dependency Injection(IC)
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
