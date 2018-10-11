package com.iesemilidarder.asoto.data;

import com.sun.istack.internal.localization.NullLocalizable;

/**
 * com.iesemilidarder.asoto.data
 * Class Vehicle
 * By berto. 04/10/2018
 */
public abstract class Vehicle {
    private String color;
    private Integer numWheels;
    private Double price;



    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }

    /**
     * Prints the message where it should
     *
     * @param message txt
     */
    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
