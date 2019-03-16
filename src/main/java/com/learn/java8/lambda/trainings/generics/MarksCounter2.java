package com.learn.java8.lambda.trainings.generics;

/**
 * Created by dik81 on 20.11.18.
 */
public class MarksCounter2 {
    public <T extends Learner> void count(T t) {
        t.learn();
    }


}
