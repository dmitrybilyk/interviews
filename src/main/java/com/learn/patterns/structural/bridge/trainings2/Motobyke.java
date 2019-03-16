package com.learn.patterns.structural.bridge.trainings2;

/**
 * Created by dik81 on 07.02.19.
 */
public class Motobyke extends Vehicle {

    public Motobyke(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("applying color - " + color + "for Motobyke");
    }
}
