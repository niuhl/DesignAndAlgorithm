package com.StatePattern;

/**
 * Created by niuhonglei on 2017/9/25.
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.getCurrentState().handle1();
    }

    @Override
    public void handle2() {

    }
}
