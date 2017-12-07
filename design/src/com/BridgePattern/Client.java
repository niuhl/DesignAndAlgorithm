package com.BridgePattern;

/**
 * 桥梁模式
 * 优点：抽象和实现分离、优秀的扩展能力、实现细节对客户透明、
 * 使用场景：不希望或者不适用使用继承的场景
 *           接口或者抽象类不稳定的场景
 *            重用性要求较高的场景
 * Created by niuhonglei on 2017/9/27.
 */
public class Client {
    public static void main(String[] args) {
        Implementor imp = new ConcreteImplementor1();
        Abstraction abstraction = new RefinedAbstaction(imp);
        abstraction.request();
    }
}
