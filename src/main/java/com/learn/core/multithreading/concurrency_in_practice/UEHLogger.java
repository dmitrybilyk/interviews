package com.learn.core.multithreading.concurrency_in_practice;

import java.util.logging.*;

/**
 * UEHLogger
 * <p/>
 * UncaughtExceptionHandler that logs the exception
 *
 * @author Brian Goetz and Tim Peierls
 */
public class UEHLogger implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.SEVERE, "Thread terminated with exception: " + t.getName(), e);
    }
}
