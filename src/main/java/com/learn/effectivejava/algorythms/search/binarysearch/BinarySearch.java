package com.learn.effectivejava.algorythms.search.binarysearch;

class BinarySearch
{
  public static void main(String args[])
  {
    int valueToFind = 14;
    int array[] = {1, 3, 5, 11, 13, 14, 15, 16 ,23, 38};
    System.out.println(contains(array, valueToFind));
  }

  public static boolean contains(int[] a, int b) {
    if (a.length == 0) {
      return false;
    }
    int low = 0;
    int high = a.length-1;

    while(low <= high) {
      int middle = (low+high) /2;
      if (b> a[middle]){
        low = middle +1;
      } else if (b< a[middle]){
        high = middle -1;
      } else { // The element has been found
        return true;
      }
    }
    return false;
  }

}