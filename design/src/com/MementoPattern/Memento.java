package com.MementoPattern;

/**
 * Created by niuhonglei on 2017/9/13.
 */
public class Memento {
    private String state = "";

    public Memento(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
