package com.Strategy;

/**
 * Created by niuhonglei on 2017/9/7.
 */
public class Context {
    private Strategy strategy = null;
    public Context(Strategy _strategy){
        this.strategy=_strategy;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}
