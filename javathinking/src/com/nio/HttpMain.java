package com.nio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by niuhonglei on 2018/2/5.
 */
public class HttpMain {
    public static void main(String[] args) {
      /* Post Request */
        Map dataMap = new HashMap();
        dataMap.put("username", "Nick Huang");
        dataMap.put("blog", "IT");
        try {
            //System.out.println(new HttpRequestor().doPost("http://localhost:8081/TestProgect2/LoginServlet", dataMap));
            System.out.println(new HttpRequestor().doGet("https://edu.hivoice.cn/WebAudio-1.0-SNAPSHOT/result/6EF23512-0FFC-4CFA-A511-4D515FDCF3FD/1515341223080179696/bj"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    /* Get Request */

    }
}