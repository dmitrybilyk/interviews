package com.learn.patterns.behavioral.chainofresponsobility.trainings2;

import com.twilio.Twilio;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/**
 * Created by dik81 on 04.04.19.
 */
public class Main {
    public static void main(String[] args) {
        TVSet tvSet = new TVSet();
        AbstractProcessor colorProcessor = new ColorProcessor();
        AbstractProcessor dolbySoundProcessor = new DolbySoundProcessor();
//        dolbySoundProcessor.setNext(colorProcessor);
        AbstractProcessor fullHdProcessor = new FullHDProcessor();
        fullHdProcessor.setNext(dolbySoundProcessor);
        fullHdProcessor.perform(tvSet);

//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        ResourceSet<Message> messages = Message.reader().read();
//        for (Message message : messages) {
//            System.out.println(message.getSid() + " : " + message.getStatus());
//        }
    }
}
