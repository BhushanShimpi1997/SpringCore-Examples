package com.volkswagen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({Person.class})
public class Example9Application {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(Example9Application.class, args);
	    Person person = context.getBean(Person.class);
		System.out.println(person);
	}

}
