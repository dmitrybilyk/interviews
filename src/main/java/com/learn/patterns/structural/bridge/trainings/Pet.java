package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Pet {
    private Trainer trainer;
    public Pet(Trainer trainer) {
        this.trainer = trainer;
    }
    public void train() {
        trainer.train();
    }
}
