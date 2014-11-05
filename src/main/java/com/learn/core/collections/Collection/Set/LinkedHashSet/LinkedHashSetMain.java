package com.learn.core.collections.Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by bid on 8/21/14.
 */
public class LinkedHashSetMain
{
   public static void main(String[] args)
   {
      Set<String> linkedHashSet = new LinkedHashSet<String>();
      linkedHashSet.add("First");
      linkedHashSet.add("Second");
      linkedHashSet.add("Third");
      linkedHashSet.add("Third2");
      linkedHashSet.add("Third3");
      linkedHashSet.add("Third4");

      System.out.println(linkedHashSet);


      for (String s : linkedHashSet)
      {
         System.out.println(s);
      }

   }

}
