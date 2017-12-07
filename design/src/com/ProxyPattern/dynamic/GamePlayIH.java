package com.ProxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理是根据被代理的接口生成所有的方法，也就是说给定一个接口，动态代理会宣称"我已经实现该接口下的所有方法了"
 * 通过InvocationHandler接口，所有方法都由该handler来处理，即所有被代理的方法都由InvocationHandler接管实际的
 * 业务处理
 * Created by niuhonglei on 2017/8/10.
 */
public class GamePlayIH implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理实例
    Object obj = null;
    public GamePlayIH(Object _obj){
        this.obj=_obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用的我的账号登录");
        }
        Object result = method.invoke(this.obj,args);
        return result;
    }
}
