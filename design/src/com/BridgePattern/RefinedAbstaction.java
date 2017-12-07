package com.BridgePattern;

/**
 * Created by niuhonglei on 2017/9/27.
 */
public class RefinedAbstaction extends Abstraction {
    public RefinedAbstaction(Implementor _imp) {
        super(_imp);
    }
    @Override
    public void request(){
        super.request();
        super.getImp().doAnything();
    }
}
