package com.DecoratorPattern;

/**
 * Created by niuhonglei on 2017/9/6.
 */
public class Decorator extends Component {
    private Component component = null;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operate() {
        this.component.operate();
    }
}
