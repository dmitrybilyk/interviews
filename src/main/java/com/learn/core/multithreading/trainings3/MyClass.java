package com.learn.core.multithreading.trainings3;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("something");

        ThreadWithRunMethod threadWithRunMethod = new ThreadWithRunMethod();
        threadWithRunMethod.start();

        Thread thread = new Thread(new ClassImplementsRunnable());
        thread.start();
    }
}

class ThreadWithRunMethod extends Thread {
    @Override
    public void run() {
        System.out.println("Work from - " + "ThreadWithRunMethod)");
    }
}

class ClassImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Work from - " + "ClassImplementsRunnable");
    }
}
