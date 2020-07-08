package com.learn.patterns.trainings24012019.factorymethod;

/**
 * Created by dik81 on 24.01.19.
 */
public class ApplePhone extends AbstractPhone {
    public ApplePhone(PhoneType phoneType) {
        super(phoneType);
        System.out.println("some specific for Apple is created");
    }
    @Override
    public String createPhone() {
        System.out.println("creating the Apple");
        return phoneType.name();
    }
}
