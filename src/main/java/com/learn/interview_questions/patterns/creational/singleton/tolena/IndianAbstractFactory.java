package com.learn.interview_questions.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class IndianAbstractFactory implements CountryAbstractFactory {
    @Override
    public void buildCarInCountry(Car car) {
        car.build();
    }
}
