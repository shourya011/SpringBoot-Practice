package com.shourya.MyApp;

import com.shourya.MyApp.payments.CardPayment;
import com.shourya.MyApp.payments.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shourya.MyApp")
public class AppConfig {

    @Bean
    //@Bean is for the method or complex thing where @Component can not be used
    public User createUser(){
        return new User("Aditya",18);
    }


    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
