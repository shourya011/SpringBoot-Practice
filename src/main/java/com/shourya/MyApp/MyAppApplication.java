package com.shourya.MyApp;

import com.shourya.MyApp.notification.EmailService;
import com.shourya.MyApp.notification.NotificationService;
import com.shourya.MyApp.notification.PopUpNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		// Starts the Spring Boot application and creates the ApplicationContext or simply it create a IOC container
		SpringApplication.run(MyAppApplication.class, args);
		NotificationService obj = new PopUpNotificationService();
		OrderService service = new OrderService(obj);
		service.placeOrder();

	}
}
