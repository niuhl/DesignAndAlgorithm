package com.StatePattern;

/**
 * 状态模式
 * 优点：结构清晰、遵循设计原则、封装性好
 * 缺点：子类会太多，不好管理
 * 应用场景：行为随状态改变而改变的场景、条件、分支判断的替代者
 * Created by niuhonglei on 2017/9/25.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }
}
