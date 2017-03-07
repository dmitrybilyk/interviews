package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Man extends Human {
    public Man(Trainer trainer) {
        super(trainer);
        System.out.println(Man.class.getCanonicalName() + " is trained");
    }
}
