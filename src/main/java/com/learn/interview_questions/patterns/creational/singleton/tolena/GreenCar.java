package com.learn.interview_questions.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class GreenCar extends Car {

    @Override
    public void build() {
        System.out.println("creating new green car");
    }
}
