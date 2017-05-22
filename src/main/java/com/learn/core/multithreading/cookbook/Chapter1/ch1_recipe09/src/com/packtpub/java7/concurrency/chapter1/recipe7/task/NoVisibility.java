package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe09.src.com.packtpub.java7.concurrency.chapter1.recipe7.task;

public class NoVisibility {
    private static volatile boolean ready;
    
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (ready) {
                        System.out.println("Reader Thread - Flag change received. Finishing thread.");
                        break;
                    }
                }
            }
        }).start();
        
        Thread.sleep(3000);
        System.out.println("Writer thread - Changing flag...");
        ready = true;
    }
}