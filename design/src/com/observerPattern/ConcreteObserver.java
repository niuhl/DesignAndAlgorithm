package com.observerPattern;

/**
 * Created by niuhonglei on 2017/9/12.
 */
public class ConcreteObserver implements Observer{

    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理！");
    }
}
