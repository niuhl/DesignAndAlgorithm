package com.abstractFactoryPattern;

/**
 * Created by niuhonglei on 2017/8/4.
 */
public class Creator1 extends AbstactCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
