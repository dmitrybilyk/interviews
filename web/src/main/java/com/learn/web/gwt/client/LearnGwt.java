package com.learn.web.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Created by dmitry on 07.01.19.
 */
public class LearnGwt implements EntryPoint {
    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new Label("Test label"));
    }
}
