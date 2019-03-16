package com.learn.patterns.structural.adapter.trainings2;

import java.util.List;

/**
 * Created by dmitry on 29.01.19.
 */
public class AdapteeClientClass {
    public void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        };
    }
}
