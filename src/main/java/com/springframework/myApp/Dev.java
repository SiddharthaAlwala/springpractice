package com.springframework.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired // Field Injection. // By using autowired annotation, we can autopilot class to create object.
            //It will connect the class using "By type".
    @Qualifier("laptop") // This annotation used to tell spring boot to priortize while autowiring.
    private Computer computer;
    //Constructor Injection
    //public Car(Autopilot autopilot){
     //  this.autopilot = autopilot;
    //}
    //@Autowired is by default or optional for constructor injection. nBut for Field Injection and setter Injection annotation is mandotaory.
    //Setter Injection
    //public void setAutopilot(Autopilot autopilot) {
    //    this.autopilot = autopilot;
    //}

    public void work(){
        computer.compile();
        System.out.println("Working on project.");
    }
}
