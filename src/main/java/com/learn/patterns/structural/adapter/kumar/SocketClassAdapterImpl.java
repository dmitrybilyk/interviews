package com.learn.patterns.structural.adapter.kumar;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 12.11.13
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
//Here is the class adapter approach implementation of our adapter.
//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}