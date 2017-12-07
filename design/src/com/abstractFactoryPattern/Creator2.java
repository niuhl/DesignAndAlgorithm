package com.abstractFactoryPattern;

/**
 * Created by niuhonglei on 2017/8/4.
 */
public class Creator2 extends AbstactCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
