package com.listreversal;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public class Node extends Object {
    private String nodeName;

    private Node nextNode;


    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public Node(String nodeName, Node nextNode) {
        this.nodeName = nodeName;
        this.nextNode = nextNode;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void print() {
        System.out.print(nodeName);
    }
}
