package com.factoryPartten;

/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到子类。
 * 优点：良好的封装性，代码结构清晰，易扩展。
 * 屏蔽产品类，产品类的实现如何变化，调用者都不需要关心。
 * 案例：JDBC链接数据库。
 * Created by niuhonglei on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method1();
    }
}
