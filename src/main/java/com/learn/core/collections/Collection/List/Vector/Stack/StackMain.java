package com.learn.core.collections.Collection.List.Vector.Stack;

import java.util.List;
import java.util.Stack;

/**
 * Created by bid on 8/21/14.
 */

//Stack works in the LIFO way
public class StackMain
{
   public static void main(String[] args)
   {
      Stack<String> stack = new Stack<String>();
      stack.push("First");
      stack.push("Second");
      stack.push("Third");

      System.out.println(stack.pop());
   }
}
