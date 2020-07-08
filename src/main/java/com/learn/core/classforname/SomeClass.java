package com.learn.core.classforname;

/**
 * Created by dik81 on 12.01.19.
 */
public class SomeClass extends SomeParent {
    private static final String SOME_CONSTANT = "someConstant";
    private static String SOME_CONSTANT2 = "someConstant2";



    public static void printConstant() {
        System.out.println(SOME_CONSTANT);
    }

    public static void someStaticMethod() {
        System.out.println("777");
    }

    private String name;

    static {
        System.out.println("from static");
    }

    static {
        System.out.println("creation of something");
    }

    {
        name = "Dima";
        System.out.println(name);
    }

    public SomeClass() {
        System.out.println("from constructor");
//        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
