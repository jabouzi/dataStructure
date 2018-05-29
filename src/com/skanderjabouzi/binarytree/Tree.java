package com.skanderjabouzi.binarytree;

public class Tree {

    Node root;

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
            System.out.println("Node Not Found");
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
            deleteNode(node, smallVal.value);
            node.value = temp;
//            smallVal.left = node.left;
//            smallVal.right = node.right;
//            smallVal.parent = node.parent;
//            node.left.parent = smallVal;
//            node.right.parent = smallVal;
//            if (node.value > node.parent.value) {
//                smallVal.parent.right = null;
//                node.parent.right = smallVal;
//            } else {
//                smallVal.parent.left = null;
//                node.parent.left = smallVal;
//            }
//            System.out.println("Node : " + node.value + " Parent : " + node.parent.value + " Left : " + (node.left != null ? node.left.value : "NULL") + " Right : " + (node.right != null ? node.right.value : "NULL"));
//            System.out.println("Smallest : " + smallVal.value + " Parent : " + smallVal.parent.value + " Left : " + (smallVal.left != null ? smallVal.left.value : "NULL") + " Right : " + (smallVal.right != null ? smallVal.right.value : "NULL"));
//            System.out.println("Parent : " + (smallVal.parent.left != null ? smallVal.parent.left.value : "NULL")  + " - " + (smallVal.parent != null ? smallVal.parent.value : "NULL"));
        }

        node = null;
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

    private void treeTraversal(Node node) {
        if (node != null) {
            treeTraversal(node.left);
            System.out.print(" " + node.value);
            treeTraversal(node.right);
        }
    }

    public void traverse() {
        treeTraversal(root);
    }
}
