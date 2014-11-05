package com.learn.core.collections.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by bid on 8/21/14.
 */

//Set doesn't allow duplicates. HashSet contains hashMap inside and stores objects there
public class HashSetMain
{
   public static void main(String[] args)
   {
      Set<String> hashSet = new HashSet<String>();
      hashSet.add("First");
      hashSet.add("Second");
      hashSet.add("Third");
//      hashSet.add("Third");
      hashSet.add("Fourth");
      hashSet.add("Fifth");

      Iterator it = hashSet.iterator();

      for (String s : hashSet)
      {
         System.out.println(s);
      }
   }
}
