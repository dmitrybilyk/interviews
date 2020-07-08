package com.learn.core.exceptions.trainings;

/**
 * Created by dik81 on 23.11.18.
 */
public class CustomException extends RuntimeException {

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
