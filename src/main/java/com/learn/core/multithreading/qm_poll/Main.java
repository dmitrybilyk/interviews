package com.learn.core.multithreading.qm_poll;

/**
 * Created by dmitry on 07.01.19.
 */
public class Main {
    public static void main(String[] args) {
        ObserverCommunicator observerCommunicator = ObserverCommunicator.getInstance();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                observerCommunicator.sessionEnded("session1", PushMessage.MESSAGE_TYPE.SESSION_EXPIRED);
            }
        });

        thread.start();

        Thread server2ClientThread = new Thread(new Runnable() {
            @Override
            public void run() {
                observerCommunicator.server2client("session1");
            }
        });
        server2ClientThread.start();

        Thread server2ClientThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                observerCommunicator.server2client("session2");
            }
        });
        server2ClientThread2.start();

    }
}
