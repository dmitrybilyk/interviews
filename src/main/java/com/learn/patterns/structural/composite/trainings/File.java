package com.learn.patterns.structural.composite.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class File extends Directory{
    public void printInfo() {
        System.out.println(name + " " +size);
    }
}
