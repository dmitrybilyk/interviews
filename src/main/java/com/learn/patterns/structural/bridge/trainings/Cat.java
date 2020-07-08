package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Cat extends Pet {
    public Cat(Trainer trainer) {
        super(trainer);
        System.out.println(Cat.class.getCanonicalName() + " is trained");
    }
}
