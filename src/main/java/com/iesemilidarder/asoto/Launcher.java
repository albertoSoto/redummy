package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Moto;
import com.iesemilidarder.asoto.data.Vehicle;


/**
 * com.iesemilidarder.asoto
 * Class Launcher
 * By berto. 04/10/2018
 */
public class Launcher {

    public static void main(String... args) {
        try {
            SystemUtilHelper.consolePrint("Concesionario brumbrum App 2.0");
            Moto moto = new Moto();
            moto.setPrice(123.45);
            moto.setNumWheels(9);
            moto.setColor("Blanco");
            System.out.println("Ruedas:" + moto.getNumWheels());
            moto.start();
            SystemUtilHelper.consolePrint("pista que voy!");
            moto.brake();
            Vehicle aux = new Moto();
            SystemUtilHelper.consolePrint("yuhu");
        } catch (Exception e) {
            SystemUtilHelper.logError(e);
        }

    }
}
