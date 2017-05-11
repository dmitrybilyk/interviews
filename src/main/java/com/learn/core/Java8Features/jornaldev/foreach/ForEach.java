package com.learn.core.Java8Features.jornaldev.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by dmitry on 11.05.17.
 */
public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
