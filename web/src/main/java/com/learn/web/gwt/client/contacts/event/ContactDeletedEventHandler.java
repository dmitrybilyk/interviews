package com.learn.web.gwt.client.contacts.event;

import com.google.gwt.event.shared.EventHandler;

public interface ContactDeletedEventHandler extends EventHandler {
  void onContactDeleted(ContactDeletedEvent event);
}
