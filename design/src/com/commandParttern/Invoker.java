package com.commandParttern;

/**
 * Created by niuhonglei on 2017/8/22.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command _command){
        this.command=_command;
    }
    public void action(){
        this.command.execute();
    }
}
