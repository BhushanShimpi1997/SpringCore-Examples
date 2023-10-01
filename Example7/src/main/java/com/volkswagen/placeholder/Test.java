package com.volkswagen.placeholder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Person person = context.getBean(Person.class);
        System.out.println(person);
        System.out.println(person.getAge()+person.getAge());
        System.out.println("salary:"+person.getSalary());
        System.out.println("person married ?:"+person.isMarried());
        if(person.isMarried()){
            System.out.println("yes he is married");
        }
    }
}
