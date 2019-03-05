package com.queue;

import com.linkedlist.Node;


public class ListQueue<E> implements IQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int max;
    private int num;

    public ListQueue(int size) {
        this.head = null;
        this.tail = null;
        this.max = size;
        this.num = 0;
    }

    @Override
    public boolean enqueue(E data) {
        if (isMax()) {
            throw new RuntimeException("已满");
        }
        if (isEmpty()) {
            this.head = new Node<>(data, null);
            this.tail = head;
        }else {
            tail.next = new Node<>(data, null);
            tail = tail.next;
        }
        this.num++;
        return true;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("空链表");
        }
        Node node = head;
        head = head.next;
        this.num--;
        return (E)node.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.num == 0;
    }

    @Override
    public boolean isMax() {
        return this.max == this.num;
    }
    public void printAll() {
        Node node = head;
        while (node != null && node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ListQueue<String> arrayQueue = new ListQueue<>(5);
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
