package com.Strategy;

/**
 * 抽象策略角色
 * Created by niuhonglei on 2017/9/7.
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略1执行");
    }
}
