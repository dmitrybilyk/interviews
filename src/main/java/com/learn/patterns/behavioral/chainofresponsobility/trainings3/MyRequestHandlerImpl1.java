package com.learn.patterns.behavioral.chainofresponsobility.trainings3;

/**
 * Created by dik81 on 05.04.19.
 */
public class MyRequestHandlerImpl1 extends MyRequestHandler {
    @Override
    public void processRequest(MyRequest myRequest) {
        if (myRequest.getSomeValue().contains("dima1")) {
            myRequest.setSomeValue(myRequest.getSomeValue().concat("1"));
        }
        if (next != null) {
            next.processRequest(myRequest);
        }
    }
}
