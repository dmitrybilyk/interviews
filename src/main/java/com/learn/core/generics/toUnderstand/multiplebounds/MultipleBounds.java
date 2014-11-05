package com.learn.core.generics.toUnderstand.multiplebounds;

/**
 * Created by dik81 on 10/25/14.
 */
public class MultipleBounds {

//  What if you want to apply multiple bounds on the same type variable?
// It turns out that you can only write a bound per generic type variable.
// The following bounds are thus illegal:

}

//T extends A, T extends B> // illegal

//Multiple bounds must be expressed with a different syntax, which turns out
// to be a pretty familiar notation:

//<T extends A & B>
//The previous bounds means that T extends both A and B. Please take into account that, according to the Java Language Secification, Chapter 4.4, states that a bound is either:

//        A type variable.
//        A class.
//        An interface type followed by further interface types.

//This means that multiple bounds can only be expressed using interface types.
// There’s no way of using type variables in a multiple bound and the compiler
// will fail with a message such as:

//        A type variable may not be followed by other bounds.

//        This is not always clear in the documentation I’ve read.

