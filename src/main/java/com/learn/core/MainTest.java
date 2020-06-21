package com.learn.core;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

    }
}

class

class TaskCallable implements Callable {
    public Object call() throws Exception {
        return "B";
    }
}

class Screen {
    public static void show () {
        System.out.printf("A");
    }
}

class ColorScreen extends Screen{
    public static void show () {
        System.err.println("B");
    }
}
