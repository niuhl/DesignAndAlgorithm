package com.factoryPartten;

/**
 * 抽象创建类，抽象工厂类，具体如何创建产品类是由具体实现ConcreteCreator类实现的
 * Created by niuhonglei on 2017/8/3.
 */
public abstract class Creator {
    public abstract <T extends Product> T  createProduct(Class<T> tClass);
}
