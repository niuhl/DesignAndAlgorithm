package com.visitorPattern;

/**
 * 访问者模式
 * 优点：符合单一职责原则、 优秀的扩展性、灵活性非常高
 * 缺点：具体元素对访问者公布细节、具体元素变更比较困难、违背了依赖倒置原则
 * 使用场景：
 * 1、一个对象姐哦股包含很多类对象，他们有不同的接口，而你想对这些对象实施一些依赖
 * 于其具体类的操作
 * 2、需要对一个对象结构中的对象就行很多不同并且不相关的操作，而你想避免让这些操作
 * "污染"这些对象的类。
 * Created by niuhonglei on 2017/9/14.
 */
public class Client {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Element element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
