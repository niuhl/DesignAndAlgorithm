package com.singletonParttern;

/**
 * 双重检查加锁机制
 * Created by niuhonglei on 2017/8/1.
 */
public class ThreadSafeSingleton {
    //volatile保证可见性
    private static volatile ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {
    }
    public static ThreadSafeSingleton getThreadSafeSingleton(){
        if(threadSafeSingleton == null){
            synchronized (ThreadSafeSingleton.class){
                if(threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }

}
