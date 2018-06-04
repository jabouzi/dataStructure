package com.skanderjabouzi.binarytree;

import java.util.ArrayList;

public class Tree {

    public Node root;

    private Node addRecursive(Node current, Node[] previous, int value) {

        if (current == null) {
            System.out.println("Create Node : " + value);
            System.out.println("Parent Node : " + ((previous[0] != null) ? previous[0].value : "ROOT"));
            Node node= new Node(value);
            if (previous[0] != null) node.parent = previous[0];
            return node;
        }

        if (value < current.value) {
            System.out.println("GO Left : " + value);
            previous[0] = current;
            current.left = addRecursive(current.left, previous, value);
        } else if (value > current.value) {
            System.out.println("GO Right : " + value);
            previous[0] = current;
            current.right = addRecursive(current.right, previous, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        if (root == null) System.out.println("Root + " + root);
        root = addRecursive(root, new Node[1], value);
    }

    private Node findNode(Node current, int value) {

        if (current == null) {
            System.out.println("Node Not Found : " + value);
            return null;
        }

        if (current.value == value) {
            System.out.println("Node Found : " + value + " Parent : " + (current.parent != null ? current.parent.value : "ROOT"));
            return current;
        }

        if (value < current.value) {
            System.out.println("GO Left : " + current.value);
            return findNode(current.left, value);
        }

        System.out.println("GO Right : " +current.value);
        return findNode(current.right, value);

    }

    public Node nodeExists(int value) {
        return findNode(root, value);
    }

    public void deleteNode(Node root, int value) {

        Node node = findNode(root, value);

        if (node == null) return;

        if (node.left == null && node.right == null) {
            System.out.println("Node No Children : " + node.value);
            if (node.value > node.parent.value) {
                node.parent.right = null;
            } else {
                node.parent.left = null;
            }
        } else if (node.left == null) {
            System.out.println("Node One Child Right: " + node.value);
            node.parent.right = node.right;
            node.right.parent = node.parent;
        } else if (node.right == null) {
            System.out.println("Node One Child Left: " + node.value);
            node.parent.left = node.left;
            node.left.parent = node.parent;
        } else {
            System.out.println("Node Two Children: " + node.value);
            System.out.println("Node : " + node.value + " Parent : " + (node.parent != null ? node.parent.value : "NULL") + " Left : " + (node.left != null ? node.left.value : "NULL") + " Right : " + (node.right != null ? node.right.value : "NULL"));
            Node smallVal = findMinimumValue(node.right);
            int temp = smallVal.value;
            System.out.println("DELETE SMALLVAL " + smallVal.value);
            deleteNode(node, smallVal.value);
            System.out.println("Replace deleted node : " + node.value + " = " + temp );
            node.value = temp;
        }
    }

    public void delete(int value) {
        deleteNode(root, value);
    }

    private Node findMinimumValue(Node node) {
        if (node.left == null) {
            System.out.println("Small Value : " + node.value);
            return node;
        }

        System.out.println("Small Value Go Left: " + node.value);
        return findMinimumValue(node.left);
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            preorder(node.left);
            preorder(node.right);
        }
    }

    private void inorder(Node node, ArrayList nodes) {
        if (node != null) {
            inorder(node.left, nodes);
            nodes.add(node.value);
            System.out.print(" " + node);
            inorder(node.right, nodes);
        }
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public void preorderTraverse() {
        preorder(root);
    }

    public void inorderTraverse(ArrayList nodes) {
        inorder(root, nodes);
    }

    public void postorderTraverse() {
        postorder(root);
    }
}
