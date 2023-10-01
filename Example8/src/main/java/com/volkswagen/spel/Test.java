package com.volkswagen.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
