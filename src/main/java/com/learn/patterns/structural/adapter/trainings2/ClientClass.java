package com.learn.patterns.structural.adapter.trainings2;

/**
 * Created by dmitry on 29.01.19.
 */
public class ClientClass {
    public static void main(String[] args) {
        TargetInterface printListFromStringAdapter = new AllowPrintStringInsteadOfListAdapter();
        printListFromStringAdapter.printString("Hello Dima, Nice to meet you");
    }
}
