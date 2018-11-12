package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Moto;
import com.iesemilidarder.asoto.data.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * com.iesemilidarder.asoto
 * Class BaseLauncher
 * By berto. 05/11/2018
 */
public class BaseLauncher {
    public static void main(String... args){
        Moto aux = new Moto();
        aux.setName("brum1rueda");
        DataHelper.insert(aux);
        List<Vehicle> data = DataHelper.getData();
        // JAVA8
        for (Vehicle v:data) {
            System.out.println(v.getName());
            System.out.println(v.getClass().toString());
        }
        // PLEISTOCENO
        for (int i = 0;i<data.size();i++){
            Vehicle v = data.get(0);
            System.out.println(v.getName());
        }
        //FUNCTIONAL

    }
}
