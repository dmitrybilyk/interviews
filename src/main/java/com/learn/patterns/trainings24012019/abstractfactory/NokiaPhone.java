package com.learn.patterns.trainings24012019.abstractfactory;

/**
 * Created by dik81 on 24.01.19.
 */
public class NokiaPhone extends AbstractPhone {
    public NokiaPhone(PhoneType phoneType, Location location) {
        super(phoneType, location);
        System.out.println("some specific for Nokia is created");
    }
    @Override
    public String phoneInfo() {
        super.phoneInfo();
        System.out.println("creating the Nokia");
        return phoneType.name();
    }
}
