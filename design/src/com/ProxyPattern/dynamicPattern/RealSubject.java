package com.ProxyPattern.dynamicPattern;

/**
 * Created by niuhonglei on 2017/8/10.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("我是真实类哦");
    }
}
