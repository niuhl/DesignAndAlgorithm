package com.ProxyPattern.dynamicPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * Created by niuhonglei on 2017/8/10.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;
    public MyInvocationHandler(Object _obj){
        this.target = _obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
