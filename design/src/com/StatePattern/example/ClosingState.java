package com.StatePattern.example;

/**
 * Created by niuhonglei on 2017/9/25.
 */
public class ClosingState extends LiftState {
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.open();
    }


    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
