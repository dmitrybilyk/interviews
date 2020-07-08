package com.learn.java8.lambda.trainings.generics;

/**
 * Created by dik81 on 20.11.18.
 */
public class Main {
    public static void main(String[] args) {
        Learner learner = new Learner();
        learner.setName("Test name");
//        MarksCounter<Learner> marksCounter = new MarksCounter<>();
//        marksCounter.count(learner);

        MarksCounter2 marksCounter2 = new MarksCounter2();
        marksCounter2.count(learner);
    }
}
