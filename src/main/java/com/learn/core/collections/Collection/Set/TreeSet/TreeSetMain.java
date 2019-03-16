package com.learn.core.collections.Collection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bid on 8/21/14.
 */

//TreeSet keep natural order in collection of it's objects
//Object has to implement Comparable. Or we have to pass Comparator object instead
public class TreeSetMain
{
   public static void main(String[] args)
   {
      Set<String> treeSet = new TreeSet<String>();
      treeSet.add("First");
      treeSet.add("A");
      treeSet.add("Z");

      for (String s : treeSet)
      {
         System.out.println(s);
      }


      System.out.println("--------------------------------------------------------------------------");

      Set<Student> students = new TreeSet<Student>();
      Student student = new Student();
      student.setName("Dima");
      Student student2 = new Student();
      student2.setName("Armin");
      Student student3 = new Student();
      student3.setName("Zekko");

      students.add(student);
      students.add(student2);
      students.add(student3);

      for (Student student1 : students)
      {
         System.out.println(student1.getName());
      }

   }
}

