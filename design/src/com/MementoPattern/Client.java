package com.MementoPattern;

/**
 * Created by niuhonglei on 2017/9/13.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
