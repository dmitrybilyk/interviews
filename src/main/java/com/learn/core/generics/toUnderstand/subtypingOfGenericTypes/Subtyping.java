package com.learn.core.generics.toUnderstand.subtypingOfGenericTypes;

import com.learn.core.generics.toUnderstand.model.Apple;
import com.learn.core.generics.toUnderstand.model.Fruit;

/**
 * Created by dik81 on 10/24/14.
 */

//If a reference of an Apple instance can be assigned to a reference of a
//        Fruit, as seen above, then what’s the relation between, let’s say,
//        a List<Apple> and a List<Fruit>? Which one is a subtype of which?
//        More generally, if a type A is a subtype of a type B, how does C<A>
//and C<B> relate themselves?
//Surprisingly, the answer is: in no way. In more formal words, the subtyping
//        relation between generic types is invariant.
public class Subtyping {


//  this code is invalid
//  List<Apple> apples = ...;
//  List<Fruit> fruits = apples;

//  and this as well
//  List<Apple> apples;
//  List<Fruit> fruits = ...;
//  apples = fruits;

//  The box of fruits could be really a box of apples or a box of strawberries
//  but we havn't to be able to mix apples and strawberries together. It should be
//  forbidden.


//  List vs Array

//  The strongest reason for a Java developer to be surprised is the inconsistency
//  between the behavior of arrays and generic types. While the subtyping relations
//  of the latter is invariant, the subtyping relation of the former is covariant:
//          if a type A is a subtype of type B, then A[] is a subtype of B[]:

  public void covariantArrays(){
    Apple[] apples = {new Apple(), new Apple()};
    Fruit[] fruits = apples;
  }

//  But wait! If we repeat the argument exposed in the previous section, we might
//  end up adding strawberries to an array of apples:

//  Apple[] apples = new Apple[1];
//  Fruit[] fruits = apples;
//  fruits[0] = new Strawberry();

//  The code indeed compiles, but the error will be raised at runtime as an
// ArrayStoreException.

//  Once more, generics are safer to use and “correct” this type safety
// weakness of Java arrays.

//  if it was invariant, there would be no way of passing a reference to an
// array of objects of an unknown type (without copying every time to an
// Object[]) to a method such as:

//  void sort(Object[] o);



}
