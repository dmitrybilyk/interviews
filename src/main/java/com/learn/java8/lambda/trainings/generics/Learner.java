package com.learn.java8.lambda.trainings.generics;

/**
 * Created by dik81 on 20.11.18.
 */
public class Learner {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void learn() {
        setName("Dima");
        System.out.println(name + " is learning something");
    }
}
