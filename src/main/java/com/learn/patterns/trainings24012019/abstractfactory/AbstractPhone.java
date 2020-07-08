package com.learn.patterns.trainings24012019.abstractfactory;

/**
 * Created by dik81 on 24.01.19.
 */
public abstract class AbstractPhone {
    protected PhoneType phoneType;
    protected Location location;

    public AbstractPhone(PhoneType type, Location location) {
        this.phoneType = type;
        this.location = location;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    String phoneInfo() {
        System.out.println("creating - common");
        return phoneType + " is created in " + location.name();
    };
}
