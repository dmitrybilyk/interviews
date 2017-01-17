package com.learn.patterns.behavioral.trainings.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 17.01.17.
 */
public class ConcreteMediator implements CoachMediator {
    List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    };
    @Override
    public void sendOrder(Player sentPlayer) {
        for (Player player : players) {
            if (!sentPlayer.equals(player)) {
                player.receiveOrder();
            }
        }
    }
}
