package com.shourya.MyApp;

import org.springframework.stereotype.Component;

// @Component marks this class as a Spring-managed bean
// so Spring can create and manage its object automaticall
@Component
public class Dev {


    public void build(){
        System.out.println("Working on Awesome Project");
    }
}