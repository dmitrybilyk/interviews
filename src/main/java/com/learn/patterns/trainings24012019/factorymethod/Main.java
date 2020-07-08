package com.learn.patterns.trainings24012019.factorymethod;

/**
 * Created by dik81 on 24.01.19.
 */
public class Main {
    public static void main(String[] args) {
        AbstractPhone phone = PhoneFactory.createPhone(PhoneType.APPLE);
        System.out.println(phone.createPhone());
    }
}
