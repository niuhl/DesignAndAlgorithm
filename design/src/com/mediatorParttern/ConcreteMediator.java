package com.mediatorParttern;

/**
 * Created by niuhonglei on 2017/8/14.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.conreteColleague1.selfMethod1();
        super.conreteColleague2.selfMethod1();
    }

    @Override
    public void doSomething2() {
        super.conreteColleague1.selfMethod1();
        super.conreteColleague2.selfMethod1();
    }
}
