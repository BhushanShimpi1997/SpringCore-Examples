package com.volkswagen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("application context is initialized..");
    }
}
