package com.learn.web.scheduler;

/**
 * Created by dmitry on 23.05.18.
 */
public class TaskRunner {
    public static void main(String[] args) {
        com.learn.web.scheduler.Scheduler.getInstance().start();
    }
}
