package com.learn.web.gwt.client.contacts;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.learn.web.gwt.shared.contacts.Contact;
import com.learn.web.gwt.shared.contacts.ContactDetails;

import java.util.ArrayList;
import java.util.List;

public interface ContactsServiceAsync {

  public void addContact(Contact contact, AsyncCallback<Contact> callback);
  public void deleteContact(String id, AsyncCallback<Boolean> callback);
  public void deleteContacts(List<Integer> ids, AsyncCallback<List<ContactDetails>> callback);
  public void getContactDetails(AsyncCallback<List<ContactDetails>> callback);
  public void getContact(String id, AsyncCallback<Contact> callback);
  public void updateContact(Contact contact, AsyncCallback<Contact> callback);

  public void getSelectedContact(List<Integer> ids, AsyncCallback<List<Contact>> async);
}

