package com.ProxyPattern.dynamic;

import com.ProxyPattern.ordinary.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by niuhonglei on 2017/8/10.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePalyer("张三");
        InvocationHandler invocationHandler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, invocationHandler);
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();

    }
}
