package com.learn.core.generics.toUnderstand.genericclassesandinterfaces;

/**
 * Created by dik81 on 10/24/14.
 */

//A class or an interface is generic if it has one or more type variable.
//        Type variable are delimited by angle brackets and follow the class
//(or the interface) name:

//public interface List<T> extends Collection<T> {
//          ...
//}

//Roughly speaking, type variables act as parameters and provide the information
//        the compiler needs to make its checks.

//The type variable is the parameter that the compiler uses when automatically
//        casting the result of the get method to an Apple reference.
public class GenericInterfaces {
}

//        T get(int index);
//The method get returns indeed an object of type T, where T is the type variable
// specified in the List<T> declaration.
