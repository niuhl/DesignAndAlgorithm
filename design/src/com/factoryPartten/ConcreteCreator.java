package com.factoryPartten;

/**
 * Created by niuhonglei on 2017/8/3.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> tClass) {
        Product product = null;
        try {
            product = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return (T)product;
    }
}
