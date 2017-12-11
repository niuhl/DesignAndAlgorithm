package com.character;

/**
 * 反转字符串
 * @author niuhonglei
 */
public class ReversalString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reversal1(s));
        System.out.println(reversal2(s));
        System.out.println(reversal3(s));
        System.out.println(reversal4(s));
    }
    public static String reversal1(String s){
        if(s.length()<=1){
            return s;
        }
        String left = s.substring(0,s.length()/2);
        String right = s.substring(s.length()/2,s.length());
        return reversal1(right)+reversal1(left);
    }
    public static String reversal2(String s){
        String res = "";
        for(Character c:s.toCharArray()){
            res = c+res;
        }
        return res.toString();
    }
    public static String reversal3(String s){
        char[] arrs = s.toCharArray();
        String res = "";
        for(int i=arrs.length-1;i>=0;i--){
            res = res+arrs[i];
        }
        return res;
    }
    public static String reversal4(String s){
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }
}
