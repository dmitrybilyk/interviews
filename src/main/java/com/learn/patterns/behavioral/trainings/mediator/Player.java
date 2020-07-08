package com.learn.patterns.behavioral.trainings.mediator;

/**
 * Created by dmitry on 17.01.17.
 */
public abstract class Player {
    protected String name;
    protected CoachMediator mediator;

    public Player(String name, CoachMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void receiveOrder();

}
