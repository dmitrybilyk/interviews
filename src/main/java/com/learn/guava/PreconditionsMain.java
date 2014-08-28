package com.learn.guava;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Created by dmitry on 8/28/14.
 */
public class PreconditionsMain {
    public static void main(String[] args) {
        doSomething(new ArrayList<Object>());
    }

    public static void doSomething(List<Object> list) {
        checkArgument( list != null, "List must not be null" );
        checkArgument( !list.isEmpty(), "List must not be empty" );
//        doSomethingMore( list );
    }
}
