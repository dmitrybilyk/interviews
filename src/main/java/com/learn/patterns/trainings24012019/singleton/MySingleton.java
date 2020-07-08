package com.learn.patterns.trainings24012019.singleton;

/**
 * Created by dik81 on 24.01.19.
 */
public class MySingleton {
    private static final MySingleton instance;

    static {
        instance = new MySingleton();
    }
    private MySingleton() {

    }
}
