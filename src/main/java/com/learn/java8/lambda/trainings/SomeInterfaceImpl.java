package com.learn.java8.lambda.trainings;

/**
 * Created by dik81 on 20.11.18.
 */
public class SomeInterfaceImpl implements SomeInterface {
    @Override
    public void someMethod(String a, Integer b) {
        someMethod(b);
        System.out.println("fdfd");
    }
}
