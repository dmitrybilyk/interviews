package com.learn.web.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.learn.web.gwt.client.contacts.AppController;
import com.learn.web.gwt.client.contacts.ContactsService;
import com.learn.web.gwt.client.contacts.ContactsServiceAsync;
import com.learn.web.gwt.shared.CustomCheckedException;
import com.learn.web.gwt.shared.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 07.01.19.
 */
public class LearnGwt implements EntryPoint {
    @Override
    public void onModuleLoad() {

        ContactsServiceAsync rpcService = GWT.create(ContactsService.class);
        HandlerManager eventBus = new HandlerManager(null);
        AppController appViewer = new AppController(rpcService, eventBus);
        appViewer.go(RootPanel.get());
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
//        RootPanel.get().add(panel);
    }
}
