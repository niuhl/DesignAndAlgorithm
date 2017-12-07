package com.AdapterPattern;

/**
 * Created by niuhonglei on 2017/9/8.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
