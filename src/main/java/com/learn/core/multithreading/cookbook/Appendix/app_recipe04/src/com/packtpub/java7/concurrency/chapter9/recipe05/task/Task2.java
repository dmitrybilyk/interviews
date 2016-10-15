package com.learn.core.multithreading.cookbook.Appendix.app_recipe04.src.com.packtpub.java7.concurrency.chapter9.recipe05.task;

import com.learn.core.multithreading.cookbook.Appendix.app_recipe04.src.com.packtpub.java7.concurrency.chapter9.recipe05.utils.Operations;

import java.util.concurrent.locks.Lock;


public class Task2 implements Runnable {

	private Lock lock;
	
	public Task2 (Lock lock) {
		this.lock=lock;
	}
	
	@Override
	public void run() {
		lock.lock();
		Operations.readData();
		lock.unlock();
		Operations.processData();
		lock.lock();
		Operations.writeData();
		lock.unlock();
	}
}
