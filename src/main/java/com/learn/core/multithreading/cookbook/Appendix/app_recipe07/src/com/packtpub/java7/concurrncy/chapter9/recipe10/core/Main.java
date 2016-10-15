package com.learn.core.multithreading.cookbook.Appendix.app_recipe07.src.com.packtpub.java7.concurrncy.chapter9.recipe10.core;

import com.learn.core.multithreading.cookbook.Appendix.app_recipe07.src.com.packtpub.java7.concurrncy.chapter9.recipe10.task.Task;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=0; i<20; i++){
			Task task=new Task();
			Thread thread=new Thread(task);
			thread.start();
		}

	}

}
