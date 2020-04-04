package com.learn.web.gwt.client.contacts.event;

import com.google.gwt.event.shared.GwtEvent;
import com.learn.web.gwt.shared.contacts.Contact;

import java.util.List;

public class ShowSelectedContactsEvent extends GwtEvent<ShowSelectedContactsEventHandler> {
  private List<Integer> selectedContactsIds;
  public static Type<ShowSelectedContactsEventHandler> TYPE = new Type<ShowSelectedContactsEventHandler>();
  
  @Override
  public Type<ShowSelectedContactsEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ShowSelectedContactsEventHandler handler) {
    handler.onShowSelectedContacts(this);
  }

  public List<Integer> getSelectedContactsIds() {
    return selectedContactsIds;
  }

  public void setSelectedContactsIds(List<Integer> selectedContactsIds) {
    this.selectedContactsIds = selectedContactsIds;
  }
}
