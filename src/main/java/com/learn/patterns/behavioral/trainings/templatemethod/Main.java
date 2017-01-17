package com.learn.patterns.behavioral.trainings.templatemethod;

/**
 * Created by dmitry on 17.01.17.
 */
public class Main {
    public static void main(String[] args) {
        TrainingAlgorithm trainingAlgorithm = new FootballTrainingAlgorithm();
        trainingAlgorithm.training();
    }
}
