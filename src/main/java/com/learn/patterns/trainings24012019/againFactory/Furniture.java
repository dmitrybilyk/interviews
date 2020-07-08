package com.learn.patterns.trainings24012019.againFactory;

/**
 * Created by dik81 on 25.01.19.
 */
public class Furniture {
    protected TYPE type;
    protected Aim aim;
    public Furniture(TYPE type, Aim aim) {
        this.type = type;
        this.aim = aim;
    }
    public enum TYPE{
        LUXURY, WOOD
    }

    public void commonConstruct() {
        System.out.println("common construct + " + type.name());
    }

    @Override
    public String toString() {
        return type.name() + " is created - " + aim.name();
    }
}
