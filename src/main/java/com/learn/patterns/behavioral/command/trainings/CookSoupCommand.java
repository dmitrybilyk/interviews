package com.learn.patterns.behavioral.command.trainings;

/**
 * Created by dmitry on 16.03.19.
 */
public class CookSoupCommand implements Command {
    private boolean isFish;

    public CookSoupCommand(boolean isFish, CookerReceiver cookerReceiver) {
        this.isFish = isFish;
        this.cookerReceiver = cookerReceiver;
    }

    private CookerReceiver cookerReceiver;
    @Override
    public void execute() {
        cookerReceiver.cookSoup(isFish);
    }
}
