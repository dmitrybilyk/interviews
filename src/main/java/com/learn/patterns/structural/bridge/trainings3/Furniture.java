package com.learn.patterns.structural.bridge.trainings3;

/**
 * Created by dik81 on 07.02.19.
 */
public abstract class Furniture {
    protected Type type;

    public Furniture(Type type) {
        this.type = type;
    }

    protected abstract void applyType();
}
