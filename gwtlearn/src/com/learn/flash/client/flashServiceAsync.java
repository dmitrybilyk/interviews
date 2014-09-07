package com.learn.flash.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface flashServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
