package com.learn.patterns.behavioral.command.trainings;

/**
 * Created by dmitry on 16.03.19.
 */
public class ChiefCookerReceiverImpl implements CookerReceiver{
    @Override
    public void cookSoup(boolean isFish) {
        System.out.println( " cooking soup fish -" + isFish);
    }

    @Override
    public void cookCake(boolean isSweat) {
        System.out.println(" cooking cake sweat - " + isSweat);
    }
}
