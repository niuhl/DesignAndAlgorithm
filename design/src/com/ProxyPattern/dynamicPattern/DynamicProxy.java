package com.ProxyPattern.dynamicPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * Created by niuhonglei on 2017/8/10.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler){
        //寻找Joinpoint连接点，AOP框架使用的是远数据定义
        if(true){
            (new BeforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
