package com.learn.patterns.behavioral.trainings.chainofresponsibility;

/**
 * Created by dmitry on 18.01.17.
 */
public class AverageTaxi extends AbstractTaxi {
    public AverageTaxi(int minimumSum) {
        super(minimumSum);
    }

    @Override
    void drive() {
        System.out.println("Usual driving");
    }
}
