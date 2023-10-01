package com.volkswagen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String vehicleName = "Volkswagen";
    @Autowired
    private VehicleService vehicleService;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void playMusic(){
        vehicleService.playMusic();
    }

    public void moveCar(){
        vehicleService.moveCar();
    }
}
