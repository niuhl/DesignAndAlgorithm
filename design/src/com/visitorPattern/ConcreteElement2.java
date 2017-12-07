package com.visitorPattern;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        System.out.println("ConcreteElement2 do");
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
