package com.learn.interview_questions.patterns.creational.prototype.trainings;

/**
 * Created by dmitry on 26.01.19.
 */
public class Farther implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Farther clone() throws CloneNotSupportedException {
        return (Farther)super.clone();
    }
}
