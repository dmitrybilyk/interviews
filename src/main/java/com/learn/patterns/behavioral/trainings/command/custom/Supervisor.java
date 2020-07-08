package com.learn.patterns.behavioral.trainings.command.custom;

/**
 * Created by dmitry on 17.01.17.
 */
public class Supervisor {
    private DutiesCommand command;

    public Supervisor(DutiesCommand command) {
        this.command = command;
    }

    public void executeTheCleaning() {
        command.execute();
    }
}
