package com.ProxyPattern;

/**
 * 优点：职责清晰，高扩展性，智能化
 * Created by niuhonglei on 2017/8/9.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

    public void before() {

    }

    public void after() {

    }
}
