package com.learn.patterns.behavioral.command.trainings;

/**
 * Created by dmitry on 16.03.19.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void cookSoup() {
        command.execute();
    }
}
