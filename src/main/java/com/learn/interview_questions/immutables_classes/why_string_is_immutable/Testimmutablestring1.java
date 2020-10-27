package com.learn.interview_questions.immutables_classes.why_string_is_immutable;

class Testimmutablestring1{
 public static void main(String args[]){
   String s="Sachin";
   s.concat(" Tendulkar");//concat() method appends the string at the end
   System.out.println(s);//will print Sachin because strings are immutable objects
 }  
}  