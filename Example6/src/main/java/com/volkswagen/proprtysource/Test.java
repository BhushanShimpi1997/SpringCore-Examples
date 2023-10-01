package com.volkswagen.proprtysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
