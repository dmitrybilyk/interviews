package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.semaphore;

import org.apache.commons.lang3.concurrent.TimedSemaphore;

import java.util.concurrent.TimeUnit;

class DelayQueueUsingTimedSemaphore {

    private final TimedSemaphore semaphore;

    DelayQueueUsingTimedSemaphore(long period, int slotLimit) {
        semaphore = new TimedSemaphore(period, TimeUnit.SECONDS, slotLimit);
    }

    void tryAdd() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    int availableSlots() {
        return semaphore.getAvailablePermits();
    }

}
