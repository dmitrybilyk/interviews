package com.learn.patterns.behavioral.chainofresponsobility.trainings2;

/**
 * Created by dik81 on 04.04.19.
 */
public class ColorProcessor extends AbstractProcessor {
    @Override
    public void process(TVSet tvSet) {
        System.out.println("adding color");
        tvSet.setLevel(tvSet.getLevel() + 5);
    }
}
