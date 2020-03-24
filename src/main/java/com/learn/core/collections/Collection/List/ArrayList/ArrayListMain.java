package com.learn.core.collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bid on 8/21/14.
 */
public class ArrayListMain
{
   public static void main(String[] args)
   {

      List<String> stringList = new ArrayList<>();
      stringList.add("dfd");

      Set<String> set = new HashSet<>();
      set.add("Diii");

      String[] elements = new String[7];
//      elements[0] = 4;

      List<String> arrayList = new ArrayList<>(set);


      List<String> list = new ArrayList<String>(3);
      //after creating the object of ArrayList it has variable 'size' and
      //'elementData array of type E (generic)

      //When element is added firstly ensureCapacity method is called.
      //And then new array is created and System.arrayCopy() is called
      //If capacity is not enough it will be increased using the next formula
      // (oldCapacity * 3) / 2 + 1


      list.add("First");
      list.add("SomeElement");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("First");
      list.add("Second");
      //if we add an element in the middle of the list, System.arrayCopy(...) will be
      //called twice: in ensure capacity and in add method
      list.add(7, "Third");
      list.add("Third");
      list.add("Third");

      //If we want to add another collection to current, it'd better to use addAll(index, collection)
      //method instead of using for cycle and adding elements one by one.
      //System.arrayCopy(...) will be called 3 times, but it's less then if adding one by one.

      //when we remove by index firstly check of number elements needed to be copied happen.
      //Then System.arrayCopy(...) is called and we forget about the last element. GC does it's work
      list.remove(5);

      //If we remove by value then iteration is happening and the first found element will be removed.
      list.remove("First");


//      Conclusions: Arraylist is slow when we want to add or remove elements in the middle of it
      //Quick search because search occurs in  lining time: by index - O(1), by value - O(n)

   }
}
