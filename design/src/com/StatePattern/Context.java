package com.StatePattern;

/**
 * 把对象声明为静态常量，有几个状态对象就声明几个静态常量
 * 环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方
 * Created by niuhonglei on 2017/9/25.
 */
public class Context {
    public final static ConcreteState1 STATE1 = new ConcreteState1();
    public final static ConcreteState2 STATE2 = new ConcreteState2();
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }
    public void handle1(){
        this.currentState.handle1();
    }
    public void handle2(){
        this.currentState.handle1();
    }
}
