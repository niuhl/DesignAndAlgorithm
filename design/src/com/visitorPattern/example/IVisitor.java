package com.visitorPattern.example;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);
}
