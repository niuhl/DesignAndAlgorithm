package com.ProxyPattern.ordinary;

/**
 * Created by niuhonglei on 2017/8/9.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer=null;
    public GamePlayerProxy(String userName){
        gamePlayer = new GamePalyer(this,"张三");
    }

    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName,password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
