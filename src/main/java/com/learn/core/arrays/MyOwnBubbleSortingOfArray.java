package com.learn.core.arrays;

/**
 * Created by bid on 8/21/14.
 */
public class MyOwnBubbleSortingOfArray
{
   public static void main(String[] args)
   {
      int[] array = {1, 2, 4, 2, 3, 1,7};
      sortAndPrintArray(array);
   }

   private static void sortAndPrintArray(final int[] array)
   {
      for (int i = array.length - 1; i > 0; i--)
      {
         boolean sorted = true;
         for (int j = 0; j < i; j++) {

            if (array[j] > array[j+1]) {
               int temp = array[j+1];
               array[j+1] = array[j];
               array[j] = temp;
               sorted = false;
            }
         }

         if (sorted) {
            break;
         }
      }

      for (int i : array)
      {
         System.out.println(i);
      }
   }
}
