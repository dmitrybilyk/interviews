package com.learn.core.generics.toUnderstand.wildcards;

import com.learn.core.generics.toUnderstand.model.Apple;
import com.learn.core.generics.toUnderstand.model.Fruit;
import com.learn.core.generics.toUnderstand.model.FujiApple;
import com.learn.core.generics.toUnderstand.model.Strawberry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 10/24/14.
 */

//As we’ve seen in the previous part of this post, the subtyping relation
// of generic types is invariant. Sometimes, though, we’d like to use
// generic types in the same way we can use ordinary types:

//        Narrowing a reference (covariance)
//        Widening a reference (contravariance)
public class Wildcards {

//        Covariance
//        Let’s suppose, for example, that we’ve got a set of boxes, each one
//        of a different kind of fruit. We’d like to be able to write methods
//        that could accept a any of them. More formally, given a subtype A of
//        a type B, we’d like to find a way to use a reference (or a method parameter)
//        of type C<B> that could accept instances of C<A>.
//
//        To accomplish this task we can use a wildcard with extends, such as in the
//        following example:
//
//        List<Apple> apples = new ArrayList<Apple>();
//        List<? extends Fruit> fruits = apples;

//  ? extends reintroduces covariant subtyping for generics types: Apple is a
// subtype of Fruit and List<Apple> is a subtype of List<? extends Fruit>.




//  Contravariance

//  Let’s now introduce another wildcard: ? super. Given a supertype B of a type A,
//  then C<B> is a subtype of C<? super A>:

//  List<Fruit> fruits = new ArrayList<Fruit>();
//  List<? super Apple> = fruits;


//  How Can Wildcards Be Used?

//  Enough theory for now: how can we take advantage of these new constructs?

//  ? extends

//  Let’s go back to the example we used in Part II when introducing
// Java array covariance:

//  Apple[] apples = new Apple[1];
//  Fruit[] fruits = apples;
//  fruits[0] = new Strawberry();

//  As we saw, this code compiles but results in a runtime exception when
// trying to add a Strawberry to an Apple array through a reference to a
// Fruit array.

//  Now we can use wildcards to translate this code to its generic counterpart:
// since Apple is a subtype of Fruit, we will use the ? extends wildcard to be
// able to assign a reference of a List<Apple> to a reference of a
// List<? extends Fruit> :

  public void testExtends() {
//    List<Apple> apples = new ArrayList<Apple>();
//    List<? extends Fruit> fruits = apples;
//    fruits.add(new Strawberry());
  }
//    This time, the code won’t compile! The Java compiler now prevents us to
// add a strawberry to a list of fruits. We will detect the error at compile
// time and we won’t even need any runtime check (such as in the case of
// array stores) to ensure that we’re adding to the list a compatible type.
// The code won’t compile even if we try to add a Fruit instance into the list:

//    List<Apple> apples = new ArrayList<Apple>();
//    List<? extends Fruit> fruits = apples;
//    fruits.add(new Apple());

//    No way. It comes out that, indeed, you can’t put anything into a structure
// whose type uses the ? extends wildcard.


//    The reason is pretty simple, if we think about it: the ? extends T wildcard
// tells the compiler that we’re dealing with a subtype of the type T, but we
// cannot know which one. Since there’s no way to tell, and we need to guarantee
// type safety, you won’t be allowed to put anything inside such a structure.
// On the other hand, since we know that whichever type it might be, it will
// be a subtype of T, we can get data out of the structure with the guarantee
// that it will be a T instance:

//    Fruit get = fruits.get(0);


//    ? super

//    What’s the behavior of a type that’s using the ? super wildcard? Let’s
// start with this:

    public void superUsage(){
      List<? super Apple> fruits = new ArrayList<Fruit>();

//      List<? super Apple> = fruits;
//      We know that fruits is a reference to a List of something that is a
// supertype of Apple. Again, we cannot know which supertype it is, but
// we know that Apple and any of its subtypes will be assignment compatible
// with it. Indeed, since such an unknown type will be both an Apple and a
// GreenApple supertype, we can write:
//      fruits.add(new Apple());
//      fruits.add(new FujiApple());

//      If we try to add whichever Apple supertype, the compiler will complain:

//      fruits.add(new Fruit());
//      fruits.add(new Object());

//      Since we cannot know which supertype it is, we aren’t allowed
// to add instances of any.

//      What about getting data out of such a type? It turns out that you
// the only thing you can get out of it will be Object instances: since we
// cannot know which supertype it is, the compiler can only guarantee that
// it will be a reference to an Object, since Object is the supertype of
// any Java type.
    }


//  The Get and Put Principle or the PECS Rule

//  Use the ? extends wildcard if you need to retrieve object from a data structure
//  Use the ? super wildcard if you need to put objects in a data structure
//  If you need to do both things, don’t use any wildcard.

//  Bloch’s mnemonic, PECS, comes from “Producer Extends, Consumer Super”
// and is probably easier to remember and use.



}
