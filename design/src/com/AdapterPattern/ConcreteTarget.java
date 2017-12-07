package com.AdapterPattern;

/**
 * 目标角色实现类
 * Created by niuhonglei on 2017/9/8.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,plase call me!");
    }
}
