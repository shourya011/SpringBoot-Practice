package com.shourya.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    private OrderService orderService;

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment Done");

        //Not his responsibility
//        orderService.getOrderDetails();
    }
}

//Note :- If i use field injection in a private variable then the java reflection can manage it by some api by .class cuz it has every meta data of tehh class and it can do anything with that
