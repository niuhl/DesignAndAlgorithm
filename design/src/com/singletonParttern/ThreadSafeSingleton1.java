package com.singletonParttern;

/**
 * Created by niuhonglei on 2017/8/1.
 */
public class ThreadSafeSingleton1 {
    private static class ThreadSafeSingleton1Handle {
        private static ThreadSafeSingleton1 threadSafeSingleton1 = new ThreadSafeSingleton1();
    }

    private ThreadSafeSingleton1() {
    }
    public static ThreadSafeSingleton1 getThreadSafeSingleton1(){
        return ThreadSafeSingleton1Handle.threadSafeSingleton1;
    }

}
