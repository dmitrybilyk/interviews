package com.learn.patterns.behavioral.command.trainings;

/**
 * Created by dmitry on 16.03.19.
 */
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new CookSoupCommand(true, new ChiefCookerReceiverImpl()));
        invoker.cookSoup();
    }
}
