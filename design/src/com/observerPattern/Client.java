package com.observerPattern;

/**
 * 观察者模式
 * 优点：观察者和被观察者之间是抽象耦合、建立一套触发机制
 * 缺点：开发效率和运行效率比较差
 * 注意事项：广播链问题、异步处理问题
 * Created by niuhonglei on 2017/9/12.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        concreteSubject.addObserver(obs);
        concreteSubject.doSomething();
    }
}
