package com.learn.web.gwt.client.contacts.event;

import com.google.gwt.event.shared.EventHandler;

public interface ShowSelectedContactsEventHandler extends EventHandler {
  void onShowSelectedContacts(ShowSelectedContactsEvent event);
}
