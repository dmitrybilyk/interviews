package com.learn.interview_questions.Threads.interruptmethod.trainings_good;

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Producer());
//        Thread thread2 = new Thread(new Consumer());

        thread1.start();
//        thread2.start();

        Thread.sleep(1500);

        thread1.interrupt();
//        thread2.interrupt();
    }
}