package com.learn.core.generics.tutorial2;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 10.04.13
 * Time: 22:19
 * To change this template use File | Settings | File Templates.
 */
public class GenericMethodTest
{
    // generic method printArray
    public static < E > void printArray( E[] inputArray )
    {
        // Display array elements
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
    }

    public static void main( String args[] )
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
    }
}
