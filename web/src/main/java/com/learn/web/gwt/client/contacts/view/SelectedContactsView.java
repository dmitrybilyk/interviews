package com.learn.web.gwt.client.contacts.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.learn.web.gwt.client.contacts.SelectedContactsPresenter;

import java.util.List;

public class SelectedContactsView extends Composite implements SelectedContactsPresenter.Display {
  private FlexTable contactsTable;

  public SelectedContactsView() {
    DecoratorPanel contentTableDecorator = new DecoratorPanel();
    initWidget(contentTableDecorator);
    contentTableDecorator.setWidth("100%");
    contentTableDecorator.setWidth("18em");

    FlexTable contentTable = new FlexTable();
    contentTable.setWidth("100%");
    contentTable.getCellFormatter().addStyleName(0, 0, "contacts-ListContainer");
    contentTable.getCellFormatter().setWidth(0, 0, "100%");
    contentTable.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
    
    // Create the menu
    //
    HorizontalPanel hPanel = new HorizontalPanel();
    hPanel.setBorderWidth(0);
    hPanel.setSpacing(0);
    hPanel.setHorizontalAlignment(HorizontalPanel.ALIGN_LEFT);
    contentTable.getCellFormatter().addStyleName(0, 0, "contacts-ListMenu");
    contentTable.setWidget(0, 0, hPanel);
    
    // Create the contacts list
    //
    contactsTable = new FlexTable();
    contactsTable.setCellSpacing(0);
    contactsTable.setCellPadding(0);
    contactsTable.setWidth("100%");
    contactsTable.addStyleName("contacts-ListContents");
    contactsTable.getColumnFormatter().setWidth(0, "15px");
    contentTable.setWidget(1, 0, contactsTable);
    
    contentTableDecorator.add(contentTable);
  }
  
  public HasClickHandlers getList() {
    return contactsTable;
  }

  public void setData(List<String> data) {
    contactsTable.removeAllRows();
    
    for (int i = 0; i < data.size(); ++i) {
      contactsTable.setWidget(i, 0, new CheckBox());
      contactsTable.setText(i, 1, data.get(i));
    }
  }

  public Widget asWidget() {
    return this;
  }
}
