package com.learn.web.gwt.client.contacts.event;

import com.google.gwt.event.shared.GwtEvent;
import com.learn.web.gwt.shared.contacts.Contact;

public class ContactUpdatedEvent extends GwtEvent<ContactUpdatedEventHandler> {
  public static Type<ContactUpdatedEventHandler> TYPE = new Type<ContactUpdatedEventHandler>();
  private final Contact updatedContact;
  
  public ContactUpdatedEvent(Contact updatedContact) {
    this.updatedContact = updatedContact;
  }
  
  public Contact getUpdatedContact() { return updatedContact; }
  

  @Override
  public Type<ContactUpdatedEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ContactUpdatedEventHandler handler) {
    handler.onContactUpdated(this);
  }
}
