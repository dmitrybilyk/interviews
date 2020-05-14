package com.learn.web.gwt.client.sap;

import java.util.Iterator;

public class MappingIterator<S, T> implements Iterator<T> {
    private final Iterator<S> iterator;
    private final MapFunction<S, T> mapper;
    
    public static interface MapFunction<S, T> {
        T map(S s);
    }

    public MappingIterator(Iterator<S> iterator, MapFunction<S, T> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return mapper.map(iterator.next());
    }

    @Override
    public void remove() {
        iterator.remove();
    }

}
