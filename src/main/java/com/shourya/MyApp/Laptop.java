package com.shourya.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//It will be selected as the one to be choosen from both of the classes with implement same interface
@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling with 404 bugs");
    }
}
