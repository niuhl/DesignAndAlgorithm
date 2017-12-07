package com.abstractFactoryPattern;

/**
 * 定义：为创建一组相关或互相依赖的对象提供一个接口，而且无需指定它们的具体类
 * 优点：封装性，每个产品的实现类不是高层模块要关心的。产品族内的约束为非公开状态
 * 缺点：产品族扩展非常困难，严重违反开笔原则（对扩展开发，对修改关闭）（横向扩展容易，纵向扩展困难）
 * 使用场景：对象有相同的约束条件，例如一个文本编辑器和一个图片处理器都是软件，但是在linux和Windows下的文本编辑器和图片处理器
 * 功能和页面相同，但是实现确实不同的。
 * Created by niuhonglei on 2017/8/4.
 */
public class Client {
    public static void main(String[] args) {
        AbstactCreator creator1 = new Creator1();
        AbstactCreator creator2 = new Creator2();
        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductB productB1 = creator1.createProductB();
        AbstractProductA productA2 = creator2.createProductA();
        AbstractProductB productB2 = creator2.createProductB();
        productA1.doSomething();
        productA2.doSomething();

    }
}
