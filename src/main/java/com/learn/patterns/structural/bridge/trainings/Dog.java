package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Dog extends Pet {
    public Dog(Trainer trainer) {
        super(trainer);
        System.out.println(Dog.class.getCanonicalName() + " is trained");
    }
}
