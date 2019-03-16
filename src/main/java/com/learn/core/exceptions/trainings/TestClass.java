package com.learn.core.exceptions.trainings;

/**
 * Created by dik81 on 23.11.18.
 */
public class TestClass {
    int balance = 100;

    public int testMethod(String value) throws NotEnoughMoneyException {
        int finishedBalance = 0;
        int sumToWithdraw = 0;
        try {
            sumToWithdraw = Integer.valueOf(value);
            finishedBalance = balance - sumToWithdraw;
        } catch (NumberFormatException ex) {
//            System.out.println("" + balance + ex);
            throw new CustomException("balanse = " + balance, ex);
        }
        if (finishedBalance < 0) {
            throw new NotEnoughMoneyException();
        }
        return finishedBalance;
    }
}
