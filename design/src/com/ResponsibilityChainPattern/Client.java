package com.ResponsibilityChainPattern;

/**
 * 优点:将请求和处理分开，请求者可以不用知道是谁处理的，处理者可以不用知道请求的全貌，提高了系统的灵活性
 * 缺点：性能问题；调试不方便
 * 注意事项：链中节点的数据量需要控制，避免出现超长链
 * Created by niuhonglei on 2017/9/5.
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler1();
        Handler handler3 = new ConcreteHandler1();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Response response = handler1.handleMessage(new Request());
    }
}
