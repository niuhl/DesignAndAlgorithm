package com.AdapterPattern;

/**
 * 优点:可以让两个没有任何关系的类在一起运行
 *  增加了类的透明性
 *  提高了类的复用性
 *  灵活性非常好
 * 适用场景
 *  你有动机修改一个已经投入生产的接口时，适配器模式可能是最适合你的模式。
 * 注意事项：
 *  在详细设计阶段不要考虑是适配器。项目一定要遵守依赖倒置原则和里氏替换原则。
 * Created by niuhonglei on 2017/9/8.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
