package com.ProxyPattern.dynamicPattern;

/**
 * Created by niuhonglei on 2017/8/10.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知");
    }
}
