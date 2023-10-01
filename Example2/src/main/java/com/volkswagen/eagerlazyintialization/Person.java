package com.volkswagen.eagerlazyintialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {
    private String name;

    public Person(){
        System.out.println("Person class constructor called..bean instantiated...!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
