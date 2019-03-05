package com.linkedlist;

public class Node<E> {
    private E data;
    public Node next;
    public Node(E data,Node next){
        this.data=data;
        this.next = next;
    }
    public E getData(){
        return data;
    }
}
