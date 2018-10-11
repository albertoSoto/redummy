package com.iesemilidarder.asoto.data;

/**
 * com.iesemilidarder.asoto.data
 * Class Submarine
 * By berto. 08/10/2018
 */
public class Submarine extends WaterCraft implements IDive{

    public void goDeeper() {

    }

    public void goSurface() {

    }

    public void doFloat() {
        super.doFloat();
        System.out.println("Floto, pero tambien me piro!");
    }
}
