package com.IteratorPattern;

/**
 * Created by niuhonglei on 2017/9/11.
 */
public interface Aggregate {
    public void add(Object object);
    public void remove(Object object);
    public Iterator iterator();
}
