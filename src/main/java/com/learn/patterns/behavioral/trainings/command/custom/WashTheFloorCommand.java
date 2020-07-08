package com.learn.patterns.behavioral.trainings.command.custom;

/**
 * Created by dmitry on 17.01.17.
 */
public class WashTheFloorCommand implements DutiesCommand {
    private Soldier soldier;

    public WashTheFloorCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.washTheFloor();
    }
}
