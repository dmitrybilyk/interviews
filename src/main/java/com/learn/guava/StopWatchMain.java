package com.learn.guava;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Created by dmitry on 8/28/14.
 */
public class StopWatchMain {
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        stopwatch.start();
        System.out.println(new Object().toString());
        long secs = stopwatch.elapsed(TimeUnit.SECONDS);
        System.out.println(secs);
    }

}
