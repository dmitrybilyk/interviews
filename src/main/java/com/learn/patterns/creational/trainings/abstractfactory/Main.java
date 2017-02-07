package com.learn.patterns.creational.trainings.abstractfactory;

/**
 * Created by dmitry on 07.02.17.
 */
public class Main {
    public static void main(String[] args) {
        ClothesAbstractFactory abstractFactory = new PumaFactory();
        abstractFactory.getTheHat().putOn();
        abstractFactory.getTheThirt().putOn();
        abstractFactory.getShorts().putOn();
        abstractFactory.getShoes().putOn();
    }
}
