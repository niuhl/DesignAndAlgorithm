package com.interpreterPattern.example;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public class Calculator {
    private Expression expression;
    public Calculator(String expStr){
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for(int i=0;i<chars.length;i++){
            switch (chars[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }
    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
