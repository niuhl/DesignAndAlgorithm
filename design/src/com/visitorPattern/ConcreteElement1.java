package com.visitorPattern;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("ConcreteElement1 do");
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
