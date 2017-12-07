package com.mediatorParttern;

/**
 * 优点：减少类之间的依赖，把原有的一对多的依赖变成了一对一的依赖
 * 缺点:中介者会膨胀得很大，而且逻辑复杂。
 * 使用场景:在类图中出现了网状结构，例如机场调度中心，MVC的前端控制器
 * Created by niuhonglei on 2017/8/14.
 */
public abstract class Mediator {
    protected ConreteColleague1 conreteColleague1;
    protected ConreteColleague2 conreteColleague2;

    public ConreteColleague1 getConreteColleague1() {
        return conreteColleague1;
    }

    public void setConreteColleague1(ConreteColleague1 conreteColleague1) {
        this.conreteColleague1 = conreteColleague1;
    }

    public ConreteColleague2 getConreteColleague2() {
        return conreteColleague2;
    }

    public void setConreteColleague2(ConreteColleague2 conreteColleague2) {
        this.conreteColleague2 = conreteColleague2;
    }
    public abstract void doSomething1();
    public abstract void doSomething2();
}
