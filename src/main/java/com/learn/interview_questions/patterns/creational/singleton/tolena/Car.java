package com.learn.interview_questions.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public abstract class Car {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void build();
}
