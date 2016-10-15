package com.learn.core.multithreading.threads.bankaccounts2;

/**
 * Created by dmitry on 28.02.15.
 */
public class SyncLocksTest {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(1000);
    Thread thread1 = new Thread(new BankAccountRunnable(bankAccount));
    Thread thread2 = new Thread(new BankAccountRunnable(bankAccount));
    thread1.start();
    thread2.start();
  }
}
