package com.learn.patterns.structural.composite.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Directory parentDirectory = new Directory();
        parentDirectory.setName("Parent direcotry");
        Item file1 = new File();
        file1.setName("file 1");
        parentDirectory.addItem(file1);
        file1.setSize(100);
        Item file2 = new File();
        file2.setName("file 2");
        parentDirectory.addItem(file2);
        file2.setSize(200);
        Item childDirectory = new Directory();
        childDirectory.setName("child directory");
        parentDirectory.addItem(childDirectory);

        parentDirectory.printInfo();
    }
}
