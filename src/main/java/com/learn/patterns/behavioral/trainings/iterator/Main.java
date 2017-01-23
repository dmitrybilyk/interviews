package com.learn.patterns.behavioral.trainings.iterator;

/**
 * Created by dmitry on 18.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Team team = new Team();

        for (int i = 0; i < 12; i++) {
            Player player = new Player();
            player.setName("Dima" + i);
            if (i == 0) {
                player.setPosition(Position.GOALKEEPER);
            } else if (i < 5) {
                player.setPosition(Position.DEFENDER);
            } else if (i < 9) {
                player.setPosition(Position.MIDDFIELDER);
            } else {
                player.setPosition(Position.STRIKER);
            }
            team.addPlayer(player);
        }

        PlayersIterator playersIterator = team.getTeamIterator();
        while (playersIterator.hasNext()) {
            System.out.println(playersIterator.next().getName());
        }

    }
}
