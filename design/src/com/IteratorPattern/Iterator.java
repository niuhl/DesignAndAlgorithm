package com.IteratorPattern;

/**
 * Created by niuhonglei on 2017/9/11.
 */
public interface Iterator {
    public Object next();
    public boolean hasNext();
    public boolean remove();
}
