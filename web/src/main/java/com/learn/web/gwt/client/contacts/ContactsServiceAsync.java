package com.learn.web.gwt.client.contacts;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.learn.web.gwt.shared.contacts.Contact;
import com.learn.web.gwt.shared.contacts.ContactDetails;

import java.util.ArrayList;

public interface ContactsServiceAsync {

  public void addContact(Contact contact, AsyncCallback<Contact> callback);
  public void deleteContact(String id, AsyncCallback<Boolean> callback);
  public void deleteContacts(ArrayList<String> ids, AsyncCallback<ArrayList<ContactDetails>> callback);
  public void getContactDetails(AsyncCallback<ArrayList<ContactDetails>> callback);
  public void getContact(String id, AsyncCallback<Contact> callback);
  public void updateContact(Contact contact, AsyncCallback<Contact> callback);
}

