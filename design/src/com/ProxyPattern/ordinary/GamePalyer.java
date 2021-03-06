package com.ProxyPattern.ordinary;

/**
 * Created by niuhonglei on 2017/8/9.
 */
public class GamePalyer implements IGamePlayer {
    private String userName;
    public GamePalyer(IGamePlayer iGamePlayer,String userName){
        if(iGamePlayer == null){
            throw new RuntimeException("不能创建真实角色！");
        }else {
            this.userName = userName;
        }
    }
    @Override
    public void login(String userName, String password) {
        System.out.println(userName+"登录");
    }

    @Override
    public void killBoss() {
        System.out.println(this.userName+"杀boss");
    }

    @Override
    public void upgrade() {
        System.out.println(this.userName+"升级");
    }
}
