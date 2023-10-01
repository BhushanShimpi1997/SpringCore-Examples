package com.volkswagen.test;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name="ferari";

    public Car(String name){
        this.name=name;
    }
}
