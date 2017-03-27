package com.learn.core.multithreading.trainings;

/**
 * Created by dmitry on 27.03.17.
 */
public class MyDeamonThread {
    public static void main(String[] args) {
        Thread deamonThread = new Thread("deamon");
        for (int i = 0; i < 6; i++) {
            doDemoAction(deamonThread);
            System.out.println("Main thread action");
        }
    }

    private static void doDemoAction(Thread deamonThread) {
        if (deamonThread != null) {
            System.out.println("some deamon action");
        }
    }
}
