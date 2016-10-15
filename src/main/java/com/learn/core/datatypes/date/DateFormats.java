package com.learn.core.datatypes.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dmitry on 22.01.15.
 */
public class DateFormats {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM yyy");
        System.out.println("date: " + simpleDateFormat.format(new Date()));
    }
}
