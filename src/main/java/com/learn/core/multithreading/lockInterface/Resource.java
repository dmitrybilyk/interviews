package com.learn.core.multithreading.lockInterface;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
        public int value = 0;

        ReentrantLock reentrantLock;
        public Resource() {

        }
        public Resource(ReentrantLock reentrantLock) {
                this.reentrantLock = reentrantLock;
        }

        public int getValue() {
                return value;
        }

        public void doSomething(String param1)
    {
//       synchronized (this) {
            reentrantLock.lock();
            try {
                    value++;
            }finally {
                    reentrantLock.unlock();
            }


//       }
//       System.out.println("I'm doing something - " + param1);
    }
     
    public void doLogging()
    {
       System.out.println("I'm logging");

    }

        public static void main(String[] args) {
                ReentrantLock lock = new ReentrantLock(true);
            Resource resource = new Resource(lock);

            for (int i = 0; i<=1000; i++) {
                    Thread thread = new Thread(new MyRunnable(resource));
                    thread.start();
            }
                System.out.println(resource.getValue());
        }
}

class MyRunnable implements Runnable{
        private Resource resource;
//        private ReentrantLock lock;

        public MyRunnable(Resource resource) {
                this.resource = resource;
//                this.lock = lock;
        }

        @Override public void run() {
//                lock.lock();
//                try {
                        resource.doSomething("dfdf");
//                } finally {
//                lock.unlock();
//                }
        }
}
