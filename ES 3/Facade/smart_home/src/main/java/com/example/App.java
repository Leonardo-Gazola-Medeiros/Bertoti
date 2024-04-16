package com.example;

import com.example.facade.SmartHomeFacade;

public class App 
{
    public static void main( String[] args )
    {
        SmartHomeFacade smartHome = new SmartHomeFacade();

        // Leaving home
        System.out.println("Leaving home...");
        smartHome.leaveHome();

        // Returning home
        System.out.println("\nReturning home...");
        smartHome.returnHome();

        // Adjusting thermostat temperature
        System.out.println("\nAdjusting air conditioner temperature...");
        smartHome.setTemperature(22);
    }
}

