package com.volkswagen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final String[] definations = context.getBeanDefinitionNames();
        for (String str: definations)
        {
            System.out.println(str);
        }
    }
}
