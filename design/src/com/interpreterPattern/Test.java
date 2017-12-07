package com.interpreterPattern;

/**
 * Created by niuhonglei on 2017/9/26.
 */
public class Test {
    public static void main(String[] args) {
        String s = "tb_hawk_asset_his_0";
        String s1 = "tb_hawk_asset_his_12";
        System.out.println(s.substring(s.lastIndexOf("_")+1,s.length()));
        System.out.println(s1.substring(s1.lastIndexOf("_")+1,s1.length()));
    }
}
