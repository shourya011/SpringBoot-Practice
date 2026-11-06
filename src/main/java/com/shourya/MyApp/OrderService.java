package com.shourya.MyApp;

import com.shourya.MyApp.payments.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    private PaymentService payment;


//    OrderService(@Qualifier("upi") PaymentService payment){}
    @Autowired //optional
    OrderService(PaymentService payment){
        this.payment = payment;
    }

    OrderService(){

    }
    void placeOrder(){
        payment.pay();
        System.out.println("Order has been Placed");
    }
}
