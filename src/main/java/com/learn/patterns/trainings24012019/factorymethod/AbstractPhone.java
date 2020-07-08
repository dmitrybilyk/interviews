package com.learn.patterns.trainings24012019.factorymethod;

/**
 * Created by dik81 on 24.01.19.
 */
public abstract class AbstractPhone {
    protected PhoneType phoneType;

    public AbstractPhone(PhoneType type) {
        this.phoneType = type;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    String createPhone() {
        System.out.println("creating - common");
        return phoneType + " is created";
    };
}
