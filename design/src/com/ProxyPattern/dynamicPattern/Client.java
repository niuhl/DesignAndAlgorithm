package com.ProxyPattern.dynamicPattern;


import java.lang.reflect.InvocationHandler;

/**
 * Created by niuhonglei on 2017/8/10.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.doSomething("finsh");
    }

}
