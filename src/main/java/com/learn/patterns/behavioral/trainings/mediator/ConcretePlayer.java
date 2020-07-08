package com.learn.patterns.behavioral.trainings.mediator;

/**
 * Created by dmitry on 17.01.17.
 */
public class ConcretePlayer extends Player {
    public ConcretePlayer(String name, CoachMediator mediator) {
        super(name, mediator);
    }

    @Override
    void receiveOrder() {
        System.out.println("Message is received by " + name);
    }

    public void sendOrder() {
        mediator.sendOrder(this);
    }
}
