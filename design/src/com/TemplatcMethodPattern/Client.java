package com.TemplatcMethodPattern;

/**
 * 定义：定义一个操作中的算法框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重新
 * 定义该算法的某些特定步骤
 * 优点：1、封装不变的部分，扩展可变的部分
 * 2、提取公共部分代码，便于维护
 * 3、行为由父类控制，子类实现
 * 缺点:代码不易读取
 * 使用场景：1、多个子类有共有的方法，并且逻辑基本相同
 * 2、重复复杂的算法，可以把核心算法设计为模版方法，周边细节由各个子类实现。
 * 3、重构时，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
 * Created by niuhonglei on 2017/8/4.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass1.templateMethod();
        abstractClass2.templateMethod();
    }
}
