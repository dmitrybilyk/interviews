package com.learn.patterns.structural.bridge.trainings4;

/**
 * Created by dik81 on 07.02.19.
 */
public abstract class Gui {
    protected OS os;

    public Gui(OS os) {
        this.os = os;
    }

    public abstract void work();
}
