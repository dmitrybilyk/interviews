package com.learn.patterns.trainings24012019.factorymethod;

/**
 * Created by dik81 on 24.01.19.
 */
public class NokiaPhone extends AbstractPhone {
    public NokiaPhone(PhoneType phoneType) {
        super(phoneType);
        System.out.println("some specific for Nokia is created");
    }
    @Override
    public String createPhone() {
        System.out.println("creating the Nokia");
        return phoneType.name();
    }
}
