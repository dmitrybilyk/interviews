package com.learn.core.multithreading.cookbook.Appendix.app_recipe04.src.com.packtpub.java7.concurrency.chapter9.recipe05.task;

import com.learn.core.multithreading.cookbook.Appendix.app_recipe04.src.com.packtpub.java7.concurrency.chapter9.recipe05.utils.Operations;

import java.util.concurrent.locks.Lock;

public class Task1 implements Runnable {

	private Lock lock;
	
	public Task1 (Lock lock) {
		this.lock=lock;
	}
	
	@Override
	public void run() {
		lock.lock();
		Operations.readData();
		Operations.processData();
		Operations.writeData();
		lock.unlock();
	}

}
