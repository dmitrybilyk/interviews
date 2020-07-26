package com.learn.interview_questions.patterns.structural.proxy.classical;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 12.11.13
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;
}