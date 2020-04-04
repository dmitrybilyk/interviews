package com.learn.web.gwt.client.contacts.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.learn.web.gwt.client.contacts.ContactsPresenter;

import java.util.ArrayList;
import java.util.List;

public class ContactsViewBinder implements IsWidget, ContactsPresenter.Display{

        private Widget widget;

        @Override public HasClickHandlers getAddButton() {
                return addButton;
        }

        @Override public HasClickHandlers getDeleteButton() {
                return deleteButton;
        }

        @Override public HasClickHandlers getShowSelectedButton() {
                return showSelectedButton;
        }

        @Override public HasClickHandlers getList() {
                return contactsTable;
        }

        @Override public void setData(List<String> data) {
                contactsTable.removeAllRows();

                for (int i = 0; i < data.size(); ++i) {
                        contactsTable.setWidget(i, 0, new CheckBox());
                        contactsTable.setText(i, 1, data.get(i));
                }
        }

        public int getClickedRow(ClickEvent event) {
                int selectedRow = -1;
                HTMLTable.Cell cell = contactsTable.getCellForEvent(event);

                if (cell != null) {
                        // Suppress clicks if the user is actually selecting the
                        //  check box
                        //
                        if (cell.getCellIndex() > 0) {
                                selectedRow = cell.getRowIndex();
                        }
                }

                return selectedRow;
        }

        public List<Integer> getSelectedRows() {
                List<Integer> selectedRows = new ArrayList<Integer>();

                for (int i = 0; i < contactsTable.getRowCount(); ++i) {
                        CheckBox checkBox = (CheckBox)contactsTable.getWidget(i, 0);
                        if (checkBox.getValue()) {
                                selectedRows.add(i);
                        }
                }

                return selectedRows;
        }

        @Override
        public Widget asWidget() {
                if (widget == null) {
                        widget = ourUiBinder.createAndBindUi(this);
                }
                return widget;
        }

        interface ContactsViewBinderUiBinder extends UiBinder<VerticalPanel, ContactsViewBinder> {
        }

        private static ContactsViewBinderUiBinder ourUiBinder = GWT.create(ContactsViewBinderUiBinder.class);

        public ContactsViewBinder() {
//                ourUiBinder.createAndBindUi(this);
        }

        @UiField(provided = true)
        public HorizontalPanel decoratorPanel = new HorizontalPanel();

        @UiField(provided = true)
        public FlexTable contentTable = new FlexTable();

        @UiField(provided = true)
        public HorizontalPanel hPanel = new HorizontalPanel();

        @UiField(provided = true)
        public Button addButton = new Button("Add");
        @UiField(provided = true)
        public Button deleteButton = new Button("Delete");
        @UiField(provided = true)
        public Button showSelectedButton = new Button("Show Selected");

        @UiField(provided = true)
        public FlexTable contactsTable = new FlexTable();

        public FlexTable getContentTable() {
                return contentTable;
        }

        public void setContentTable(FlexTable contentTable) {
                this.contentTable = contentTable;
        }

        public FlexTable getContactsTable() {
                return contactsTable;
        }

        public void setContactsTable(FlexTable contactsTable) {
                this.contactsTable = contactsTable;
        }
        //        public DecoratorPanel getDecoratorPanel() {
//                return decoratorPanel;
//        }
//
//        public void setDecoratorPanel(DecoratorPanel decoratorPanel) {
//                this.decoratorPanel = decoratorPanel;
//        }


}