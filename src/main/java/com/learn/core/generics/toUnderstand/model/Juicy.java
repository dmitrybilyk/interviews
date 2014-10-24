package com.learn.core.generics.toUnderstand.model;

import java.util.List;

public interface Juicy<T> {
//    Juice<T> squeeze();
//  <T> List<Juice<T>> squeeze(List<Juicy<T>> fruits);
//<T extends Juicy<T>> List<Juice<T>> squeeze(List<T> fruits);
<T extends Juicy<? super T>> List<Juice<? super T>> squeeze(List<? extends T> fruits);

}

//This method accepts a list of objects whose type extends Juicy<? super T>,
// that is, in other words, that there must exist a type S such that T extends
// Juicy<S> and S super T.