package com.learn.core.generics.tr2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 22.11.18.
 */
public class HierarchiHandler {
    List<ParentClass> list = new ArrayList<>();

    public void printIds() {
        for (ParentClass parentClass : list) {
            parentClass.printId();
        }
    }

    public void addElements(List<? extends ParentClass> list) {
        this.list.addAll(list);
    }

    public List<ParentClass> getAll() {
        return this.list;
    }

    public <T> List<T> copy(List<? extends T> from, List<T> to) {
        for (T parentClass : from) {
            to.add(parentClass);
        }
        return to;
    }
    public void mySub(List<? super Child1> myList) {
        for (Object o : myList) {

        }
//        myList.add(new Child1());
    }
}
