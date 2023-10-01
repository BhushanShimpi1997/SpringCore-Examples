package com.volkswagen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public void playMusic(){
        speakers.playMusic();
    }

    public void moveCar(){
        tyres.moveVehicle();
    }
}
