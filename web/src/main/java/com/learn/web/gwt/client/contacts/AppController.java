package com.learn.web.gwt.client.contacts;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.learn.web.gwt.client.contacts.event.AddContactEvent;
import com.learn.web.gwt.client.contacts.event.AddContactEventHandler;
import com.learn.web.gwt.client.contacts.event.ContactUpdatedEvent;
import com.learn.web.gwt.client.contacts.event.ContactUpdatedEventHandler;
import com.learn.web.gwt.client.contacts.event.EditContactCancelledEvent;
import com.learn.web.gwt.client.contacts.event.EditContactCancelledEventHandler;
import com.learn.web.gwt.client.contacts.event.EditContactEvent;
import com.learn.web.gwt.client.contacts.event.EditContactEventHandler;
import com.learn.web.gwt.client.contacts.presenter.ContactsPresenter;
import com.learn.web.gwt.client.contacts.presenter.EditContactPresenter;
import com.learn.web.gwt.client.contacts.presenter.Presenter;
import com.learn.web.gwt.client.contacts.view.ContactsView;
import com.learn.web.gwt.client.contacts.view.EditContactView;

public class AppController implements Presenter, ValueChangeHandler<String> {
  private final HandlerManager eventBus;
  private final ContactsServiceAsync rpcService; 
  private HasWidgets container;
  
  public AppController(ContactsServiceAsync rpcService, HandlerManager eventBus) {
    this.eventBus = eventBus;
    this.rpcService = rpcService;
    bind();
  }
  
  private void bind() {
    History.addValueChangeHandler(this);

    eventBus.addHandler(AddContactEvent.TYPE,
        new AddContactEventHandler() {
          public void onAddContact(AddContactEvent event) {
            doAddNewContact();
          }
        });  

    eventBus.addHandler(EditContactEvent.TYPE,
        new EditContactEventHandler() {
          public void onEditContact(EditContactEvent event) {
            doEditContact(event.getId());
          }
        });  

    eventBus.addHandler(EditContactCancelledEvent.TYPE,
        new EditContactCancelledEventHandler() {
          public void onEditContactCancelled(EditContactCancelledEvent event) {
            doEditContactCancelled();
          }
        });  

    eventBus.addHandler(ContactUpdatedEvent.TYPE,
        new ContactUpdatedEventHandler() {
          public void onContactUpdated(ContactUpdatedEvent event) {
            doContactUpdated();
          }
        });  
  }
  
  private void doAddNewContact() {
    History.newItem("add");
  }
  
  private void doEditContact(String id) {
    History.newItem("edit", false);
    Presenter presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView(), id);
    presenter.go(container);
  }
  
  private void doEditContactCancelled() {
    History.newItem("list");
  }
  
  private void doContactUpdated() {
    History.newItem("list");
  }
  
  public void go(final HasWidgets container) {
    this.container = container;
    
    if ("".equals(History.getToken())) {
      History.newItem("list");
    }
    else {
      History.fireCurrentHistoryState();
    }
  }

  public void onValueChange(ValueChangeEvent<String> event) {
    String token = event.getValue();
    
    if (token != null) {
      Presenter presenter = null;

      if (token.equals("list")) {
        presenter = new ContactsPresenter(rpcService, eventBus, new ContactsView());
      }
      else if (token.equals("add")) {
        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
      }
      else if (token.equals("edit")) {
        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
      }
      
      if (presenter != null) {
        presenter.go(container);
      }
    }
  } 
}
