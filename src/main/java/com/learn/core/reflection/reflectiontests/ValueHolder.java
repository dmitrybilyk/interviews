package com.learn.core.reflection.reflectiontests;

import java.io.Serializable;

/**
 * Statically typed ValueHolder to work around GWT serialization limitations.
 * GWT cannot serialize Object and doesn't allow reflection nor overloaded setters.
 */
public interface ValueHolder<T> extends Serializable {
  public T getValue();
}

