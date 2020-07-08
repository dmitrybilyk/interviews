package com.learn.patterns.structural.bridge.trainings2;

/**
 * Created by dik81 on 07.02.19.
 */
public class Car extends Vehicle {

    public Car(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("applying color - " + color + "for Car");
    }
}
