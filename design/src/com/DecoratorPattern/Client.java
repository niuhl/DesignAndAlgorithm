package com.DecoratorPattern;

/**
 * 优点：
 * 装饰类和被装饰类可以独立发展，而不会相互耦合
 * 装饰模式是继承关系的一个替代方案
 * 装饰模式可以动态的扩展一个实现类的功能
 * 缺点：
 * 多层的装饰是比较复杂的
 * 使用场景：需要扩展一个类的功能，或者给类添加附加功能
 * 需要动态的给一个对象添加功能，这些功能可以动态的撤销
 * 需要为一批兄弟类进行改装或者加装新功能
 * Created by niuhonglei on 2017/9/6.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorate1(component);
        component = new ConcreteDecorate2(component);
        component.operate();

    }
}
