package com.learn.core.Java8Features.jornaldev.functionalInterface;

import com.learn.core.Java8Features.jornaldev.defaultAndStaticMethodInInt.Interface1;

/**
 * Created by dmitry on 11.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ddd");
            }
        };
        Interface1 interface1 = System.out::println;
        interface1.method1("dfff");
    }
}
