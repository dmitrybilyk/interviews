package com.learn.core.generics.tr2;

/**
 * Created by dik81 on 22.11.18.
 */
public class ParentClass {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void printId() {
        System.out.println(getId());
    }
}
