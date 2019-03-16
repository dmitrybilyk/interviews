package com.learn.spring.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dmitry on 24.01.15.
 */
@Component
public class Department implements DepartmentInterface{
    @Value("fuccck")
    private String name;

    public String getName() {
        return name;
    }

//    @Value("fuccck")
    public void setName(String name) {
        this.name = name;
    }
}
