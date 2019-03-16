package com.learn.patterns.structural.composite.trainings2;

/**
 * Created by dik81 on 11.02.19.
 */
public abstract class StorageUnit {
    protected String name;

    public StorageUnit(String name) {
        this.name = name;
    }

    abstract void printInfo();
    abstract String getUnitName();
}
