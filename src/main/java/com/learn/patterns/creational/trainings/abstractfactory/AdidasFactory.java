package com.learn.patterns.creational.trainings.abstractfactory;

/**
 * Created by dmitry on 07.02.17.
 */
public class AdidasFactory implements ClothesAbstractFactory{
    @Override
    public OutletItem getTheHat() {
        return new PumaHatItem();
    }

    @Override
    public OutletItem getTheThirt() {
        return new AdidasTshirtItem();
    }

    @Override
    public OutletItem getShorts() {
        return new AdidasShortsItem();
    }

    @Override
    public OutletItem getShoes() {
        return new AdidasShoesItem();
    }
}
