package com.learn.core.multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bid on 8/23/14.
 */
public class ExtendingThreadExample
{
   public static void main(String[] args)
   {
      for (int i = 0; i < 10; i++){
         Student studentThread = new Student("Dima", 33);
         studentThread.start();
         Student studentThread2 = new Student("Ruslan", 37);
         studentThread2.start();
      }
   }
}

class Student extends Thread{
   private String studentName;
   private int    age;

   private List<String> rentedBooks;

   Student(final String studentName, final int age)
   {
      this.studentName = studentName;
      this.age = age;
      rentedBooks = new ArrayList<String>();
   }

   public void addABook(Book book){
      book.rentABook(book.getName());
      rentedBooks.add(book.getName());
   }

   public void giveBookBack(Book book){
      book.giveBookBack(book.getName());
      rentedBooks.remove(book.getName());
   }

   @Override
   public void run()
   {
      System.out.println("Student " + getStudentName() + " is taking the book!");
      try
      {
         Thread.sleep(10l);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }

   public String getStudentName()
   {
      return studentName;
   }

   public void setStudentName(final String studentName)
   {
      this.studentName = studentName;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(final int age)
   {
      this.age = age;
   }
}
