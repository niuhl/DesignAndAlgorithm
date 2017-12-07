package com.facadePattern;

/**
 * 门面模式:
 * 优点:减少系统的相互依赖、提供灵活性、提供安全性
 * 缺点：不符合开闭原则，对修改关闭、对扩展开放
 * Created by niuhonglei on 2017/9/13.
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    public void methodA(){
        this.a.doSomethingA();
    }
    public void methodB(){
        this.b.doSomethingB();
    }
    public void methodC(){
        this.c.doSomethingC();
    }
}
