package com.learn.core.multithreading.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG1 {
    public static void main(String[] argv) throws Exception 
    { 
        try { 
  
            // creating object of List<String> 
            List<String> list = new ArrayList<String>();
  
            // populate the list 
            list.add("A"); 
            list.add("B"); 
            list.add("C"); 
            list.add("D"); 
            list.add("E"); 
  
            // printing the Collection 
            System.out.println("List : " + list); 
  
            // create a synchronized list 
            List<String> synlist = Collections
                                       .synchronizedList(list); 
  
            // printing the Collection 
            System.out.println("Synchronized list is : " + synlist); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 
