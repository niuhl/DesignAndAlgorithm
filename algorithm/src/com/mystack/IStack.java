package com.mystack;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public interface IStack<E> {
    boolean isEmpty();
    boolean isMax();
    boolean push(E e);
    E pop();
    E peek();
    int getIndex(E e);
    int size();
}
