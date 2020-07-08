package com.learn.patterns.structural.bridge.trainings2;

/**
 * Created by dik81 on 07.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(new RedColor());
        car.applyColor();
    }
}
