package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.threadsafety.callables;

import com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.threadsafety.services.MessageService;

import java.util.concurrent.Callable;

public class MessageServiceCallable implements Callable<String> {
    
    private final MessageService messageService;
    
    public MessageServiceCallable(MessageService messageService) {
        this.messageService = messageService;
    
    }
    
    @Override
    public String call() {
        return messageService.getMesssage();
    }
}
