package com.learn.patterns.behavioral.trainings.mediator;

/**
 * Created by dmitry on 17.01.17.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcretePlayer player1 = new ConcretePlayer("Player 1", mediator);
        mediator.addPlayer(player1);
        ConcretePlayer player2 = new ConcretePlayer("Player 2", mediator);
        mediator.addPlayer(player2);
        player1.sendOrder();
    }
}
