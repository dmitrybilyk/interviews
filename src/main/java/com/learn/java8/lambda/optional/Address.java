package com.learn.java8.lambda.optional;

import java.util.Optional;

/**
 * Created by dik81 on 11.01.19.
 */
public class Address {
    private Optional<String> street;
    private Integer houseNumber;

    public Address(String street) {
        this.street = Optional.ofNullable(street);
    }

    public Optional<String> getStreet() {
        return street;
    }

    public void setStreet(Optional<String> street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }
}
