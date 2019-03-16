package com.learn.patterns.trainings24012019.abstractfactory;

/**
 * Created by dik81 on 24.01.19.
 */
public class USAPhoneFactory extends AbstractPhoneFactory {

    @Override
    AbstractPhone createPhone(PhoneType type) {
        if (type == PhoneType.APPLE) {
            return new ApplePhone(type, Location.USA);
        } else {
            return new NokiaPhone(type, Location.USA);
        }
    }
}
