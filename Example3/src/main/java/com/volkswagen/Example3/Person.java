package com.volkswagen.Example3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Slf4j
//@RequestScope
//@SessionScope
@ApplicationScope
public class Person {
    private int counter=0;

    public int getCounter(){
        return this.counter;
    }

    public void hello(){
        log.info("hello from person class.");
        counter++;
    }
}
