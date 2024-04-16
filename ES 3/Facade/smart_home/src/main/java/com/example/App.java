package com.example;

import com.example.facade.SmartHomeFacade;

public class App 
{
    public static void main( String[] args )
    {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // Leaving home
        System.out.println("Saindo de Casa...");
        smartHome.leaveHome();

        // Returning home
        System.out.println("\nVoltando Para Casa...");
        smartHome.returnHome();

        // Adjusting thermostat temperature
        System.out.println("\nAjustando a Temperatura do Ar Condicionado...");
        smartHome.setTemperature(22);
    }
}

