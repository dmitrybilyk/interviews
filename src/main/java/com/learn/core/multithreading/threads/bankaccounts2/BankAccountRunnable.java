package com.learn.core.multithreading.threads.bankaccounts2;

/**
 * Created by dmitry on 1/31/14.
 */
public class BankAccountRunnable implements Runnable{
    BankAccount bankAccount;
    public BankAccountRunnable(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankAccount.Deposit(100);
        System.out.println(bankAccount.Balance());
        System.out.println(Thread.currentThread().getName());
    }
}
