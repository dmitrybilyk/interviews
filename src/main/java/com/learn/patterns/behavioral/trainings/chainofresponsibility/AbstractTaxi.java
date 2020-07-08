package com.learn.patterns.behavioral.trainings.chainofresponsibility;

/**
 * Created by dmitry on 18.01.17.
 */
public abstract class AbstractTaxi {
    protected int minimumSum;
    protected AbstractTaxi nextTaxi;

    public AbstractTaxi(int minimumSum) {
        this.minimumSum = minimumSum;
    }

    public void setNextTaxi(AbstractTaxi nextTaxi) {
        this.nextTaxi = nextTaxi;
    }

    void sendDriveRequest(int suggestedSum) {
        if (this.minimumSum >= suggestedSum) {
            drive();
        }
        if (nextTaxi != null) {
            nextTaxi.sendDriveRequest(suggestedSum);
        }
    }

    abstract void drive();
}
