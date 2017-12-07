package com.interpreterPattern.example;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    public SymbolExpression(Expression _left,Expression _right){
        this.left = _left;
        this.right = _right;
    }
}
