package com.volkswagen.proprtysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/application.properties")
public class Config {

    @Autowired
    Environment env;

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName(env.getProperty("name"));
        person.setAge(env.getProperty("age", Integer.class));
        person.setCity(env.getProperty("city","Thalner"));
        return person;
    }
}
