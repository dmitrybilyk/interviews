package com.learn.patterns.structural.adapter.trainings;

/**
 * Created by dmitry on 04.03.17.
 */
public class AdderAdapter {
    Adder adder = new Adder();
    public void add(String a, String b) {
        adder.add(Integer.valueOf(a), Integer.valueOf(b));
    }
}
