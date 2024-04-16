package com.example.facade;

import com.example.systems.AirConditioner;
import com.example.systems.Lights;
import com.example.systems.SecuritySystem;

public class SmartHomeFacade {
    private Lights lights;
    private SecuritySystem securitySystem;
    private AirConditioner airConditioner;

    public SmartHomeFacade() {
        this.lights = new Lights();
        this.securitySystem = new SecuritySystem();
        this.airConditioner = new AirConditioner();
    }

    public void leaveHome() {
        lights.turnOff();
        securitySystem.arm();
    }

    public void returnHome() {
        securitySystem.disarm();
        lights.turnOn();
        airConditioner.setTemperature(22); // Colocar Temperatura Ambiente Quando Volta Pra Casa
    }

    public void setTemperature(int temperature) {
        airConditioner.setTemperature(temperature);
    }
}
