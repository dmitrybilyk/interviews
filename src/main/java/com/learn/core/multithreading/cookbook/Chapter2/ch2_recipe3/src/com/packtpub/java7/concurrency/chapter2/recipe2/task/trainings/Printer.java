package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.trainings;

/**
 * Created by dmitry on 28.04.17.
 */
public class Printer {
    private int numberOfSheets;

    public synchronized void addSheet() {
        if (numberOfSheets == 5) {
            try {
                wait();
                System.out.println("Please, print");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberOfSheets++;
        notify();
    }

    public synchronized void print() {
        if (numberOfSheets < 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I need a paper");
        }
        System.out.println("Printed");
        notify();
    }

}
