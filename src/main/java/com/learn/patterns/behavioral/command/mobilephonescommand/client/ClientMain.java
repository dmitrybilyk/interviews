package com.learn.patterns.behavioral.command.mobilephonescommand.client;

import com.learn.patterns.behavioral.command.mobilephonescommand.command.ProduceChinaPhoneCommand;
import com.learn.patterns.behavioral.command.mobilephonescommand.command.ProduceUSAPhoneCommand;
import com.learn.patterns.behavioral.command.mobilephonescommand.invoker.PhoneProducingInvoker;
import com.learn.patterns.behavioral.command.mobilephonescommand.receiver.ChinesePhonesProducer;
import com.learn.patterns.behavioral.command.mobilephonescommand.receiver.PhonesProducer;
import com.learn.patterns.behavioral.command.mobilephonescommand.receiver.USAPhonesProducer;

/**
 * Created by dmitry on 30.05.15.
 */
public class ClientMain {
  public static void main(String[] args) {
    PhonesProducer phonesProducer = new ChinesePhonesProducer();
    PhoneProducingInvoker invoker = new PhoneProducingInvoker(new ProduceChinaPhoneCommand(phonesProducer));
    invoker.execute();
    invoker = new PhoneProducingInvoker(new ProduceUSAPhoneCommand(new USAPhonesProducer()));
    invoker.execute();

  }
}
