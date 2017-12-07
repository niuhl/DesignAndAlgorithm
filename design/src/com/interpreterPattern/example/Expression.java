package com.interpreterPattern.example;

import java.util.HashMap;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String,Integer> var);
}
