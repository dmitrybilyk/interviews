package com.learn.patterns.structural.flyweight.trainings2;

/**
 * Created by dik81 on 27.02.19.
 */
public class Sofa {
    private String color;

    public Sofa(String color) {
        this.color = color;
    }

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
