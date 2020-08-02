package com.learn.interview_questions.patterns.behavioral.state;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 07.11.13
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 */
public class TVRemote {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();

    }

}