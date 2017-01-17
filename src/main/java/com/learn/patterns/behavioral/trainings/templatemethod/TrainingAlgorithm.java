package com.learn.patterns.behavioral.trainings.templatemethod;

/**
 * Created by dmitry on 17.01.17.
 */
public abstract class TrainingAlgorithm {
    public final void training() {
        wramUp();
        running();
        wramDown();
    }

    private void wramDown() {
        System.out.println("Take it easy");
    }

    protected abstract void running();

    private void wramUp() {
        System.out.println("Preparing to exersizes");
    }
}
