package com.singletonParttern;

/**
 * 单例模式就是确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 关键点：构造器私有化
 * 使用场景：
 * 1、要求生成唯一序列号的环境
 * 2、创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源
 * 3、需要定义大量的静态常量和静态方法（如工具类）的环境
 * Created by niuhonglei on 2017/8/1.
 */
public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return SINGLETON;
    }

    public static void doSomething() {

    }
}
