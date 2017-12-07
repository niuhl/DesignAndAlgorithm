package com.StatePattern.example;

/**
 * Created by niuhonglei on 2017/9/25.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.stop();
        context.open();
        context.close();
        context.run();

    }
}
