package com.learn.web.gwt.client.contacts;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.learn.web.gwt.shared.contacts.Contact;
import com.learn.web.gwt.shared.contacts.ContactDetails;

import java.util.ArrayList;

@RemoteServiceRelativePath("contactsService")
public interface ContactsService extends RemoteService {
	
  Contact addContact(Contact contact);
  Boolean deleteContact(String id); 
  ArrayList<ContactDetails> deleteContacts(ArrayList<String> ids);
  ArrayList<ContactDetails> getContactDetails();
  Contact getContact(String id);
  Contact updateContact(Contact contact);
}
