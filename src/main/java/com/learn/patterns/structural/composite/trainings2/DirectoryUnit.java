package com.learn.patterns.structural.composite.trainings2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 11.02.19.
 */
public class DirectoryUnit extends StorageUnit {
    List<StorageUnit> storageUnits = new ArrayList<>();

    public DirectoryUnit(String dirName) {
        super(dirName);
    }

    public void addStorageUnit(StorageUnit storageUnit) {
        storageUnits.add(storageUnit);
    }

    @Override
    public void printInfo() {
        System.out.println(getUnitName());
        for (StorageUnit storageUnit : storageUnits) {
            storageUnit.printInfo();
        }
    }

    @Override
    String getUnitName() {
        return "directoryName - " + name;
    }

}
