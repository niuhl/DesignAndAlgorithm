package com.commandParttern;

/**
 * 优点：类间解耦、可扩展性、与其他模式结合更优秀。
 * 缺点：Command的实现类容易膨胀
 * 使用场景：如GUI开发中的一个按钮就是一个命令
 * Created by niuhonglei on 2017/8/22.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
