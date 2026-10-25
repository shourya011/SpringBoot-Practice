package com.shourya.MyApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @RestController is used to handle web requests and return data directly in the response body
@RestController
public class Hello {

    // Maps HTTP requests to the root URL ("/") to this method
    @RequestMapping("/")
    public String greet(){

        return "Hello World";
    }
}
