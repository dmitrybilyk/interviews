//package com.learn.web.gwt.client.contacts;
//
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.event.shared.HandlerManager;
//import com.google.gwt.junit.client.GWTTestCase;
//import com.learn.web.gwt.client.contacts.ContactsPresenter;
//import com.learn.web.gwt.client.contacts.ContactsService;
//import com.learn.web.gwt.client.contacts.ContactsServiceAsync;
//import com.learn.web.gwt.client.contacts.view.ContactsView;
//import com.learn.web.gwt.shared.contacts.ContactDetails;
//
//import java.util.ArrayList;
//
//public class ExampleGWTTest extends GWTTestCase {
//  private ContactsPresenter contactsPresenter;
//  private ContactsServiceAsync rpcService;
//  private HandlerManager eventBus;
//  private ContactsPresenter.Display display;
//
//  public String getModuleName() {
//    return "com.learn.web.gwt.LearnGwt";
//  }
//
//  public void gwtSetUp() {
//    rpcService = GWT.create(ContactsService.class);
//    eventBus = new HandlerManager(null);
//    display = new ContactsView();
//    contactsPresenter = new ContactsPresenter(rpcService, eventBus, display);
//  }
//
//  public void testContactSort(){
//    ArrayList<ContactDetails> contactDetails = new ArrayList<ContactDetails>();
//    contactDetails.add(new ContactDetails("0", "c_contact"));
//    contactDetails.add(new ContactDetails("1", "b_contact"));
//    contactDetails.add(new ContactDetails("2", "a_contact"));
//    contactsPresenter.setContactDetails(contactDetails);
//    contactsPresenter.sortContactDetails();
//    assertTrue(contactsPresenter.getContactDetail(0).getDisplayName().equals("a_contact"));
//    assertTrue(contactsPresenter.getContactDetail(1).getDisplayName().equals("b_contact"));
//    assertTrue(contactsPresenter.getContactDetail(2).getDisplayName().equals("c_contact"));
//  }
//}
