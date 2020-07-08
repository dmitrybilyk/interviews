package com.learn.patterns.creational.trainings.abstractfactory;

/**
 * Created by dmitry on 07.02.17.
 */
public class AdidasShoesItem implements OutletItem {
    @Override
    public void putOn() {
        System.out.println("adidas shoes item");
    }
}
