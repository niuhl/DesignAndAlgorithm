package com.queue;

/**
 * 队列
 */
public interface IQueue<E> {
    /**
     * 入队
     * @param data
     * @return
     */
    public boolean enqueue(E data);

    /**
     * 出队
     * @return
     */
    public E dequeue();

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 判断队列是否已满
     * @return
     */
    public boolean isMax();
}
