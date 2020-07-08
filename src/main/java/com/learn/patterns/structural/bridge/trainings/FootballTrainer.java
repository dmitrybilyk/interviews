package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class FootballTrainer extends Trainer {
    @Override
    public void train() {
        super.train();
        System.out.println("football training");
    }
}
