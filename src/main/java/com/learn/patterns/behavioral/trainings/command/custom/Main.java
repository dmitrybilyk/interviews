package com.learn.patterns.behavioral.trainings.command.custom;

/**
 * Created by dmitry on 17.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor(new WashTheFloorCommand(new Soldier()));
        supervisor.executeTheCleaning();
    }
}
