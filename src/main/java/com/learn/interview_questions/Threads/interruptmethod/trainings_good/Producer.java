package com.learn.interview_questions.Threads.interruptmethod.trainings_good;

public class Producer implements Runnable
{
    @Override
    public void run()
    {
        while (!Thread.interrupted())
        {
//            try
//            {
//                Thread.sleep(100);

                System.out.println("dfdf");
            }
//            catch (InterruptedException e)
//            {
//                Thread.currentThread().interrupt();
//                e.printStackTrace();
//            }
            System.out.println("Producer");
//        }
    }
}