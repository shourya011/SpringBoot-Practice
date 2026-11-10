package com.shourya.MyApp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy()
public class TempB {
    private TempA a;
    public TempB(TempA a) {
        this.a = a;
    }
    public void bye(){
        System.out.println("bye");
        a.temp();
    }
}
