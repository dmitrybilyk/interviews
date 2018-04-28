package com.learn.core.collections.Collection.List.Vector;

import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * Created by bid on 8/21/14.
 */

// Vector is the same as ArrayList but it's methods are synchronized
public class VectorMain
{
   public static void main(String[] args)
   {
      List<String> vector = new Vector<String>();
      vector.add("First");
      System.out.println(vector.get(0));
   }
}
