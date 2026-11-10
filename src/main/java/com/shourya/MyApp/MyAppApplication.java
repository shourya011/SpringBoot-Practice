package com.shourya.MyApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TempA a = context.getBean(TempA.class);
		a.hello();
//		OrderService order1 = context.getBean(OrderService.class);
//
//		OrderService order2 = context.getBean(OrderService.class);
//
//		if(order1 == order2) {
//			System.out.println("Order 1 and Order 2 is the same");
//		}


	}
}
