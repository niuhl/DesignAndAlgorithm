package com.visitorPattern;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void doSomething();
    public abstract void accept(Ivisitor ivisitor);
}
