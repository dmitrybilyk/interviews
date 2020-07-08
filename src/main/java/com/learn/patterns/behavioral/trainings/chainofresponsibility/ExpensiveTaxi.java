package com.learn.patterns.behavioral.trainings.chainofresponsibility;

/**
 * Created by dmitry on 18.01.17.
 */
public class ExpensiveTaxi extends AbstractTaxi {
    public ExpensiveTaxi(int minimumSum) {
        super(minimumSum);
    }

    @Override
    void drive() {
        System.out.println("Luxury driving");
    }
}
