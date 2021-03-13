package com.learn.interview_questions.multithreading.uncaughtExceptionHandler;

class UncaughtExceptionHandlerClass extends Thread {
    // Override run() of Thread class
    public void run() {
        int i = 10 / 0;
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of UncaughtExceptionHandlerClass class
        UncaughtExceptionHandlerClass uehc =
            new UncaughtExceptionHandlerClass();
        // Creating an object of Thread class
        Thread th = new Thread(uehc);
        // setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler excep_handler)
        // will set the handler for uncaught exception when 
        // this thread terminate abnormally
        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable ex) {
                System.out.println(th + " throws exception " + ex);
            }
        });
        th.start();
    }
}