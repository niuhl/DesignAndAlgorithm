package com.mystack;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public interface IStack<E> {
    /**
     * 判断栈是否为null
     * @return
     */
    boolean isEmpty();

    /**
     * 判断栈是否已满
     * @return
     */
    boolean isMax();

    /**
     * 入栈
     * @param e
     * @return
     */
    boolean push(E e);

    /**
     * 出栈
     * @return
     */
    E pop();

    /**
     * 返回栈顶元素
     * @return
     */
    E peek();

    /**
     * 返回元素栈中位置
     * @param e
     * @return
     */
    int getIndex(E e);

    /**
     * 返回栈的大小
     * @return
     */
    int size();
}
