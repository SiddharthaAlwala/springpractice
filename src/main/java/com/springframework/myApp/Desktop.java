package com.springframework.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // spring boot will create object for the Autopilot class.
@Primary // @Primary annotation is used to priortize the component while autowiring.
// So when you run the application, in Dev class as we are added autowired to the computer it will priortize to the Desktop component.

public class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling with 10 errors");
    }
}
