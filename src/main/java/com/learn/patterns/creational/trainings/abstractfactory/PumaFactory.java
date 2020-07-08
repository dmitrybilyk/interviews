package com.learn.patterns.creational.trainings.abstractfactory;

/**
 * Created by dmitry on 07.02.17.
 */
public class PumaFactory implements ClothesAbstractFactory {
    @Override
    public OutletItem getTheHat() {
        return new PumaHatItem();
    }

    @Override
    public OutletItem getTheThirt() {
        return new PumaTshirtItem();
    }

    @Override
    public OutletItem getShorts() {
        return new PumaShortsItem();
    }

    @Override
    public OutletItem getShoes() {
        return new PumaShoesItem();
    }
}
