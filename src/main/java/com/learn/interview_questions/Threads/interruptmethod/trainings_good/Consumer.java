package com.learn.interview_questions.Threads.interruptmethod.trainings_good;

public class Consumer implements Runnable
{
    @Override
    public void run()
    {
        while (!Thread.interrupted())
        {
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Consumer");
        }
    }
}