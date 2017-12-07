package com.DecoratorPattern;

/**
 * 具体构件
 * Created by niuhonglei on 2017/9/6.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
