package com.learn.patterns.structural.adapter.trainings2;



import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 29.01.19.
 */
public class AllowPrintStringInsteadOfListAdapter implements TargetInterface {
    @Override
    public void printString(String stringToPrint) {
        AdapteeClientClass adapteeClientClass = new AdapteeClientClass();

        String[] strings = StringUtils.split(stringToPrint, " ");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strings));
        adapteeClientClass.print(list);
    }
}
