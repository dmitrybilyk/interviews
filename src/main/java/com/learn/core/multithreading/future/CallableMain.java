package com.learn.core.multithreading.future;

import java.util.concurrent.Callable;

public class CallableMain implements Callable<Integer> {
    public static void main(String[] args) {

    }

    @Override
    public Integer call() throws Exception {
        return 5*5;
    }
}
