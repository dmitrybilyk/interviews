package com.learn.web.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.learn.web.gwt.shared.CustomCheckedException;
import com.learn.web.gwt.shared.Employee;

import java.util.List;

@RemoteServiceRelativePath("helloService")
public interface HelloService extends RemoteService {
    List<Employee> getEmployees();
    List<Employee> getEmployeesWithException() throws CustomCheckedException;
}
