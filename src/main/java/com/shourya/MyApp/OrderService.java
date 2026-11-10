package com.shourya.MyApp;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // eager initialization and it just created the object/bean of the classes which are in IOC Container(@Component)
// and it give same object to everyone who calls it by getbean() method
//Singleton doesnt mean that IoC container have one object per class but it means that one object has its own bean definition
//stateless
// eager can be converted to lazy by @Lazy but not vice versa
//when we do the @Lazy in the parameter only then IoC passes the proxy which means like a dummy so it can be used
//Why spring to singleton as default beacuse to solve "FAIL FAST"


//@Scope("prototype") // lazy initialization and opposite of it and give different objects to everyone who calls it
//In Spring IoC, Singleton scope means that one bean definition has only one shared object (instance) per IoC container.
//stateful
public class OrderService {

    public OrderService() {
        System.out.println("Order Service Constructor");
    }

    public void placeOrder(){
        System.out.println("Order is Placed");
    }
}
