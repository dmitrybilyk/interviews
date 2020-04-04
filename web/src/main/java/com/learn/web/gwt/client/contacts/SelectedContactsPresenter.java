package com.learn.web.gwt.client.contacts;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.learn.web.gwt.client.contacts.view.SelectedContactsView;
import com.learn.web.gwt.shared.contacts.Contact;

import java.util.List;
import java.util.stream.Collectors;

public class SelectedContactsPresenter implements Presenter {

  public SelectedContactsPresenter(SelectedContactsView selectedContactsView, List<Contact> contacts) {
    this.display = selectedContactsView;
    List<String> contactsString = contacts.stream().map(Contact::getFullName).collect(Collectors.toList());
    display.setData(contactsString);
  }

  public SelectedContactsPresenter(SelectedContactsView selectedContactsView) {
    this.display = selectedContactsView;
  }

  public interface Display {
    void setData(List<String> data);
    Widget asWidget();
  }

  private final Display display;


  public void go(final HasWidgets container) {
    container.clear();
    container.add(display.asWidget());
  }

}
