package com.learn.core.multithreading.qm_poll;


import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by dmitry on 07.01.19.
 */
public class GWTObserver implements Observer{
    static Logger logger = Logger.getLogger(GWTObserver.class);

    private static final long DEFAULT_MESSAGE_TTL = 500; // ms

    private Map<String, BlockingQueue<PushMessage>> listeners = new ConcurrentHashMap<>();

    @Override
    public void update(Observable o, Object arg) {
        PushMessage pushMessage = new PushMessage(getArguments(arg));
        switch (pushMessage.getType()) {
            case SESSION_EXPIRED:
            case ERROR:
            case IDLE:
            case USER_LOGGED_OUT:
                logger.info("from update params - " + pushMessage.getParams());
                receiveMessage(pushMessage);
                break;
            // rest are none of our business
        }
    }

    public PushMessage waitForMessage(String sessionId) throws InterruptedException {
        logger.debug("GWT client waiting for messages from GWT server: sessionID={}" + sessionId);
        BlockingQueue<PushMessage> listener = getListener(sessionId);
        PushMessage message = listener.poll(7, TimeUnit.SECONDS);
        if (message == null) {
            // time limit elapsed
            message = new PushMessage();
            message.setSessionid(sessionId);
            message.setType(PushMessage.MESSAGE_TYPE.IDLE);
        }
        logger.debug("GWT client received message from GWT server: {}" + message);
        return message;
    }

    private synchronized BlockingQueue<PushMessage> getListener(String sessionId) {
        logger.debug("dfdfdfd");
        // register interest in messages for this session ID
        // using SynchronousQueue to ensure server knows right away if the message was received or not
        //  - a usual blocking queue implementation will not enforce message TTL, but could be faster,
        //  if there are no listeners, since there would be no blocking of the server thread in that case
        return listeners.computeIfAbsent(sessionId, k -> new SynchronousQueue<>());
    }

    private Map<String, String> getArguments(Object arg) {
        Assert.isInstanceOf(Map.class, arg, "observed change must be a Map<String, String> instance");
        return (Map<String, String>) arg;
    }

    private void receiveMessage(@NotNull PushMessage message) {
        logger.debug("GWT server received a message for GWT client: {}" + message);
        String sessionId = message.getSessionid();
        BlockingQueue<PushMessage> listener = getListener(sessionId);
        offerMessageToListener(sessionId, listener, message);
    }

    private void offerMessageToListener(String sessionId, BlockingQueue<PushMessage> listener, PushMessage message) {
        try {
            while (listener.offer(message, DEFAULT_MESSAGE_TTL, TimeUnit.MILLISECONDS)) {
                logger.info("GWT server successfully offered a message to a GWT client: {}" + message);
                if (message.getType() != PushMessage.MESSAGE_TYPE.SESSION_EXPIRED &&
                        message.getType() != PushMessage.MESSAGE_TYPE.USER_LOGGED_OUT) {
                    return; // single delivery is enough - only session termination is delivered to all listening clients
                }
            }
            logger.info("GWT server found no (more) GWT client pollers to offer a message to (within TTL of {}ms): {}" + message);
            removeListener(sessionId); // then remove the listener, since the session has expired or no one is listening
        } catch (InterruptedException e) {
            logger.info("Interrupted while offering a message to a GWT client poller: {}" + message, e);
            removeListener(sessionId);
            Thread.currentThread().interrupt();
        }
    }

    private void removeListener(String sessionId) {
        listeners.remove(sessionId);
    }
}
