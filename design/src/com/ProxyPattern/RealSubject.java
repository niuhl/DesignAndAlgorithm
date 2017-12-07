package com.ProxyPattern;

/**
 * Created by niuhonglei on 2017/8/9.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("我是真实类");
    }
}
