package com.StatePattern;


/**
 * Created by niuhonglei on 2017/9/25.
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void handle1();
    public abstract void handle2();
}
