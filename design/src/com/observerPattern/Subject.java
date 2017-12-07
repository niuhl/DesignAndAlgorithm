package com.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niuhonglei on 2017/9/12.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    public  void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void delObserver(Observer o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer o:this.observers){
            o.update();
        }
    }
}
