package com.shourya.MyApp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TempA {
    private TempB b;
    public TempA(@Lazy TempB b) {
        this.b = b;
    }
    public void hello(){
        System.out.println("hello");
        b.bye();
    }
    public void temp(){
        System.out.println("temp");
    }

}
