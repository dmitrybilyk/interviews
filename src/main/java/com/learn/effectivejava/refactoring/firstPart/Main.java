package com.learn.effectivejava.refactoring.firstPart;

import java.io.*;

/**
 * Created by dmitry on 20.05.14.
 */
public class Main {
    public static void main(String[] args) {
        Movie dragonMovie = new Movie("Dragon", Movie.REGULAR);
//        dragonMovie.setPriceCode(Movie.REGULAR);
        Movie castleMovie = new Movie("Castle", Movie.CHILDRENS);
//        castleMovie.setPriceCode(Movie.CHILDRENS);
        Movie dragon2Movie = new Movie("Dragon2", Movie.NEW_RELEASE);
//        dragon2Movie.setPriceCode(Movie.NEW_RELEASE);

        Rental rental = new Rental(dragonMovie, 2);
        Rental rental2 = new Rental(dragon2Movie, 3);

        Customer customer = new Customer("Me");
        customer.addRental(rental);
        customer.addRental(rental2);

//        File file = new File("/home/dmitry/dev/projects/totalmavenproject/src/main/java/com/learn/refactoring/firstPart/testFile.txt");
        File file = new File("/home/dmitry/dev/projects/totalmavenproject/src/main/java/com/learn/refactoring/firstPart/testFileHtml.txt");
        StringBuilder sb = new StringBuilder();
        String sCurrentLine;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((sCurrentLine = br.readLine()) != null){
                    sb.append(sCurrentLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(customer.htmlStatement());
//        System.out.println(customer.statement().replaceAll("(\n)", "").equals(sb.toString()));
        System.out.println(customer.htmlStatement().replaceAll("(\n)", "").equals(sb.toString()));
    }
}
