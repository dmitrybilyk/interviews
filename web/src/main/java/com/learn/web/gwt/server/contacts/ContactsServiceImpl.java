package com.learn.web.gwt.server.contacts;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.learn.web.gwt.client.contacts.ContactsService;
import com.learn.web.gwt.shared.contacts.Contact;
import com.learn.web.gwt.shared.contacts.ContactDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class ContactsServiceImpl extends RemoteServiceServlet implements ContactsService {

  private static final String[] contactsFirstNameData = new String[] {
      "Hollie", "Emerson", "Healy", "Brigitte", "Elba", "Claudio",
      "Dena", "Christina", "Gail", "Orville", "Rae", "Mildred",
      "Candice", "Louise", "Emilio", "Geneva", "Heriberto", "Bulrush", 
      "Abigail", "Chad", "Terry", "Bell"};
  
  private final String[] contactsLastNameData = new String[] {
      "Voss", "Milton", "Colette", "Cobb", "Lockhart", "Engle",
      "Pacheco", "Blake", "Horton", "Daniel", "Childers", "Starnes",
      "Carson", "Kelchner", "Hutchinson", "Underwood", "Rush", "Bouchard", 
      "Louis", "Andrews", "English", "Snedden"};
  
  private final String[] contactsEmailData = new String[] {
      "mark@example.com", "hollie@example.com", "boticario@example.com",
      "emerson@example.com", "healy@example.com", "brigitte@example.com",
      "elba@example.com", "claudio@example.com", "dena@example.com",
      "brasilsp@example.com", "parker@example.com", "derbvktqsr@example.com",
      "qetlyxxogg@example.com", "antenas_sul@example.com",
      "cblake@example.com", "gailh@example.com", "orville@example.com",
      "post_master@example.com", "rchilders@example.com", "buster@example.com",
      "user31065@example.com", "ftsgeolbx@example.com"};
      
  private final Map<String, Contact> contacts = new HashMap<String, Contact>();

  public ContactsServiceImpl() {
    initContacts();
  }
  
  private void initContacts() {
    // TODO: Create a real UID for each contact
    //
    for (int i = 0; i < contactsFirstNameData.length && i < contactsLastNameData.length && i < contactsEmailData.length; ++i) {
      Contact contact = new Contact(String.valueOf(i), contactsFirstNameData[i], contactsLastNameData[i], contactsEmailData[i]);
      contacts.put(contact.getId(), contact); 
    }
  }
  
  public Contact addContact(Contact contact) {
    contact.setId(String.valueOf(contacts.size()));
    contacts.put(contact.getId(), contact); 
    return contact;
  }

  public Contact updateContact(Contact contact) {
    contacts.remove(contact.getId());
    contacts.put(contact.getId(), contact); 
    return contact;
  }

  public Boolean deleteContact(String id) {
    contacts.remove(String.valueOf(id));
    return true;
  }
  
  public List<ContactDetails> deleteContacts(List<String> ids) {

    for (int i = 0; i < ids.size(); ++i) {
      deleteContact(ids.get(i));
    }
    
    return getContactDetails();
  }
  
  public List<ContactDetails> getContactDetails() {
          List<ContactDetails> contactDetails = new ArrayList<ContactDetails>();
    
    Iterator<String> it = contacts.keySet().iterator();
    while(it.hasNext()) { 
      Contact contact = contacts.get(it.next());          
      contactDetails.add(contact.getLightWeightContact());
    }
    
    return contactDetails;
  }

  public Contact getContact(String id) {
    return contacts.get(id);
  }

  @Override public List<Contact> getSelectedContact(List<Integer> ids) {
    return contacts.values().stream().filter(o -> ids.contains(Integer.valueOf(o.getId()))).collect(Collectors.toList());
  }
}
