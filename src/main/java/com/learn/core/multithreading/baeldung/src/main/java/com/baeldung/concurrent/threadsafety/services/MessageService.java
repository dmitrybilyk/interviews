package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.threadsafety.services;

public class MessageService {
    
    private final String message;
    
    public MessageService(String message) {
        this.message = message;
    }
    
    public String getMesssage() {
        return message;
    }
}
