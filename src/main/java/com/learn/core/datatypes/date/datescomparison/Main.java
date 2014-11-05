package com.learn.core.datatypes.date.datescomparison;

import java.util.Date;

/**
 * Created by dik81 on 9/24/14.
 */
public class Main {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(hasDateChanged(null, date));
  }

  private static boolean hasDateChanged(final Date oldDateValue, final Date newDateValue){
    if(oldDateValue == null && newDateValue != null ||
            oldDateValue != null && newDateValue == null) {
      return false;
    }

    if (oldDateValue != null) {
      return newDateValue.compareTo(oldDateValue) != 0;
    }
    return true;
  }
}
