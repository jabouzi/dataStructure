package com.skanderjabouzi.binarytree;

class TreeNode {

    int key;
    String name;

    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int key, String name) {

        this.key = key;
        this.name = name;

    }

    public String toString() {

        return name + " has the key " + key;

        /*
         * return name + " has the key " + key + "\nLeft Child: " + leftChild +
         * "\nRight Child: " + rightChild + "\n";
         */

    }

}
