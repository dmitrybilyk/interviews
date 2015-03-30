package com.learn.core.datatypes.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dmitry on 30.03.15.
 */
public class CreateDate {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String dateInString = "2012-01-20 15:49:34.168";
    try {
      Date date = sdf.parse(dateInString);
      System.out.println(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
