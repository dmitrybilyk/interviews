package com.learn.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class OurSingleton {

    private OurSingleton() {
    }

    public static OurSingleton getInstance() {
        return HOLDER.instance;
    }

    private static class HOLDER {
        public static OurSingleton instance = new OurSingleton();
    }

    public void print(){
        System.out.println("dfdf");
    }

}
