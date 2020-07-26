package com.learn.interview_questions.patterns.structural.proxy.javaproxy.customjavaproxy;

/**
 * Created by bid on 8/13/14.
 */
public enum YesOrNoEnum
{
   YES("yes"), NO("no");

   private String stringValue;

   YesOrNoEnum(final String stringValue)
   {
      this.stringValue = stringValue;
   }

   public String getStringValue()
   {
      return stringValue;
   }

   public void setStringValue(final String stringValue)
   {
      this.stringValue = stringValue;
   }
}
