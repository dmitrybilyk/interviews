package com.learn.patterns.structural.composite.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Item {
    protected String name;
    protected int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void printInfo() {
        System.out.println(name + " " +size);
    }
}
