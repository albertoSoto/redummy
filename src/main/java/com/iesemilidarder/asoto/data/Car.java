package com.iesemilidarder.asoto.data;

/**
 * com.iesemilidarder.asoto.data
 * Class Car
 * By berto. 08/10/2018
 */
public class Car extends Vehicle {

    public Car(String name){
        super(name);
        System.out.println("asd");
    }

    /**
     * Starts the engine on my mode
     */
    public void start() {
        doLog("Brum brum de coche");
    }
}
