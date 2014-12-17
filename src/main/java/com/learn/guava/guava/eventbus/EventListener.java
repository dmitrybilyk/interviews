package com.learn.guava.guava.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 *  Another class which can subscribe to events
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(OurTestEvent event) {
        lastMessage = event.getMessage();
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
