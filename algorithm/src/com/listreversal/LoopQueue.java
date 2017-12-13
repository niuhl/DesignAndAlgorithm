package com.listreversal;

/**
 * Created by niuhonglei on 2017/12/13.
 */
public interface LoopQueue {
    public static void main(String[] args) {
        Node zero = new Node("0");
        Node one = new Node("1");
        Node two = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");
        Node five = new Node("5");
        zero.setNextNode(one);
        one.setNextNode(two);
        two.setNextNode(three);
        three.setNextNode(four);
        four.setNextNode(five);
        five.setNextNode(two);
        System.out.println("是否有环：" + hasLoop(one));
        System.out.println("环队列的入口：" + loopEntry(one).getNodeName());
    }

    /**
     * 判断队列是否有环
     *
     * @param node
     * @return
     */
    public static boolean hasLoop(Node node) {
        Node fast = null;
        Node slow = null;
        fast = node;
        slow = node;
        while (true) {
            if (slow.getNextNode() != null) {
                slow = slow.getNextNode();
            } else {
                return false;
            }
            if (fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
                fast = fast.getNextNode().getNextNode();
            } else {
                return false;
            }
            if (slow.getNodeName().equals(fast.getNodeName())) {
                return true;
            }
        }
    }

    /**
     * 查找循环队列的入口
     *
     * @param node
     * @return
     */
    public static Node loopEntry(Node node) {
        Node fast = null;
        Node slow = null;
        fast = node;
        slow = node;
        while (true) {
            if (slow.getNextNode() != null) {
                slow = slow.getNextNode();
            } else {
                return null;
            }
            if (fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
                fast = fast.getNextNode().getNextNode();
            } else {
                return null;
            }
            if (slow.getNodeName().equals(fast.getNodeName())) {
                break;
            }
        }
        slow = node;
        while (!slow.getNodeName().equals(fast.getNodeName())) {
            slow = slow.getNextNode();
            fast = fast.getNextNode();
        }

        return slow;
    }
}
