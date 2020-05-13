package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.semaphore;

import java.util.concurrent.Semaphore;

class LoginQueueUsingSemaphore {

    private final Semaphore semaphore;

    LoginQueueUsingSemaphore(int slotLimit) {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    void logout() {
        semaphore.release();
    }

    int availableSlots() {
        return semaphore.availablePermits();
    }

}
