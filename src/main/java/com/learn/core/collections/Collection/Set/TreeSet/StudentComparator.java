package com.learn.core.collections.Collection.Set.TreeSet;

import java.util.Comparator;

/**
 * Created by bid on 8/21/14.
 */
public class StudentComparator implements Comparator<Student>
{

   @Override
   public int compare(final Student o1, final Student o2)
   {
      return o1.getName().compareTo(o2.getName());
   }

}
