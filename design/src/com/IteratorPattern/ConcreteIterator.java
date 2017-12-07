package com.IteratorPattern;

import java.util.Vector;

/**
 * Created by niuhonglei on 2017/9/11.
 */
public class ConcreteIterator implements Iterator{
    private Vector vector = new Vector();
    public int cursor = 0;

    public ConcreteIterator(Vector vector){
        this.vector = vector;
    }
    public Object next(){
        Object o = null;
        if(this.hasNext()){
            o = this.vector.get(cursor++);
        }else {
            o = null;
        }
        return o;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
