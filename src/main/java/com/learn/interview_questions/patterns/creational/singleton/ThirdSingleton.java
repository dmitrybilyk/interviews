package com.learn.interview_questions.patterns.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 22.06.12
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */

//Calling getSingleton() references the inner class, triggering the JVM to load & initialize it.
// This is thread-safe, since classloading uses locks.
//
//        For subsequent calls, the JVM resolves our already-loaded inner class & returns the existing singleton.
// Thus — a cache.
//
//        And thanks to the magic of JVM optimizations, a very very efficient one.
//Решили проблему с ленивой инициализацией, но осталась проблема с обработкой ошибок в конструкторе
public class ThirdSingleton {
    private ThirdSingleton(){
    }

    private static class SingleToneHolder{
        private static ThirdSingleton INSTANCE = new ThirdSingleton();
    }

    public ThirdSingleton getInstance(){
        return SingleToneHolder.INSTANCE;
    }
}
