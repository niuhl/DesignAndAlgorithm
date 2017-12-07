package com.StatePattern;

/**
 * Created by niuhonglei on 2017/9/25.
 */
public class ConcreteState1  extends State {
    @Override
    public void handle1() {

    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.getCurrentState().handle2();
    }
}
