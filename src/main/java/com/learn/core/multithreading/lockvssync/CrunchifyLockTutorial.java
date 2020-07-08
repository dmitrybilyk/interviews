package com.learn.core.multithreading.lockvssync;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
/**
 * @author Crunchify.com
 *
 */
 
public class CrunchifyLockTutorial {
	public static void main(String[] args) {
		final Company crunchify = new Company("Crunchify");
		final Company google = new Company("Google");
		new Thread(new CrunchifyLoop(crunchify, google)).start();
		new Thread(new CrunchifyLoop(google, crunchify)).start();
	}
 
	// Class CrunchifyLoop
	static class CrunchifyLoop implements Runnable {
		private Company companyName1;
		private Company companyName2;
 
		public CrunchifyLoop(Company companyName1, Company companyName2) {
			this.companyName1 = companyName1;
			this.companyName2 = companyName2;
		}
 
		public void run() {
			Random random = new Random();
			// Loop 10
			for (int counter = 0; counter <= 10; counter++) {
				try {
					Thread.sleep(random.nextInt(5));
				} catch (InterruptedException e) {
				}
				companyName2.crunchifyTalking(companyName1);
			}
		}
	}
 
	// Class Company
	static class Company {
		private final String companyName;
 
		// ReentrantLock: Creates an instance of ReentrantLock. This is equivalent to using ReentrantLock(false)
		private final Lock lock = new ReentrantLock();
 
		// Constructor
		public Company(String name) {
			this.companyName = name;
		}
 
		public String getName() {
			return this.companyName;
		}
 
		public boolean isTalking(Company company) {
			Boolean crunchifyLock = false;
			Boolean googleLock = false;
			try {
				// tryLock: Acquires the lock only if it is free at the time of invocation.
				crunchifyLock = lock.tryLock();
				googleLock = company.lock.tryLock();
			} finally {
				if (!(crunchifyLock && googleLock)) {
					if (crunchifyLock) {
						// unlock: Releases the lock.
						lock.unlock();
					}
					if (googleLock) {
						company.lock.unlock();
					}
				}
			}
			return crunchifyLock && googleLock;
		}
 
		public void crunchifyTalking(Company companyName) {
			// Check if Lock is already exist?
			if (isTalking(companyName)) {
				try {
					System.out.format("I'm %s: talking to %s %n", this.companyName, companyName.getName());
				} finally {
					lock.unlock();
					companyName.lock.unlock();
				}
			} else {
				System.out.format("\tLock Situation ==> I'm %s: talking to %s, but it seems"
						+ " we are already talking. Conflicting. %n", this.companyName, companyName.getName());
			}
		}
	}
}
