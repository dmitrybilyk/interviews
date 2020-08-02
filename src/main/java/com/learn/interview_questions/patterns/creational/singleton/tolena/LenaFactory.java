package com.learn.interview_questions.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class LenaFactory {

    public static Car buildCar(String color) {
        Car car = null;
        if(color.equals("red")) {
            car = new RedCar();
        } else if (color.equals("green")) {
            car = new GreenCar();
        } else {
            car = new Car() {
                @Override
                public void build() {
                    System.out.println("creating non color car");
                }
            };
        }
        return car;
    }
}
