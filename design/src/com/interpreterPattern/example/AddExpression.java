package com.interpreterPattern.example;

import java.util.HashMap;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left,Expression _right){
        super(_left,_right);
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
