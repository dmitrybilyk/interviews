package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Wooman extends Human {
    public Wooman(Trainer trainer) {
        super(trainer);
        System.out.println(Wooman.class.getCanonicalName() + " is trained");
    }
}
