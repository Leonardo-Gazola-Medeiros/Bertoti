package com.example.facade;


public class SmartHomeFacade {
    private Lights lights;
    private SecuritySystem securitySystem;
    private Thermostat thermostat;

    public SmartHomeFacade() {
        this.lights = new Lights();
        this.securitySystem = new SecuritySystem();
        this.thermostat = new Thermostat();
    }

    public void leaveHome() {
        lights.turnOff();
        securitySystem.arm();
    }

    public void returnHome() {
        securitySystem.disarm();
        lights.turnOn();
        thermostat.setTemperature(22); // Set default temperature when returning home
    }

    public void setTemperature(int temperature) {
        thermostat.setTemperature(temperature);
    }
}
