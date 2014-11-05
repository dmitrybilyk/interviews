package com.learn.core.multithreading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bid on 8/23/14.
 */
public class ImplementingRunnableExample
{
   public static void main(String[] args)
   {
      Thread rentingTheBook = new Thread(new RentingABookByStudentRunnable());
      rentingTheBook.start();
      Thread anotherRentingTheBookThread = new Thread(new RentingABookByStudentRunnable());
      anotherRentingTheBookThread.start();

   }
}

class RentingABookByStudentRunnable implements Runnable{
   private String studentName;
   private int    age;

   RentingABookByStudentRunnable()
   {
   }

   RentingABookByStudentRunnable(final String studentName, final int age)
   {
      this.studentName = studentName;
      this.age = age;
   }

   @Override
   public void run()
   {

      StudentEntity dimaStudent = new StudentEntity("Dima", 33);
      StudentEntity ruslanStudent = new StudentEntity("Ruslan", 37);

      Library library = new Library();

      Book firstBook = new Book("First", 400, library);
      Book secondBook = new Book("Second", 400, library);

      dimaStudent.addABook(firstBook);
      dimaStudent.addABook(secondBook);

      ruslanStudent.addABook(firstBook);

      showStudentsBooks(dimaStudent);
      showStudentsBooks(ruslanStudent);

//      System.out.println("Student " + getStudentName() + " is taking the book!");
      try
      {
         Thread.sleep(10l);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }

   private void showStudentsBooks(final StudentEntity student)
   {
      for (String bookName: student.getRentedBooks() )
      {
         System.out.println(bookName);
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


class Book{
   private String name;
   private Integer pageCount;
   private Library library;

   private boolean isTaken;

   public boolean isTaken()
   {
      return isTaken;
   }

   public void setTaken(final boolean isTaken)
   {
      this.isTaken = isTaken;
   }

   public Book(final String bookName, final int pageCount, Library library)
   {
      this.name = bookName;
      this.pageCount = pageCount;
      this.library = library;
   }

   public String getName()
   {
      return name;
   }

   public void setName(final String name)
   {
      this.name = name;
   }

   public Integer getPageCount()
   {
      return pageCount;
   }

   public void setPageCount(final Integer pageCount)
   {
      this.pageCount = pageCount;
   }

   public void rentABook(String name){
      library.rentABook(name);
   }

   public void giveBookBack(String name){
      library.giveBookBack(name);
   }

}

class Library{
   private Map<String, Book> books = new HashMap<String, Book>();

   public Map<String, Book> getRentedBooks()
   {
      return rentedBooks;
   }

   public void setRentedBooks(final Map<String, Book> rentedBooks)
   {
      this.rentedBooks = rentedBooks;
   }

   private Map<String, Book> rentedBooks = new HashMap<String, Book>();

   LibraryType libraryType = LibraryType.SCHOOL;

   enum LibraryType
   {
      SCHOOL, UNIVERSITY
   }

   Library()
   {
      books.put("First", new Book("FirstBook", 300, this));
      books.put("Second", new Book("SecondBook", 300, this));
      books.put("Third", new Book("ThirdBook", 400, this));
      books.put("Fouth", new Book("FouthBook", 1300, this));
   }

   public Map<String, Book> getBooks()
   {
      return books;
   }

   public void setBooks(final Map<String, Book> books)
   {
      this.books = books;
   }

   public synchronized void rentABook(String name){
//      synchronized (books.get(name)){
         books.get(name).setTaken(true);
      try
      {
         Thread.sleep(3000);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
//         books.remove(name);
//      }
   }

   public void giveBookBack(String name){
//      books.put(name, rentedBooks.get(name));
      books.get(name).setTaken(false);
//      rentedBooks.remove(name);
   }
}



class StudentEntity{
   private String studentName;
   private int    age;

   private List<String> rentedBooks;

   StudentEntity()
   {
   }

   StudentEntity(final String studentName, final int age)
   {
      this.studentName = studentName;
      this.age = age;
      rentedBooks = new ArrayList<String>();
   }


   public void addABook(Book book)
   {
      book.rentABook(book.getName());
      rentedBooks.add(book.getName());
   }

   public void giveBookBack(Book book)
   {
      book.giveBookBack(book.getName());
      rentedBooks.remove(book.getName());
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

   public List<String> getRentedBooks()
   {
      return rentedBooks;
   }

   public void setRentedBooks(final List<String> rentedBooks)
   {
      this.rentedBooks = rentedBooks;
   }
}
