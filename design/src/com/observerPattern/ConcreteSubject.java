package com.observerPattern;

/**
 * Created by niuhonglei on 2017/9/12.
 */
public class ConcreteSubject extends Subject {
    public void doSomething(){
        super.notifyObservers();
    }
}
