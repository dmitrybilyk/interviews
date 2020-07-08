package com.learn.patterns.behavioral.chainofresponsobility.trainings2;

/**
 * Created by dik81 on 04.04.19.
 */
public class DolbySoundProcessor extends AbstractProcessor {

    @Override
    public void process(TVSet tvSet) {
        System.out.println("adding dolby sound");
        tvSet.setLevel(tvSet.getLevel() + 5);
    }
}
