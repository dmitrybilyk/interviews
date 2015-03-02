package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe1_solution.src.com.packtpub.java7.concurrency.chapter2.recipe1.task;

/**
 * This class simulates a company that pays a salary an
 * insert money into an account 
 *
 */
public class Company implements Runnable {
	/**
	 * The account affected by the operations
	 */
	private Account account;
	
	/**
	 * Constructor of the class. Initializes the account
	 * @param account the account affected by the operations
	 */
	public Company(Account account) {
		this.account=account;
	}
	
	/**
	 * Core method of the Runnable
	 */
	public void run() {
		for (int i=0; i<100; i++){
			account.addAmount(1000);
		}
	}

}
