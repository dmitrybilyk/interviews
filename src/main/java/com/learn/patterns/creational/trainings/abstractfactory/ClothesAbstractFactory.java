package com.learn.patterns.creational.trainings.abstractfactory;

/**
 * Created by dmitry on 07.02.17.
 */
public interface ClothesAbstractFactory {
    OutletItem getTheHat();
    OutletItem getTheThirt();
    OutletItem getShorts();
    OutletItem getShoes();
}
