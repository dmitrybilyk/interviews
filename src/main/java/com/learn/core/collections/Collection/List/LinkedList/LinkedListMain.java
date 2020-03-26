package com.learn.core.collections.Collection.List.LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * Created by bid on 8/21/14.
 */
public class LinkedListMain
{
   public static void main(String[] args)
   {
      List<String> list = new LinkedList<String>();
      list.add("0");
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");
      list.add("5");
      list.add("6");
      list.add("7");


      //LinkedList is a bidirectional list. So every item (node) has a reference to the next and
      //previous element.
      list.add(3, "addedToTheMiddle");
      list.add("added");


      //When we remove by value, the first found element with this value will be removed
      list.remove("4");
      list.get(5);
      list.remove(3);


      //To remove or add element by index or value it will take O(n) time.
      //But using ListIterator it will take O(1) time. Less time

      Iterator iterator = list.listIterator();
      while (iterator.hasNext()){
         String in = (String) iterator.next();
         if(in.equals("5")){
            iterator.remove();
         }
      }

      Set<SomeClass> someClasses = new HashSet<>();
      SomeClass e = new SomeClass();
      e.setName("1");
      SomeClass e2 = new SomeClass();
      e2.setName("2");
      someClasses.add(e);
      someClasses.add(e2);

      for (SomeClass someClass : someClasses) {
         System.out.println(someClass.getName());
      }


   }

   static class SomeClass {
      private String name;

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      @Override
      public boolean equals(Object obj) {
         return true;
      }

      @Override
      public int hashCode() {
         return 1;
      }
   }

}
