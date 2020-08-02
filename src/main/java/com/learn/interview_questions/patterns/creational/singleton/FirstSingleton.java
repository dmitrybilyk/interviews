package com.learn.interview_questions.patterns.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 18.08.12
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
// Подходит только для однопоточных приложений

public class FirstSingleton {
    private static FirstSingleton instance;

    private FirstSingleton() {
    }

    public static FirstSingleton getInstance(){
        if(instance==null){
            instance = new FirstSingleton();
            return instance;
        }else{
            return instance;
        }
    }

}

class ForMain {
    public static void main(String[] args) {
//        FirstSingleton firstSingleton = new FirstSingleton();
        System.out.println(FirstSingleton.getInstance());
        System.out.println(FirstSingleton.getInstance());
    }
}
