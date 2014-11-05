package com.learn.core.generics.toUnderstand.multipletypevariables;

/**
 * Created by dik81 on 10/25/14.
 */
public class MultipleTypeVariables {


//  Let’s suppose you want to relax the recursive bound we put on the
// last version of the squeeze method. Let’s then suppose that a type T
// might extend Juicy<S> although T itself does not extends S. The method
// signature could be:

//  <T extends Juicy<S>, S> List<Juice<S>> squeezeSuperExtendsWithFruit(List<? extends T>


//  This signature has pretty much equivalent to the previous one
// (since we’re only using T in the method arguments) but has got
// one slight advantage: since we’ve declared the generic type S,
// the method can return List<Juice<S> instead of List<? super T>,
// which can be useful in some situations, since the compiler will
// help you identify which type S is according to the method arguments
// you’ve passed. Since you’re returning a list, chances are you want
// your caller to be able to get something from it and, as you’ve
// learned in the previous part, you can only get Object instances
// from a list such as List<? super T>.

//  You can obviously add more bounds to S, if you need them, such as:

//  <T extends Juicy<S>, S extends Fruit> List<Juice<S>> squeezeSuperExtendsWithFruit(List<? extends T> fruits);
}
