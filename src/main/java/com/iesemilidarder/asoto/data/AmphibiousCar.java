package com.iesemilidarder.asoto.data;

/**
 * com.iesemilidarder.asoto.data
 * Class AmphibiousCar
 * By berto. 08/10/2018
 */
public class AmphibiousCar extends Car implements INavigation {

    public AmphibiousCar(String name) {
        super(name);
    }

    public void doFloat() {
        doLog("Como mola como floto");
    }
}
