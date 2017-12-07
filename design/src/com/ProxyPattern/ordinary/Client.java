package com.ProxyPattern.ordinary;

/**
 * Created by niuhonglei on 2017/8/9.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
