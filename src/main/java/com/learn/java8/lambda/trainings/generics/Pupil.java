package com.learn.java8.lambda.trainings.generics;

/**
 * Created by dik81 on 20.11.18.
 */
public class Pupil extends Learner {
    @Override
    public void learn() {
        super.learn();
//        System.out.println("pupil learn");
    }

//    @Override
//    public void setName(String name) {
//        System.out.println(name + "pup");
//    }

    @Override
    public String toString() {
        return getName();
    }
}
