package com.iesemilidarder.asoto.data.schoolthings;

import java.util.ArrayList;

/**
 * com.iesemilidarder.asoto.data.schoolthings
 * Class Playground
 * By berto. 18/10/2018
 */
public class Playground {

    public static void main(String... args){
        System.out.println("Hola !!!");
        int numItems = 6;
        ArrayList<Activity> items = new ArrayList<>();
        for(int i = 0;i<numItems;i++){
            System.out.println("Iteration" + 1);
            Activity item = new Activity();
            item.setName("Elemento "+ i);
            item.setDuration(i*10);
            items.add(item);
        }
        System.out.println("fin");
    }
}
