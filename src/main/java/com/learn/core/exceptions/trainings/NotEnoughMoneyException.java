package com.learn.core.exceptions.trainings;

/**
 * Created by dik81 on 23.11.18.
 */

/**
 * This exception
 */
public class NotEnoughMoneyException extends Exception {
    @Override
    public String getMessage() {
        return "Not enough money hey";
    }
}
