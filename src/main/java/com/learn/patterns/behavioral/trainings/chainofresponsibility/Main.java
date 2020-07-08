package com.learn.patterns.behavioral.trainings.chainofresponsibility;

/**
 * Created by dmitry on 18.01.17.
 */
public class Main {
    public static void main(String[] args) {
        AbstractTaxi freeTaxi = new FreeTaxi(0);
        AbstractTaxi  averageTaxi = new AverageTaxi(50);
        AbstractTaxi expensiveTaxi = new ExpensiveTaxi(100);
        freeTaxi.setNextTaxi(averageTaxi);
        averageTaxi.setNextTaxi(expensiveTaxi);

        freeTaxi.sendDriveRequest(40);
    }
}
