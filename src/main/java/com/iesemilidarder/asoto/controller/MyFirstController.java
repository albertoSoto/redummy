package com.iesemilidarder.asoto.controller;

import com.iesemilidarder.asoto.DataHelper;
import com.iesemilidarder.asoto.data.Car;
import com.iesemilidarder.asoto.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.iesemilidarder.asoto.controller
 * Class MyFirstController
 * By berto. 17/10/2018
 */
@RestController
public class MyFirstController {

    @RequestMapping("/getAll")
    public List<Vehicle> getCars(){
        List<Vehicle> items = DataHelper.getData();
        return items;
    }

    @RequestMapping("/car")
    public Vehicle getCar(@RequestParam(value = "name", defaultValue = "BrumBrum") String name) {
        Car car = new Car(name);
        //car.setName(name);
        DataHelper.insert(car);
        return car;
    }
}
