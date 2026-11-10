package com.shourya.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();

        //its his responsibility
        getOrderDetails();

        System.out.println("Order Placed");
    }

    public void getOrderDetails(){
        System.out.println("Order Details");
    }
}
