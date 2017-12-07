package com.BuilderPattern;

/**
 * Created by niuhonglei on 2017/8/9.
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
