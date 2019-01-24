package com.learn.patterns.trainings24012019.abstractfactory;

/**
 * Created by dik81 on 24.01.19.
 */
public class ApplePhone extends AbstractPhone {
    public ApplePhone(PhoneType phoneType, Location location) {
        super(phoneType, location);
        System.out.println("some specific for Apple is created");
    }
    @Override
    public String phoneInfo() {
        System.out.println("creating the Apple");
        return super.phoneInfo();
    }
}
