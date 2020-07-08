package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.threadsafety.services;

public class StateHolder {
    
    private final String state;

    public StateHolder(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
}
