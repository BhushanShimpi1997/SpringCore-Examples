package com.volkswagen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelineTyres implements Tyres{
    @Override
    public void moveVehicle() {
        System.out.println("Vehicel is moving with Micheline Tyres...!!!");
    }
}
