package com.learn.patterns.behavioral.chainofresponsobility.trainings2;

/**
 * Created by dik81 on 04.04.19.
 */
public abstract class AbstractProcessor {
    private AbstractProcessor next;

    public void setNext(AbstractProcessor next) {
        this.next = next;
    }

    public void perform(TVSet tvSet) {
        process(tvSet);
        if (next != null) {
            next.perform(tvSet);
        }
    }

    public abstract void process(TVSet tvSet);
}
