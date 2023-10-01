package com.volkswagen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        final Person person = context.getBean(Person.class);
        System.out.println("Person Name is:"+person.getName());

        final Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name is:"+vehicle.getVehicleName());

        vehicle.playMusic();
        vehicle.moveCar();
    }
}
