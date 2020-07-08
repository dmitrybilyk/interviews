package com.learn.core.classforname;

/**
 * Created by dik81 on 12.01.19.
 */
public class SomeParent {
    private String parentName;

    public SomeParent(String parentName) {
        this.parentName = parentName;
    }

    public String getParentName() {

        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    static {
        System.out.println("from static parent");
    }

    {
        System.out.println("from super block");
    }
    public SomeParent() {
        System.out.println("from super constructor");
    }
}
