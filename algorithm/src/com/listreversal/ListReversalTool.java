package com.listreversal;

/**
 * 反转链表
 * Created by niuhonglei on 2017/12/11.
 */
public class ListReversalTool {
    public static void main(String[] args) {
        Node one = new Node("1");
        Node two = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");
        one.setNextNode(two);
        two.setNextNode(three);
        three.setNextNode(four);
        four.setNextNode(null);

        Node rehead = sequentialTraversal(one);
        while (rehead != null) {
            rehead.print();
            rehead = rehead.getNextNode();
        }
    }

    /**
     * 递归反转
     * 在反转当前节点之前，先返回其后续节点
     *
     * @param head
     * @return
     */
    public static Node recursionReversal(Node head) {
        if (head == null || head.getNextNode() == null) {
            return head;
        }
        Node reHead = sequentialTraversal(head.getNextNode());
        head.getNextNode().setNextNode(head);
        head.setNextNode(null);
        return reHead;
    }

    /**
     * 从第一个节点开始反转
     * @param head
     * @return
     */
    public static Node sequentialTraversal(Node head){
        if(head == null){
            return head;
        }
        Node preNode = head;
        Node currentNode = head.getNextNode();
        while(currentNode != null){
            Node tmp = currentNode.getNextNode();
            currentNode.setNextNode(preNode);
            preNode = currentNode;
            currentNode = tmp;
        }
        head.setNextNode(null);
        return preNode;
    }
}
