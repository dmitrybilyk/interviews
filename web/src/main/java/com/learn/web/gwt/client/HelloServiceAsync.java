package com.learn.web.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.learn.web.gwt.shared.Employee;

import java.util.List;

public interface HelloServiceAsync {
    void getEmployees(AsyncCallback<List<Employee>> async);
    void getEmployeesWithException(AsyncCallback<List<Employee>> async);
}
