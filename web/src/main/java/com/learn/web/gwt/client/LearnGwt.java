package com.learn.web.gwt.client;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.builder.shared.AnchorBuilder;
import com.google.gwt.dom.builder.shared.DivBuilder;
import com.google.gwt.dom.builder.shared.LabelBuilder;
import com.google.gwt.dom.builder.shared.TableCellBuilder;
import com.google.gwt.dom.builder.shared.TableColBuilder;
import com.google.gwt.dom.builder.shared.TableRowBuilder;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.cellview.client.AbstractCellTable;
import com.google.gwt.user.cellview.client.AbstractHeaderOrFooterBuilder;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.learn.web.gwt.client.contacts.ContactsService;
import com.learn.web.gwt.client.contacts.ContactsServiceAsync;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dmitry on 07.01.19.
 */
public class LearnGwt implements EntryPoint {
//    public static HandlerManager eventBus = new HandlerManager(null);
//    private final MVPInjector injector = GWT.create(MVPInjector.class);
//    @Inject
//    private EventBus eventBus;
    @Override
    public void onModuleLoad() {

        CONTACTS.add(new Contact("John", new Date(80, 4, 12), "123 Fourth Avenue"));
        CONTACTS.add(new Contact("Joe", new Date(85, 2, 22), "22 Lance Ln"));
        CONTACTS.add(new Contact("George",new Date(46, 6, 6),"1600 Pennsylvania Avenue"));

        ContactsServiceAsync rpcService = GWT.create(ContactsService.class);
//        AppController appViewer = new AppController(rpcService);
//        appViewer.go(RootPanel.get());
//        HelloServiceAsync helloServiceAsync = GWT.create(HelloService.class);
//
//        helloServiceAsync.getEmployees(new AsyncCallback<List<Employee>>() {
//            @Override
//            public void onFailure(Throwable caught) {
//
//            }
//
//            @Override
//            public void onSuccess(List<Employee> result) {
//                List<String> strings = new ArrayList<>();
//                for (Employee employee : result) {
//                    strings.add(employee.getEmployeeName());
//                }
//                HelloWidgetPanel panel = new HelloWidgetPanel(strings);
//                RootPanel.get().add(panel);
//            }
//        });
//
//
//        helloServiceAsync.getEmployeesWithException(new AsyncCallback<List<Employee>>() {
//            @Override
//            public void onFailure(Throwable caught) {
//                if (caught instanceof CustomCheckedException) {
//                    Window.alert("some custom checked exception occurred");
//                }
//            }
//
//            @Override
//            public void onSuccess(List<Employee> result) {
//                List<String> strings = new ArrayList<>();
//                for (Employee employee : result) {
//                    strings.add(employee.getEmployeeName());
//                }
//                HelloWidgetPanel panel = new HelloWidgetPanel(strings);
//                RootPanel.get().add(panel);
//            }
//        });


//        DockWidgetPanel panel = new DockWidgetPanel("dd", "dff");
//        RootPanel.get().add(new Label("dfdfd"));
        createCelleTable();

    }

    private void createCelleTable() {
        // Create a CellTable.
        AbstractCellTable<Contact> table = new CellTable<Contact>();
        table.setKeyboardSelectionPolicy(HasKeyboardSelectionPolicy.KeyboardSelectionPolicy.ENABLED);

        // Add a text column to show the name.
        TextColumn<Contact> nameColumn =
                new TextColumn<LearnGwt.Contact>() {
                    @Override
                    public String getValue(Contact object) {
                        return object.name;
                    }
                };
        table.addColumn(nameColumn);

        // Add a date column to show the birthday.
        DateCell dateCell = new DateCell();
        Column<Contact, Date> dateColumn
                = new Column<Contact, Date>(dateCell) {
            @Override
            public Date getValue(Contact object) {
                return object.birthday;
            }
        };
        table.addColumn(dateColumn);

        // Add a text column to show the address.
        TextColumn<Contact> addressColumn
                = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact object) {
                return object.address;
            }
        };
        table.addColumn(addressColumn);
        // Add a text column to show the address.
        TextColumn<Contact> complexColumn
                = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact object) {
//                object.current = 0;
//                String s = object.map.get(0);
//                object.currentValue = s;
                return object.currentValue;
            }
        };
        table.addColumn(complexColumn, "Complex Column");

        // Add a selection model to handle user selection.
        final SingleSelectionModel<Contact> selectionModel
                = new SingleSelectionModel<Contact>();
        table.setSelectionModel(selectionModel);
        selectionModel.addSelectionChangeHandler(
                new SelectionChangeEvent.Handler() {
                    public void onSelectionChange(SelectionChangeEvent event) {
                        LearnGwt.Contact selected = selectionModel.getSelectedObject();
                        if (selected != null) {
                            Window.alert("You selected: " + selected.name);
                        }
                    }
                });

        table.setHeaderBuilder(new MyCustomHeaderBuilder(table, false));

        // Set the total row count. This isn't strictly necessary,
        // but it affects paging calculations, so its good habit to
        // keep the row count up to date.
        table.setRowCount(CONTACTS.size(), true);

        // Push the data into the widget.
//        table.setRowData(0, CONTACTS);

//        / Create a data provider.
        dataProvider = new ListDataProvider<Contact>();

        // Connect the table to the data provider.
        dataProvider.addDataDisplay(table);

        // Add the data to the data provider, which automatically pushes it to
        // the
        // widget.
        List<Contact> list = dataProvider.getList();
        for (Contact contact : CONTACTS) {
            list.add(contact);
        }

        VerticalPanel panel = new VerticalPanel();
        panel.setBorderWidth(1);
        panel.setWidth("400");
        panel.add(table);

        // Add the widgets to the root panel.
        RootPanel.get().add(panel);
        Button addDataButton = new Button("Add row data");
        addDataButton.addClickHandler(event -> {
            dataProvider.getList().forEach(contact -> {
                contact.current = 1;
                contact.currentValue = contact.map.get(1);
            });
            dataProvider.refresh();
//            dataProvider.getList().forEach(contact -> contact.birthday = new Date());
//            dataProvider.refresh();
        });
        RootPanel.get().add(addDataButton);
    }

    private static class Contact {
        private final String address;
        private Date birthday;
        private final String name;
        Map<Integer, String> map = new HashMap<>();
        public int current;
        public String currentValue;

        public Contact(String name, Date birthday, String address) {
            this.name = name;
            this.birthday = birthday;
            this.address = address;
            map.put(0, "first");
            map.put(1, "second");
            map.put(2, "third");
            currentValue = map.get(0);
        }
    }


    private static List<Contact> CONTACTS = new ArrayList<>();
    ListDataProvider<Contact> dataProvider;



    private class MyCustomHeaderBuilder extends AbstractHeaderOrFooterBuilder<Contact> {

        public MyCustomHeaderBuilder(
                AbstractCellTable<Contact> table,
                boolean isFooter) {
            super(table, isFooter);
            // TODO Auto-generated constructor stub

        }

        @Override
        public boolean buildHeaderOrFooterImpl() {
            TableRowBuilder row = startRow();
            TableCellBuilder th = row.startTH();
//            DivBuilder div = th.startDiv();

//            Button button = new Button("Option");
//            TextBox field = new TextBox();
//            ListBox list = new ListBox();
//            list.addItem("item 1");
//            list.addItem("item 2");
//            list.addItem("item 3");
//            list.addChangeHandler(event -> {
//                getTable().getColumn(1).getCell().setValue(new Cell.Context(1,1,));
//            });

//            button.getElement().setId("headerButton");
//            div.html(SafeHtmlUtils.fromTrustedString("Period "+ button.getElement()));
//
//            div.end();
//            th.endTH();
//            row.endTR();

            row.startTR();
            th = row.startTH();
//            div = th.startDiv();
//
//            div.html(SafeHtmlUtils.fromTrustedString("Comment" + field.getElement()));
//
//            div.end();
            th.html(SafeHtmlUtils.fromTrustedString("Name"));
            th.endTH();

            th = row.startTH();
            th.html(SafeHtmlUtils.fromTrustedString("Date of birth"));
            th.endTH();

            th = row.startTH();
            th.html(SafeHtmlUtils.fromTrustedString("Address1"));
            th.endTH();

            th = row.startTH().colSpan(3);
            DivBuilder div = th.startDiv();
//            TableCellBuilder td = th.startTD();
            Button previous = new Button("Next");
            previous.getElement().setId("headerButton");
            previous.addClickHandler(new ClickHandler() {
                @Override public void onClick(ClickEvent event) {
                    dataProvider.getList().forEach(contact -> {
                        contact.current = 1;
                        contact.currentValue = contact.map.get(1);
                    });
                    dataProvider.refresh();
                }
            });
//            DivBuilder divBuilder = td.startDiv();
            div.html(SafeHtmlUtils.fromTrustedString("Next"+ previous.getElement()));
//            divBuilder.endDiv();
//            td.html();
//            td.endTD();
//            AnchorBuilder anchorBuilder = td.startAnchor().html(SafeHtmlUtils.fromTrustedString("Prev"));
//
//            anchorBuilder.startAnchor();
//            anchorBuilder.endAnchor();
//            td.endAnchor();
//
//            LabelBuilder labelBuilder = td.startLabel().html(SafeHtmlUtils.fromTrustedString("Leg"));
//            labelBuilder.endLabel();
//
//            anchorBuilder = td.startAnchor().html(SafeHtmlUtils.fromTrustedString("Next"));
//            anchorBuilder.endAnchor();
//            td.endTD();
            div.endDiv();
            th.endTH();

//            th = row.startTH();
//            div = th.startDiv();
//
//            div.html(SafeHtmlUtils.fromTrustedString("Name "));
//
//            div.end();
//            th.endTH();
            row.endTR();

            return true;
        }
    }

}
