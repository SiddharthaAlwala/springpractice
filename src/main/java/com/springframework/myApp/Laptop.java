package com.springframework.myApp;

import org.springframework.stereotype.Component;

@Component // spring boot will create object for the Autopilot class.
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compiling with 5 errors");
    }
}
