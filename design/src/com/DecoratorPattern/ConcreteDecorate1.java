package com.DecoratorPattern;

/**
 * Created by niuhonglei on 2017/9/6.
 */
public class ConcreteDecorate1 extends Decorator {
    public ConcreteDecorate1(Component component) {
        super(component);
    }
    private void method1(){
        System.out.println("method1 decorate");
    }
    @Override
    public void operate(){
        this.method1();
        super.operate();
    }
}
