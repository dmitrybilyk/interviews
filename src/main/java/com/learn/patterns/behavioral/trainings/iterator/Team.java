package com.learn.patterns.behavioral.trainings.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 18.01.17.
 */
public class Team {
    private List<Player> playerList;

    public Team() {
        playerList = new ArrayList<>();
    }

    void addPlayer(Player player) {
        playerList.add(player);
    }

    TeamIterator getTeamIterator() {
        return new TeamIterator();
    }

    class TeamIterator implements  PlayersIterator{
        private int position;
        @Override
        public Player next() {
            Player player =  playerList.get(position);
            if (hasNext()) {
                position+= 1;
            }
            return player;
        }

        @Override
        public boolean hasNext() {
            return position < playerList.size();
        }
    }
}
