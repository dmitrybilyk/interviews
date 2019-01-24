package com.learn.patterns.trainings24012019.abstractfactory;

/**
 * Created by dik81 on 24.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Location location = Location.UKRAINE;
        AbstractPhone phone = null;
        if (location == Location.UKRAINE) {
            AbstractPhoneFactory abstractPhoneFactory = new UkrainePhoneFactory();
            phone = abstractPhoneFactory.createPhone(PhoneType.APPLE);
        }
        System.out.println(phone.phoneInfo());
    }
}
