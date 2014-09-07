package com.learn.flash.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("flashService")
public interface flashService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use flashService.App.getInstance() to access static instance of flashServiceAsync
     */
    public static class App {
        private static flashServiceAsync ourInstance = GWT.create(flashService.class);

        public static synchronized flashServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
