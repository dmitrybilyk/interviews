package com.learn.interview_questions.Threads.lockInterface;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable{

        private Resource resource;
        private Lock lock;

        public ConcurrencyLockExample(Resource r){
                this.resource = r;
                this.lock = new ReentrantLock();
        }

        @Override
        public void run() {
                try {
                        // пытаемся взять лок в течении 10 секунд
                        if(lock.tryLock(10, TimeUnit.SECONDS)){
                                resource.doSomething("fdfd");
                        }
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }finally{
                        //убираем лок
                        lock.unlock();
                }
                // Для логгирования не требуется потокобезопасность
                resource.doLogging();
        }
 
}

