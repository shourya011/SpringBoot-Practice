package com.shourya.MyApp.payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Qualifier("upi")
public class UpiPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done by upi");
    }
}
