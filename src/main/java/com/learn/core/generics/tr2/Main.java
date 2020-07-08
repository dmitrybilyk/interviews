package com.learn.core.generics.tr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dik81 on 22.11.18.
 */
public class Main {
    public static void main(String[] args) {
        List<Child1> child1s = Arrays.asList(new Child1(), new Child1());
        List<Child2> child2s = Arrays.asList(new Child2(), new Child2());
        List<ParentClass> parentClasses = Arrays.asList(new ParentClass(), new ParentClass());
        HierarchiHandler handler = new HierarchiHandler();
        handler.addElements(child1s);
        List<ParentClass> to = handler.copy(parentClasses, new ArrayList<>());
        for (ParentClass child1 : to) {
            System.out.println(child1.getId());
        }
        handler.mySub(parentClasses);
//        handler.printIds();
    }
}
