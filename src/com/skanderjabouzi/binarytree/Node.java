package com.skanderjabouzi.binarytree;

public class Node<E> {

    int value;
    Node left;
    Node right;
    Node parent;

    Node(int value) {

        this.value = value;
        left = null;
        right = null;
        parent = null;

    }

    public String toString() {

        return String.valueOf(value);
    }
}
