package com.learn.patterns.behavioral.chainofresponsobility.trainings3;

/**
 * Created by dik81 on 05.04.19.
 */
public abstract class MyRequestHandler {
    protected MyRequestHandler next;

    public void setNext(MyRequestHandler next) {
        this.next = next;
    }
    public abstract void processRequest(MyRequest myRequest);
}
