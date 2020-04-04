package com.learn.web.gwt.client.contacts;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.learn.web.gwt.client.contacts.event.AddContactEvent;
import com.learn.web.gwt.client.contacts.event.EditContactEvent;
import com.learn.web.gwt.client.contacts.event.ShowSelectedContactsEvent;
import com.learn.web.gwt.shared.contacts.ContactDetails;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ContactsPresenter implements Presenter {  

  private List<ContactDetails> contactDetails;

  public interface Display {
    HasClickHandlers getAddButton();
    HasClickHandlers getDeleteButton();
    HasClickHandlers getShowSelectedButton();
    HasClickHandlers getList();
    void setData(List<String> data);
    int getClickedRow(ClickEvent event);
    List<Integer> getSelectedRows();
    Widget asWidget();
  }
  
  private final ContactsServiceAsync rpcService;
  private final HandlerManager eventBus;
  private final Display display;
  
  public ContactsPresenter(ContactsServiceAsync rpcService, HandlerManager eventBus, Display view) {
    this.rpcService = rpcService;
    this.eventBus = eventBus;
    this.display = view;
  }
  
  public void bind() {
    display.getAddButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        eventBus.fireEvent(new AddContactEvent());
      }
    });

    display.getDeleteButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        deleteSelectedContacts();
      }
    });

    display.getShowSelectedButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        ShowSelectedContactsEvent showSelectedContactsEvent = new ShowSelectedContactsEvent();
        showSelectedContactsEvent.setSelectedContactsIds(getSelectedContactIds());
        eventBus.fireEvent(showSelectedContactsEvent);
      }
    });
    
    display.getList().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        int selectedRow = display.getClickedRow(event);
        
        if (selectedRow >= 0) {
          String id = contactDetails.get(selectedRow).getId();
          eventBus.fireEvent(new EditContactEvent(id));
        }
      }
    });
  }
  
  public void go(final HasWidgets container) {
    bind();
    container.clear();
    container.add(display.asWidget());
    fetchContactDetails();
  }

  public void sortContactDetails() {
    
    // Yes, we could use a more optimized method of sorting, but the 
    //  point is to create a test case that helps illustrate the higher
    //  level concepts used when creating MVP-based applications. 
    //
    for (int i = 0; i < contactDetails.size(); ++i) {
      for (int j = 0; j < contactDetails.size() - 1; ++j) {
        if (contactDetails.get(j).getDisplayName().compareToIgnoreCase(contactDetails.get(j + 1).getDisplayName()) >= 0) {
          ContactDetails tmp = contactDetails.get(j);
          contactDetails.set(j, contactDetails.get(j + 1));
          contactDetails.set(j + 1, tmp);
        }
      }
    }
  }

  public void setContactDetails(List<ContactDetails> contactDetails) {
    this.contactDetails = contactDetails;
  }
  
  public ContactDetails getContactDetail(int index) {
    return contactDetails.get(index);
  }
  
  private void fetchContactDetails() {
    rpcService.getContactDetails(new AsyncCallback<List<ContactDetails>>() {
      public void onSuccess(List<ContactDetails> result) {
          contactDetails = result;
          sortContactDetails();
          List<String> data = new ArrayList<String>();

          for (int i = 0; i < result.size(); ++i) {
            data.add(contactDetails.get(i).getDisplayName());
          }
          
          display.setData(data);
      }
      
      public void onFailure(Throwable caught) {
        Window.alert("Error fetching contact details");
      }
    });
  }

  private void deleteSelectedContacts() {
    List<Integer> ids = getSelectedContactIds();

    rpcService.deleteContacts(ids, new AsyncCallback<List<ContactDetails>>() {
      public void onSuccess(List<ContactDetails> result) {
        contactDetails = result;
        sortContactDetails();
        List<String> data = new ArrayList<String>();

        for (int i = 0; i < result.size(); ++i) {
          data.add(contactDetails.get(i).getDisplayName());
        }
        
        display.setData(data);
        
      }
      
      public void onFailure(Throwable caught) {
        Window.alert("Error deleting selected contacts");
      }
    });
  }

  @NotNull private List<Integer> getSelectedContactIds() {
    return display.getSelectedRows();
  }
}
