package com.volkswagen;

import org.springframework.stereotype.Component;

@Component
public class MRFTyres implements Tyres{
    @Override
    public void moveVehicle() {
        System.out.println("Vehicle is moving with MRF Tyres..!!!");
    }
}
