package com.learn.core.collections.failsafefailfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
            Integer a = itr.next();
            System.out.println(a);
            integers.remove(a);
//            itr.remove();
        }

        while (itr.hasNext()) {
            Integer a = itr.next();
            System.out.println(a);
//            itr.remove();
        }
    }
}
