package com.BuilderPattern;

/**
 * 抽象建造者，一般是由子类实现。
 * Created by niuhonglei on 2017/8/9.
 */
public abstract class Builder {
    //设置产品的不同部分，已获得不同的产品
    public abstract void setPart();
    public abstract Product buildProduct();

}
