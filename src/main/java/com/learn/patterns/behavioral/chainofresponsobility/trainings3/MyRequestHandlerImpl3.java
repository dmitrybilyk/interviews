package com.learn.patterns.behavioral.chainofresponsobility.trainings3;

/**
 * Created by dik81 on 05.04.19.
 */
public class MyRequestHandlerImpl3 extends MyRequestHandler {
    @Override
    public void processRequest(MyRequest myRequest) {
        myRequest.setSomeValue(myRequest.getSomeValue().concat("3"));
        if (next != null) {
            next.processRequest(myRequest);
        }
    }
}
