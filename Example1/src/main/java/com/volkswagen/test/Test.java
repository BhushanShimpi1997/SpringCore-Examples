package com.volkswagen.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Car car = context.getBean(Car.class);
        final String[] beans = context.getBeanDefinitionNames();
        Arrays.stream(beans).forEach((b) -> System.out.println(b));

    }
}
