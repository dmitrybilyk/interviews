package com.learn.core.multithreading.cookbook.Chapter4.ch4_recipe03.src.com.packtpub.java7.concurrency.chapter4.recipe3.trainings;

import java.util.concurrent.Callable;

/**
 * Created by dmitry on 17.05.17.
 */
public class AddCalculator implements Callable<Integer> {

    private int a1;
    private int a2;

    public AddCalculator(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

//    @Override
//    public void run() {
//        System.out.println(a1 + a2);
//    }

    @Override
    public Integer call() throws Exception {
        return a1 + a2;
    }
}
