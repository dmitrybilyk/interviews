package com.learn.patterns.behavioral.command.mycommand.client;

import com.learn.patterns.behavioral.command.mycommand.command.ProduceChairCommand;
import com.learn.patterns.behavioral.command.mycommand.invoker.InvokerEnterprenuir;
import com.learn.patterns.behavioral.command.mycommand.receiver.ProduceChairReceiver;
import com.learn.patterns.behavioral.command.mycommand.receiver.ProduceGoldChairReceiver;
import com.learn.patterns.behavioral.command.mycommand.receiver.ReceiverFactory;

/**
 * Created by dmitry on 30.05.15.
 */
public class ClientMain {
  public static void main(String[] args) {
    ReceiverFactory receiverFactory = new ProduceChairReceiver();
    ProduceChairCommand produceChairCommand = new ProduceChairCommand(receiverFactory);
    InvokerEnterprenuir invokerEnterprenuir = new InvokerEnterprenuir(produceChairCommand);
    invokerEnterprenuir.execute();
    receiverFactory = new ProduceGoldChairReceiver();
    produceChairCommand = new ProduceChairCommand(receiverFactory);
    invokerEnterprenuir = new InvokerEnterprenuir(produceChairCommand);
    invokerEnterprenuir.execute();
  }
}
