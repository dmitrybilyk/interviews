package com.learn.core.exceptions.complextesting.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 30.08.13
 * Time: 19:48
 * To change this template use File | Settings | File Templates.
 */
public class MyRuntimeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "runtime error";
    }
}
