package com.linkedlist;

public class MyLinkList<E> {
    private Node head = null;

    public MyLinkList() {

    }

    public MyLinkList(Node node) {
        this.head = node;
    }

    public void insertFirst(E data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = head;
            head = node;

        }
    }

    /**
     * 从尾部插入
     *
     * @param data
     */
    public void insertTail(E data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void delete(Node node) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null && current.next != node) {
            current = current.next;
        }
        if (current != null) {
            Node tmp = current.next;
            current.next = tmp.next;
        }
    }

    public void printAll() {
        Node node = this.head;
        if (node == null) {
            System.out.println();
        }
        print(node);

    }

    public void print(Node node) {
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 循环法反转链表
     */
    public void verList() {
        if (this.head == null) {
            return;
        }
        Node currentNode = this.head.next;
        Node preHead = this.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            currentNode.next = preHead;
            preHead = currentNode;
            currentNode = next;
        }
        this.head.next = null;
        this.head = preHead;
    }
    public void verRecu(){
        this.head = recursion(this.head);
    }

    /**
     * 递归反转列表
     */
    private Node recursion(Node node){
        Node f = node;
        if(f == null || f.next == null){
            return f;
        }else {
            Node v = recursion(f.next);
            f.next.next = f;
            f.next = null;
            return v;
        }
    }

    /**
     * 快慢指针法
     * @return
     */
    public Node findMinddle(){
        return null;
    }

    public static void main(String[] args) {
        MyLinkList link = new MyLinkList();
        System.out.println("hello");
        int data[] = {1, 2};
        for (int i = 0; i < data.length; i++) {
            link.insertFirst(data[i]);
//            link.insertTail(data[i]);
        }
        System.out.println("打印原始:");
        link.printAll();
        link.verList();
        System.out.println("打印反转:");
        link.printAll();
        link.verRecu();
        System.out.println("打印反转:");
        link.printAll();
    }
}
