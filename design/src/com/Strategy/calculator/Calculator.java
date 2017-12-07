package com.Strategy.calculator;

/**
 * 策略枚举
 * Created by niuhonglei on 2017/9/7.
 */
public enum Calculator {
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };
    String value = "";
    private Calculator(String _value){
        this.value=_value;
    }
    public String getValue(){
        return this.value;
    }
    public abstract int exec(int a,int b);
}
