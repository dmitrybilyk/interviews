package com.learn.patterns.structural.composite.trainings2;

/**
 * Created by dik81 on 11.02.19.
 */
public class FileUnit extends StorageUnit {

    public FileUnit(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println(getUnitName());
    }

    @Override
    String getUnitName() {
        return "fileName - " + name;
    }

}
