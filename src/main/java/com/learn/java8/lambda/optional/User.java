package com.learn.java8.lambda.optional;

import java.util.Optional;

/**
 * Created by dik81 on 11.01.19.
 */
public class User {
    private String name;
    private Optional<Address> address;

    public Optional<Address> getAddress() {
        return address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }

    public User(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }
}
