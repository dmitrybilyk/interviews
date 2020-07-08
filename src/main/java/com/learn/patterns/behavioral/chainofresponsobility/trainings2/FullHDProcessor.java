package com.learn.patterns.behavioral.chainofresponsobility.trainings2;

/**
 * Created by dik81 on 04.04.19.
 */
public class FullHDProcessor extends AbstractProcessor {

    @Override
    public void process(TVSet tvSet) {
        System.out.println("adding full hd");
        tvSet.setLevel(tvSet.getLevel() + 5);
    }
}
