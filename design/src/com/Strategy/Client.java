package com.Strategy;

/**
 * 优点：算法可以自由切换、避免使用多重条件判断、扩展性良好
 * 缺点：策略类数量增多、所有的策略类都需要对外暴露
 * 使用场景：多个类只有在算法或者行为上稍有不用的场景
        算法需要自由切换的场景
        需要屏蔽算法规则的场景
 * Created by niuhonglei on 2017/9/7.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
