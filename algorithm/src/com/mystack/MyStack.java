package com.mystack;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public class MyStack<E> implements IStack {
    private Object[] data = null;
    private int top;
    private int maxSize = 0;

    MyStack() {
        this(10);
    }

    public MyStack(int initSize) {
        if (initSize >= 0) {
            this.data = new Object[initSize];
            this.maxSize = initSize;
            this.top = -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isMax() {
        return top >= maxSize - 1;
    }

    @Override
    public boolean push(Object o) {
        if (isMax()) {
            return false;
        }
        top++;
        data[top] = o;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E e = (E) data[top];
        top--;
        return e;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) data[top];
    }

    @Override
    public int getIndex(Object o) {
        int index = -1;
        if (isEmpty()) {
            throw new RuntimeException("未匹配到元素");
        }
        for (int i = 0; i < data.length; i++) {
            if (data.equals(o)) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException("未匹配到元素");
        } else {
            return index;
        }
    }

    @Override
    public int size() {
        return data.length;
    }
}
