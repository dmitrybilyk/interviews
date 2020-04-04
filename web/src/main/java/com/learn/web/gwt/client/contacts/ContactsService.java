package com.learn.web.gwt.client.contacts;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.learn.web.gwt.shared.contacts.Contact;
import com.learn.web.gwt.shared.contacts.ContactDetails;

import java.util.ArrayList;
import java.util.List;

@RemoteServiceRelativePath("contactsService")
public interface ContactsService extends RemoteService {
	
  Contact addContact(Contact contact);
  Boolean deleteContact(String id);
  List<ContactDetails> deleteContacts(List<String> ids);
  List<ContactDetails> getContactDetails();
  Contact getContact(String id);
  List<Contact> getSelectedContact(List<Integer> ids);
  Contact updateContact(Contact contact);
}
