package com.character;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public class FindFirestChar {
    public static void main(String[] args) {
        String str = "udasdaaaf";
        System.out.println(findChar(str));
    }

    /**
     * 查找以一个不重复的元素
     * @param s
     * @return
     */
    public static String findChar(String s) {
        String chars = null;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                chars= entry.getKey().toString();
                break;
            }
        }
        return chars;

    }
}
