package com.learn.twillio;// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC51a2b8fbe8b6eef12e40ef17fec9210d";
    public static final String AUTH_TOKEN =
            "e77f242fb93a579dc55217001088995a";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+380504759475"), // to
                        new PhoneNumber("+13344686094"), // from
                        "7")
                .create();

        System.out.println(message.getSid());
    }
}