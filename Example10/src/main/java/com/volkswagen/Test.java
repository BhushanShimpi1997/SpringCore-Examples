package com.volkswagen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Bank bank = context.getBean(Bank.class);
        bank.makePayment();
    }
}
