package com.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author niuhonglei
 * @date 2018/1/12
 */
public class Client {
    public static void main(String[] args) {
        String msg = "client data";
        try {
            Socket socket = new Socket("127.0.0.1",8080);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println(msg);
            pw.flush();

            //接收数据
            String line = is.readLine();
            System.out.println("receive data from server:"+line);

            pw.close();
            is.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
