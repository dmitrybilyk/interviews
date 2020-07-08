package com.learn.patterns.behavioral.command.lambdaexample;

public class Document {
   private StringBuffer document= new StringBuffer("test"); 
            
   public void addStringBefore(String str){                        
      document= new StringBuffer(str).append(document);            
   } 
   public void insertString(String str, int position){                
      document.insert(position, str);            
   } 
   public void addStringAfter(String str){                        
      document.append(str);            
   } 
   public void output(String str){                        
      System.out.println("Operation [ "+ str + " ]: result = "+ document.toString()); 
   } 
} 