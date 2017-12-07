package com.FlyweightPattern;

import java.util.HashMap;

/**
 * 优点：大大减少应用程序创建的对象、降低程序内存的占用，增强程序的性能
 * 使用场景：系统中存在大量的相似对象
 * 细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关
 * 需要缓冲池的场景
 *
 * Created by niuhonglei on 2017/9/27.
 */
public class FlyweightFactory {
    private static HashMap<String,Flyweight> pool = new HashMap<>();
    public static Flyweight getFlyweight(String Extrinsic){
        Flyweight flyweight = null;
        if(pool.containsKey(Extrinsic)){
            flyweight = pool.get(Extrinsic);
        }else {
            flyweight = new ConcreteFlyweight1(Extrinsic);
            pool.put(Extrinsic,flyweight);
        }
        return flyweight;
    }
}
