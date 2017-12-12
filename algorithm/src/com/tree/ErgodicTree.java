package com.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 各种遍历二叉树
 * Created by niuhonglei on 2017/12/11.
 */
public class ErgodicTree {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node10.setLeft(node8);
        node10.setRight(node9);
        node9.setLeft(node7);
        node8.setLeft(node5);
        node8.setRight(node6);
        node5.setLeft(node1);
        node5.setRight(node2);
        node6.setLeft(node3);
        node6.setRight(node4);
        System.out.print("广度优先算法：");
        BFS(node10);
        System.out.println();
        System.out.print("反转后广度优先算法：");
        Node newRoot = reversalTree(node10);
        BFS(newRoot);

        System.out.println();
        System.out.print("递归先序遍历算法：");
        preorderTraversal(node10);
        System.out.println();
        System.out.print("递归中序遍历算法：");
        middleTraversal(node10);
        System.out.println();
        System.out.print("递归后序遍历算法：");
        afterTraversal(node10);

    }

    /**
     * 广度遍历二叉树，层序遍历就是从上到下，从左到右，进行遍历
     * 利用队列先进先出的操作，进行遍历
     *
     * @param root
     */
    public static void BFS(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node firstNode = queue.peek();
            System.out.print(firstNode.getValue() + " ");
            if (firstNode.getLeft() != null) {
                queue.add(firstNode.getLeft());
            }
            if (firstNode.getRight() != null) {
                queue.add(firstNode.getRight());
            }
            queue.poll();
        }
    }

    /**
     * 深度先序遍历:先根节点、左节点、右节点
     * 利用递归，先遍历左子树，在遍历右子树
     *
     * @param root
     */
    public static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }

    }

    /**
     * 深度中序遍历：先左节点、在根节点、右节点
     *
     * @param root
     */
    public static void middleTraversal(Node root) {
        if (root != null) {
            middleTraversal(root.getLeft());
            System.out.print(root.getValue() + " ");
            middleTraversal(root.getRight());
        }
    }

    /**
     * 深度后序遍历：先左节点、在右节点、根节点
     *
     * @param root
     */
    public static void afterTraversal(Node root) {
        if (root != null) {
            afterTraversal(root.getLeft());
            afterTraversal(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    /**
     * 递归反转二叉树
     * 先反转左边、在反转右边
     * @param root
     * @return
     */
    public static Node reversalTree(Node root) {
        if (root != null) {
            if (root.getLeft() != null) {
                reversalTree(root.getLeft());
            }
            if (root.getRight() != null) {
                reversalTree(root.getRight());
            }
            Node tmp = root.getLeft();
            Node left = root.getRight();
            root.setRight(tmp);
            root.setLeft(left);
            return root;
        }
        return null;
    }
}
