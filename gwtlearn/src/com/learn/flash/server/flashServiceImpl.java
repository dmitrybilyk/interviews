package com.learn.flash.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.learn.flash.client.flashService;

public class flashServiceImpl extends RemoteServiceServlet implements flashService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}