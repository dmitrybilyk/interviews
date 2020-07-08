package com.learn.patterns.structural.composite.trainings2;

/**
 * Created by dik81 on 11.02.19.
 */
public class Main {
    public static void main(String[] args) {
        DirectoryUnit directoryUnit = new DirectoryUnit("root dir");
        DirectoryUnit dir1 = new DirectoryUnit("dir1");
        dir1.addStorageUnit(new FileUnit("file1"));
        dir1.addStorageUnit(new FileUnit("file2"));
        dir1.addStorageUnit(new FileUnit("file3"));
        dir1.addStorageUnit(new DirectoryUnit("dir11"));
        DirectoryUnit dir111 = new DirectoryUnit("dir111");
        dir1.addStorageUnit(dir111);
        dir111.addStorageUnit(new FileUnit("file in dir111"));
        directoryUnit.addStorageUnit(dir1);

        directoryUnit.printInfo();
    }
}
