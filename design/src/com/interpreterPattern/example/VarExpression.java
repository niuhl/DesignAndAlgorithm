package com.interpreterPattern.example;

import java.util.HashMap;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String _key){
        this.key=_key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
