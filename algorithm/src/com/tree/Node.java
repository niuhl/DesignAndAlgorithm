package com.tree;

/**
 * Created by niuhonglei on 2017/12/11.
 */
public class Node {
    int value;
    Node left;
    Node right;
    public Node(){

    }
    public Node(int value){
        this.value = value;
    }
    public Node(int value, Node left,Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
