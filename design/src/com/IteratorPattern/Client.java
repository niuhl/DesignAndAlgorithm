package com.IteratorPattern;

/**
 * 没落的设计模式
 * Created by niuhonglei on 2017/9/11.
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        aggregate.add("aaa");
        aggregate.add("123455");
        Iterator ite = aggregate.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
