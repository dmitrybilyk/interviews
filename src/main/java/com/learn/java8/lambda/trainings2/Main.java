package com.learn.java8.lambda.trainings2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dik81 on 04.02.19.
 */
public class Main {
    public static void main(String[] args) {
        WhasherMashine whasherMashine = new WhasherMashine();
        MainForPrint mainForPrint = new MainForPrint();
        whasherMashine.washWithSomeWhasher(mainForPrint::print);

        List<SomeObject> someObjectList = Arrays.asList(new SomeObject("dima", 18), new SomeObject("dima", 11));
        someObjectList.stream().filter(someObject-> someObject.getSomeAge() > 17).
                map(SomeObject::getSomeAge).forEach(System.out::println);

    }
}
