package com.learn.java8.lambda.trainings;

/**
 * Created by dik81 on 20.11.18.
 */
@FunctionalInterface
public interface SomeInterface {
   public default void someMethod(Integer b) {
       System.out.println("default" + b);
   };
   public void someMethod(String a, Integer b);


    public static void main(String[] args) {
//        SomeInterface someInterface = new SomeInterface() {
//            @Override
//            public void someStaticMethod() {
//                System.out.println("2");
//            }
//        };
        shmain((a, b) -> {System.out.println(a + b);});


    }
    public static void shmain(SomeInterface someInterface){
        someInterface.someMethod("Dima", 37);
    };
}
