package com.learn.spring.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    private String name;

    public String getName() {
        return name;
    }

//    @Value("some name of driver")
    public void setName(String name) {
        this.name = name;
    }
}
