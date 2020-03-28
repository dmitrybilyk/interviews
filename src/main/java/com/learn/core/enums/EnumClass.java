package com.learn.core.enums;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 27.06.12
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public enum EnumClass {
    JUNIOR("1"),
    MIDDLE("2"),
    SENIOR("3");

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    EnumClass(String value) {
        this.value = value;
    }

    public static String getFirst2CharsOfElement(EnumClass enumClass) {
        for (EnumClass aClass : EnumClass.values()) {
            if (aClass == enumClass) {
                return aClass.name().substring(0, 2);
            }
        }
        return "dd";
    }

    public static void main(String[] args){
        EnumClass enumClass = EnumClass.valueOf("SENIOR");
        System.out.println(EnumClass.JUNIOR.name());
        System.out.println(MIDDLE.ordinal());
        System.out.println(EnumClass.getFirst2CharsOfElement(enumClass));
    }
}
