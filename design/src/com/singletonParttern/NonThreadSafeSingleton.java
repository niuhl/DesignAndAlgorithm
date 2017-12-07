package com.singletonParttern;

/**
 * 非线程安全的单例模式
 * Created by niuhonglei on 2017/8/1.
 */
public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton nonThreadSafeSingleton = null;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getNonThreadSafeSingleton() {
        if (nonThreadSafeSingleton == null) {
            nonThreadSafeSingleton = new NonThreadSafeSingleton();
        }
        return nonThreadSafeSingleton;
    }

    public void doSomething() {
    }

}
