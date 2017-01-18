package com.learn.patterns.behavioral.trainings.chainofresponsibility;

/**
 * Created by dmitry on 18.01.17.
 */
public class FreeTaxi extends AbstractTaxi {
    public FreeTaxi(int minimumSum) {
        super(minimumSum);
    }

    @Override
    void drive() {
        System.out.println("Driving for free");
    }
}
