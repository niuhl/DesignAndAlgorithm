package com.StatePattern.example;

/**
 * 敞开门状态
 * Created by niuhonglei on 2017/9/25.
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
