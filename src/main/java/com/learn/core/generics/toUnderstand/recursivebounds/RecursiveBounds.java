package com.learn.core.generics.toUnderstand.recursivebounds;

/**
 * Created by dik81 on 10/25/14.
 */

//Maybe you feel like relaxing the T extends Juicy<? super T> bound.
// This kind of bound is called recursive bound because the bound that
// the type T must satisfy depends on T. You can use recursive bounds
// when needed and also mix-and-match them with other kinds of bounds.

public class RecursiveBounds {

//  Thus you can, for example, write generic methods with such bounds:

//  <A extends B<A,C>, C extends D<T>>

//  Please remember that these examples are only given to illustrate
// what generics can do. Bounds you’re going to use always depend on
// the constraints you’re putting into your type hierarchy.

}
