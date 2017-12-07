package com.TemplatcMethodPattern;

/**
 * 具体模版类
 * Created by niuhonglei on 2017/8/4.
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass2 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass2 doAnything");
    }
}
