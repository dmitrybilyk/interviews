package com.learn.core.Java8Features.lambdaexpressions.trainings;

/**
 * Created by dmitry on 28.04.17.
 */
public class OneMethodImplMain {
    public static void main(String[] args) {
        InterfaceWithOneAbstractMethod interfaceWi2thOneAbstractMethod =
                (value1, value2) -> System.out.println(value1 + value2);
        interfaceWi2thOneAbstractMethod.printString("Dima", "Ruslan111111111");
    }
}
