package com.shourya.MyApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		//.class gives the meta data of the class like variables,members and methods and other things as well
		//used to awake to IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OrderService obj = context.getBean(OrderService.class);

		obj.placeOrder();


	}
}
