package com.BuilderPattern;

/**
 * 优点：封装性、建造者独立、容易扩展、便于控制细节风险
 * 使用场景：相同的方法，不同的执行循序，产生不同的事件结果
 * 多个部件或零件，都可以装配到一个对象当中，但是产生的运行结果又不同时。
 * 产品类非常复杂，或者产品类的调用顺序不同产生了不同的效能。
 * Created by niuhonglei on 2017/8/9.
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
