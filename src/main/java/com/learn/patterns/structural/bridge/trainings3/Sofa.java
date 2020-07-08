package com.learn.patterns.structural.bridge.trainings3;

/**
 * Created by dik81 on 07.02.19.
 */
public class Sofa extends Furniture {
    public Sofa(Type type) {
        super(type);
    }

    @Override
    protected void applyType() {
        System.out.println("applying type for sofa" + type);
    }
}
