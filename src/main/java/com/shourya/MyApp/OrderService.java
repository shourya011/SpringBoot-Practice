package com.shourya.MyApp;

import com.shourya.MyApp.notification.NotificationService;
import org.springframework.core.annotation.Order;

public class OrderService {
    NotificationService notification;

    OrderService(NotificationService notification){
        this.notification = notification;
    }

    OrderService(){

    }

    void Setter(NotificationService notification){
        this.notification = notification;
    }

    void placeOrder(){
        System.out.println("Order has been Placed");
        notification.sentNotification();
    }
}
