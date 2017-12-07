package com.mediatorParttern;

/**
 * Created by niuhonglei on 2017/8/14.
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}
