package com.learn.core.generics.toUnderstand.boundedTypeVariables;

/**
 * Created by dik81 on 10/25/14.
 */
public class BoundedTypeVariables {

//  The flexibility of generics is greater than this, though. Type
// variables can be bounded, pretty much in the same way wildcards can be
// (as we’ve seen in Part II). However, type variables cannot be bounded
// with super, but only with extends. Look at the following signature:

//  public static <T extends I<T>> void name(Collection<T> t);

//  Let’s suppose some, but not all, fruits in your hierarchy can be juicy.
//Juicy fruits will implement this interface and publish the squeeze method.

//<T> List<Juice<T>> squeeze(List<Juicy<T>> fruits);

//  So far, so good. But limited. We could use the very same arguments
// used in the same posts and discover that the squeeze method is not
// going to work, for example, with a list of red oranges when:

//  class Orange extends Fruit implements Juicy<Orange>;
//  class RedOrange extends Orange;

//  Since we’ve already learned about the PECS principle, we’re going to
// change the method with:

//  <T extends Juicy<? super T>> List<Juice<? super T>>
// squeezeSuperExtends(List<? extends T> fruits);
//  This method accepts a list of objects whose type extends Juicy<? super T>,
// that is, in other words, that there must exist a type S such that T extends
// Juicy<S> and S super T.

//  Since we’ve already learned about the PECS principle, we’re going to
// change the method with:

//<T extends Juicy<? super T>> List<Juice<? super T>> squeezeSuperExtends(List<? extends T> fruits);

}
