package com.shourya.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component marks this class as a Spring-managed bean
// so Spring can create and manage its object automatically
@Component
public class Dev {


    //@Autowired :- Automatically resolve and inject collaborating beans into your class
    //field injection
    @Autowired
    // @Qualifier :- it uses the name of the class but in small letters
    // can be used other than Primary
    //@Qualifier("laptop")
    private Computer comp;

    //constructor injection
    //Recommended and @Autowired is optional
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();

        System.out.println("Working on Awesome Project");
    }
}