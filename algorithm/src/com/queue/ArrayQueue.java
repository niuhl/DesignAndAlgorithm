package com.queue;

public class ArrayQueue<E> implements IQueue<E> {
    private Object[] arrs;
    /**
     * 队头
     */
    private int head;
    /**
     * 队尾
     */
    private int tail;
    /**
     * 队列最大长度
     */
    private int max;

    public ArrayQueue(int size) {
        this.arrs = new Object[size];
        this.head = 0;
        this.tail = 0;
        max = size;
    }

    @Override
    public boolean enqueue(E data) {
        if (isMax()) {
            if (this.head == 0) {
                throw new RuntimeException("已满");
            }
            for (int i = head; i < tail; i++) {
                arrs[i - head] = arrs[i];
            }
            this.tail = tail - head;
            this.head = 0;
        }
        arrs[tail++] = data;
        return true;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("空队列");
        } else {
            Object o = arrs[head++];
            return (E) o;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.tail == this.head;
    }

    @Override
    public boolean isMax() {
        return this.tail == max;
    }

    public void printAll() {
        for (int i = head; i < tail; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(5);
        String st = "a,b,c,d,e";
        for (String string : st.split(",")) {
            arrayQueue.enqueue(string);
        }
        arrayQueue.printAll();
        arrayQueue.dequeue();
        arrayQueue.printAll();
        arrayQueue.dequeue();
        arrayQueue.printAll();
        arrayQueue.enqueue("f");
        arrayQueue.printAll();
        arrayQueue.enqueue("g");
        arrayQueue.printAll();
        arrayQueue.enqueue("i");
        arrayQueue.printAll();
    }
}
