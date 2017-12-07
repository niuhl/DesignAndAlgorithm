package com.StatePattern.example;

/**
 * Created by niuhonglei on 2017/9/25.
 */
public abstract class LiftState {
    protected Context context;
    public void setContext(Context context){
        this.context=context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
