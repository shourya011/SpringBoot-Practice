package com.shourya.MyApp.payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
@Qualifier("cp")
//@Qualifier
public class CardPayment implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done by Card");
    }


}
