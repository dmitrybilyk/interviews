package com.learn.core.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 07.05.12
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class ComparableTest {
    public static void main(String [] args){

        BookKeeper bookKeeper1 = new BookKeeper(188, "rlex");
        BookKeeper bookKeeper2 = new BookKeeper(1977, "Aalex");
        BookKeeper bookKeeper3 = new BookKeeper(191, "Man");
        BookKeeper bookKeeper4 = new BookKeeper(250, "Man");


        List<BookKeeper> bookKeeperList = new ArrayList<BookKeeper>();
        bookKeeperList.add(bookKeeper1);
        bookKeeperList.add(bookKeeper2);
        bookKeeperList.add(bookKeeper3);
        bookKeeperList.add(bookKeeper4);

        Collections.sort(bookKeeperList);

        for (BookKeeper bookKeeper : bookKeeperList) {
//            System.out.println(bookKeeper.getName());
            System.out.println(bookKeeper.getAge());
        }

//        if(bookKeeper1.compareTo(bookKeeper2)>0){
//            System.out.println("first grater then second");
//        }else if(bookKeeper1.compareTo(bookKeeper2)<0){
//            System.out.println("second grate then first");
//        }else{
//            System.out.println("They are equal!");
//        }

    }
}
