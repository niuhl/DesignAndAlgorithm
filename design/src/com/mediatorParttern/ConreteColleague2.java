package com.mediatorParttern;

/**
 * Created by niuhonglei on 2017/8/14.
 */
public class ConreteColleague2 extends Colleague {
    public ConreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    //自有方法
    public void selfMethod1(){

    }
    public void depMethod1(){
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
