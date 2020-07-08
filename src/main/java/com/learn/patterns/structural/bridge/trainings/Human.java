package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Human {
    private Trainer trainer;
    public Human(Trainer trainer) {
        this.trainer = trainer;
    }
    public void train() {
        trainer.train();
    }
}
