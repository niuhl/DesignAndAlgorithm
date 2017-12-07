package com.compositePattern;

/**
 * 组合模式
 * 优点：高层模块调用简单、节点自由增加
 * 缺点：不是面向接口编程，与依赖倒置原则冲突。
 * 使用场景：维护和展示部分-整体关系的场景
 * Created by niuhonglei on 2017/9/11.
 */
public class Client {
    public static void main(String[] args) {
        //创建根节点
        Composite root = new Composite();
        root.doSomething();
        //创建树枝构件
        Composite branch = new Composite();
        //创建叶子节点
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }
    public static void display(Composite root){
        for(Component c:root.getChildren()){
            if(c instanceof  Leaf){
                c.doSomething();
            }else {
                display((Composite)c);
            }
        }
    }
}
