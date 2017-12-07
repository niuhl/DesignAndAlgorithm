package com.DecoratorPattern;

/**
 * Created by niuhonglei on 2017/9/6.
 */
public class ConcreteDecorate2 extends Decorator {
    public ConcreteDecorate2(Component component) {
        super(component);
    }
    private void method2(){
        System.out.println("method2 decorate");
    }
    @Override
    public void operate(){
        super.operate();
        this.method2();
    }
}
