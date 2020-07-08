package com.learn.java8.lambda.trainings2;

/**
 * Created by dik81 on 04.02.19.
 */
public class ClothesWhasher implements Whasher {
    @Override
    public void whash(String thingName, int quantity) {
        System.out.println("Whashing something");
    }
}
