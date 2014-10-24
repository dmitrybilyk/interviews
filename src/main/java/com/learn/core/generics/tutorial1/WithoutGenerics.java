package com.learn.core.generics.tutorial1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 10.04.13
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */
public class WithoutGenerics {
    public static void main(String[] args) {
        List stringList1 = new ArrayList();
        stringList1.add ("Java 5");
        stringList1.add ("with generics");
        String s1 = (String) stringList1.get (0);
        System.out.println(s1);
    }
}
