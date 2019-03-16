package com.learn.core.collections.Collection.List.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bid on 8/21/14.
 */
@SuppressWarnings("unchecked")
public class Comparison
{
   private static int sizeOfList = 3000000;
   public static void main(String[] args)
   {
      List<String> arrayList  = new ArrayList<String>();
      List<String> linkedList = new LinkedList<String>();
      fillTheLists(arrayList, linkedList);

      System.out.println(checkTheInsertToBegin(arrayList));
      System.out.println(checkTheInsertToBegin(linkedList));

   }

   private static void fillTheLists(List<String>... lists)
   {
      for (List<String> list : lists)
      {
         for (int i=0; i<sizeOfList; i++)
         {
            list.add("SomeValue" + "+" + i);
         }
      }
   }


   private static String checkTheInsertToBegin(List<String> list){
      Date startLinked = new Date();
//      list.add(0, "SomeAddedToBeginingValue");
      list.remove("SomeValue1");
      Date finishLinked = new Date();
      long itTook = finishLinked.getTime() - startLinked.getTime();

      return list.getClass().getCanonicalName() + ", Insert to begin " + itTook;
   }

}
