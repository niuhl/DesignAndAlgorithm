package com.FlyweightPattern;

/**
 * Created by niuhonglei on 2017/9/27.
 */
public abstract class Flyweight {
    private String intrinsic;
    protected  final String Extrinsic;
    public Flyweight(String _Extrinsic){
        this.Extrinsic = _Extrinsic;
    }
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
