package com.visitorPattern;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class Visitor implements Ivisitor {
    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
}
