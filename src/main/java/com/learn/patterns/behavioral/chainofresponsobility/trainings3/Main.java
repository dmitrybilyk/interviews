package com.learn.patterns.behavioral.chainofresponsobility.trainings3;

/**
 * Created by dik81 on 05.04.19.
 */
public class Main {
    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
        myRequest.setSomeValue("someValuedima1");

        MyRequestHandler handler1 = new MyRequestHandlerImpl1();
        MyRequestHandler handler2 = new MyRequestHandlerImpl2();
        MyRequestHandler handler3 = new MyRequestHandlerImpl3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler1.processRequest(myRequest);
        System.out.println(myRequest.getSomeValue());
    }
}
