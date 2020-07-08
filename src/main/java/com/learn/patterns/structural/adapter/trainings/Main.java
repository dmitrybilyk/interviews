package com.learn.patterns.structural.adapter.trainings;

/**
 * Created by dmitry on 04.03.17.
 */
public class Main {
    public static void main(String[] args) {
//we have two strings
        String a = "5";
        String b = "10";

        AdderAdapter adderAdapter = new AdderAdapter();
        adderAdapter.add(a, b);
    }
}
