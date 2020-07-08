package com.learn.patterns.structural.bridge.trainings2;

/**
 * Created by dik81 on 07.02.19.
 */
public abstract class Vehicle {
    protected Color color;
    public Vehicle(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
