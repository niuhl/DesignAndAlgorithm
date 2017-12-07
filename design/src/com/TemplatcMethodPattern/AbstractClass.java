package com.TemplatcMethodPattern;

/**
 * 抽象模版类
 * Created by niuhonglei on 2017/8/4.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();
    public void templateMethod(){
        this.doSomething();
        this.doAnything();
    }
}
