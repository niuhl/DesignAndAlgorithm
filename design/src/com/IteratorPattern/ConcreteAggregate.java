package com.IteratorPattern;

import java.util.Vector;

/**
 * Created by niuhonglei on 2017/9/11.
 */
public class ConcreteAggregate implements Aggregate {
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
