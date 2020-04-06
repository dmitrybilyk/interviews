package com.learn.web.gwt.client.contacts;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

public class Contacts implements EntryPoint {

  public void onModuleLoad() {
    ContactsServiceAsync rpcService = GWT.create(ContactsService.class);
    HandlerManager eventBus = new HandlerManager(null);
    AppController appViewer = new AppController(rpcService);
    appViewer.go(RootPanel.get());
  }
}
