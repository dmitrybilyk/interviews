package com.learn.web.exceptions;

/**
 * Created by bid on 8/24/14.
 */
public class CustomRuntimeException extends RuntimeException
{
   @Override
   public String getMessage()
   {

      return super.getMessage() + " custom";
   }
}
