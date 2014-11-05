package com.learn.core.generics.toUnderstand.wildcardsInMethodSignatures;

/**
 * Created by dik81 on 10/25/14.
 */
public class WildcardsInMethods {

//  As seen in Part II of this series, in Java (as in many other
// typed languages), the Substitution principle stands: a subtype
// can be assigned to a reference of any of its supertypes.

//  In the Fruit class hierarchy we’ve used so far, a function
// that accepts a Fruit as a parameter will accept any of its subtypes
// (such as Apple or Strawberry).
//As seen in the previous post, wildcards restore covariant and contravariant
// subtyping for generic types: using wildcards, then, let the developer write
// functions that can take advantage of the benefits presented so far.

//  If, for example, a developer wanted to define a method eat that
// accepted a List of whichever fruit, it could use the following signature:

//  void eat(List<? extends Fruit> fruits);

//  Since a List of whichever subtype of the class Fruit is a subtype
// of List<? extends Fruit>, the previous method will accept any such
// list as a parameter. Note that, as explained in the previous section,
// the Get and Put Principle (or the PECS Rule) will allow you to retrieve
// objects from such list and assign them to a Fruit reference.

//  On the other hand, if you wanted to put instances on the list passed as
// a parameter, you should use the ? super wildcard:

//  void store(List<? super Fruit> container);

//  This way, a List of whichever supertype of Fruit could be passed in
// to the store function and you could safely put whichever Fruit subtype into it.

}
