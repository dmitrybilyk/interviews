package com.learn.spring.autowiring;

import org.springframework.cache.annotation.Cacheable;

/**
 * Created by dmitry on 1/29/14.
 */
public class Employee {
   private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}