package com.visitorPattern;

import java.util.Random;

/**
 * Created by niuhonglei on 2017/9/14.
 */
public class ObjectStruture {
    public static Element createElement(){
        Random random = new Random();
        if(random.nextInt(100)>50){
            return new ConcreteElement1();
        }else {
            return new ConcreteElement2();
        }
    }
}
