package com.learn.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by dmitry on 1/29/14.
 */
@Component
public class Employee {
   private String name;

    public DepartmentInterface getDepartmentInterface() {
        return departmentChild2;
    }

    @Autowired
//    @Qualifier(value = "departmentChild1")
    private DepartmentInterface departmentChild2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public DepartmentInterface getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
}