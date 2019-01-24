package com.learn.patterns.trainings24012019.factorymethod;

/**
 * Created by dik81 on 24.01.19.
 */
public class PhoneFactory {
    public static AbstractPhone createPhone(PhoneType phoneType) {
        switch (phoneType) {
            case NOKIA:
                return new NokiaPhone(PhoneType.NOKIA);
            case APPLE:
                return new ApplePhone(PhoneType.APPLE);
        }
            return new AbstractPhone(PhoneType.OLD) {
                @Override
                public String createPhone() {
                    return "OLD PHONE without new features";
                }
            };
    }
}
