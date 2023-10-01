package com.volkswagen.eagerlazyintialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Application Context is initialized...");
        final Person person = context.getBean(Person.class);
        System.out.println("Person bean retrived from application context...");
    }
}
