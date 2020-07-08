package com.learn.web.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.learn.web.gwt.shared.CustomCheckedException;
import com.learn.web.gwt.client.HelloService;
import com.learn.web.gwt.shared.Employee;

import java.util.Collections;
import java.util.List;

public class HelloServiceImpl extends RemoteServiceServlet implements HelloService {
    @Override
    public List<Employee> getEmployees() {
        Employee employee = new Employee();
        employee.setEmployeeName("some name");
        return Collections.singletonList(employee);
    }

    @Override
    public List<Employee> getEmployeesWithException() throws CustomCheckedException {
        Employee employee = new Employee();
        employee.setEmployeeName("some name");
        if ("some name".equals(employee.getEmployeeName())) {
            throw new CustomCheckedException("some checked exception");
        }
        return Collections.singletonList(employee);
    }
}
