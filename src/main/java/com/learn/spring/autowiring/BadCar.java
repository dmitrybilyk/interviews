package com.learn.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class BadCar extends Car {

    @Autowired
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

//    public void setDriver(Driver driver) {
//        this.driver = driver;
//    }

    @Override
    public void ride() {
        System.out.println("good ride - " + driver.getName());
    }
}
