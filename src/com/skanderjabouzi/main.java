package com.skanderjabouzi;

import com.skanderjabouzi.binarytree.BinaryTree;
import com.skanderjabouzi.binarytree.Node;
import com.skanderjabouzi.binarytree.Tree;
import com.skanderjabouzi.libs.AssortedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.skanderjabouzi.QuestionA.getPath;

public class main {

    public static void main(java.lang.String[] args) {
        StringDS string = new StringDS();

        System.out.println("=========STRINGS============");

        java.lang.String s = "aaabbcccccaa";
        System.out.println(string.compress(s));

        System.out.println("        ");

        s = "abcdefgh";
        System.out.println(string.compress(s));

        System.out.println("=========MATRIX============");

        int[][] m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        com.skanderjabouzi.Matrix matrix = new Matrix();

        System.out.println(m.length);
        System.out.println(m[0].length);
        matrix.printMatrix(m);

        int[][] m1 = matrix.transposeMatrix(m, false);
        matrix.printMatrix(m1);

        int[][] m2 = matrix.reflectMatrix(m1, false);
        matrix.printMatrix(m2);

        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        matrix.printMatrix(m);
        m1 = matrix.transposeMatrix(m, true);
        matrix.printMatrix(m1);

        m2 = matrix.reflectMatrix(m1, true);
        matrix.printMatrix(m2);

//        matrix.printMatrix(matrix.rotateMatrix90degreClockWise(m, false));
//        matrix.printMatrix(matrix.rotateMatrix90degreClockWise(m, true));

        m = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        matrix.printMatrix(m);
        matrix.printMatrix(matrix.rotateMatrix90degreClockWise(m, false));


        m = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 0, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        matrix.printMatrix(m);
        m = matrix.zeroMatrix(m);
        matrix.printMatrix(m);

        StringDS stringDS = new StringDS();
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(stringDS.isStringRotation(s1, s2));
        System.out.println();
        s1 = "waterbottle";
        s2 = "erbottlewat";
        System.out.println(stringDS.isStringRotation(s1, s2));
        System.out.println();

        System.out.println("=========RECURSION============");

        System.out.println();

        Recursion recursion = new Recursion();
        System.out.println(recursion.countWays(20));
        System.out.println();
//        recursion.test();


        System.out.println();
        System.out.println(recursion.getTriNumber(6));
        System.out.println();

        System.out.println();
        System.out.println(recursion.factoriel(6));
        System.out.println();

        System.out.println();
        System.out.println(recursion.fibo(3));
        System.out.println();

        System.out.println();
        System.out.println(recursion.fib2(6));
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println();

        Tree bt = new Tree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(2);
        bt.add(10);

//        System.out.println();
//        bt.preorderTraverse();
//        System.out.println();
//        bt.inorderTraverse();
//        System.out.println();
//        bt.postorderTraverse();

//        System.out.println();
//        System.out.println(bt.nodeExists(6).toString());
//        System.out.println();
//        System.out.println(bt.nodeExists(10));
//        System.out.println();
//        System.out.println(bt.nodeExists(9));
//        System.out.println();
//        System.out.println(bt.nodeExists(3));
//        System.out.println();
//        System.out.println(bt.nodeExists(2));
//        System.out.println();
//        System.out.println(bt.nodeExists(11));
//        System.out.println();
//        bt.preorderTraverse();
//        System.out.println();
//        bt.delete(9);
//        System.out.println();
//        System.out.println(bt.nodeExists(10));
//        System.out.println();
//        bt.delete(4);
//        System.out.println();
//        System.out.println(bt.nodeExists(4));
//        System.out.println();
//        System.out.println(bt.nodeExists(3));

        System.out.println();
        System.out.println("*********************");
        System.out.println();

        bt = new Tree();

        bt.add(10);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(8);
        bt.add(12);
        bt.add(16);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(11);
        bt.add(13);
        bt.add(15);
        bt.add(17);

        System.out.println();
        bt.preorderTraverse();
//        bt.delete(6);
//        System.out.println();
//        System.out.println(bt.nodeExists(4));
//        System.out.println();
//        System.out.println(bt.nodeExists(8));
//        System.out.println();
//        System.out.println(bt.nodeExists(6));

        System.out.println();
//        bt.delete(10);
//        System.out.println(recursion.mult(5, 3));
//        System.out.println(recursion.mult(4, 5));
//        System.out.println(recursion.mult(10, 9));
//        System.out.println(recursion.mult(3, 7));
//        System.out.println(recursion.mult2(3, 7));
//        int a = 13494;
//        int b = 22323;
//        System.out.println("X" + recursion.mult2(a, b));
//        System.out.println(a*b);
//        System.out.println(recursion.mult(13494, 22323));

//        bt.preorderTraverse();
//        System.out.println();
//        bt.delete(10);
//        bt.preorderTraverse();

        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println(arrayList.toString());
//        recursion.findTriplets(arrayList);
        int[] ar = {2, 1, 5, 4, 3, 7};
        recursion.findTriplets2(ar, 10);

        int[] c = new int[]{1, 2, 0, 5, 3, 0, 4};
        System.out.println(recursion.zeros2Left(c));

        int[] stk = new int[] {10, 30, 42, 15, 20, 50, 10, 25, 5};
        recursion.stockPrice(stk);

//        bt = new Tree();
//        bt.add(50);
//        bt.add(25);
//        bt.add(15);
//        bt.add(30);
//        bt.add(75);
//        bt.add(85);

//        bt.inorderTraverse();
//
        BinaryTree theTree = new BinaryTree();
//
//        theTree.addNode(50, "Boss");
//
//        theTree.addNode(25, "Vice President");
//
//        theTree.addNode(15, "Office Manager");
//
//        theTree.addNode(30, "Secretary");
//
//        theTree.addNode(75, "Sales Manager");
//
//        theTree.addNode(85, "Salesman 1");
//
//        // Different ways to traverse binary trees
//
//         theTree.inOrderTraverseTree(theTree.root);
//
//        // theTree.preorderTraverseTree(theTree.root);
//
//        // theTree.postOrderTraverseTree(theTree.root);
//
//        // Find the node with key 75
//
//        System.out.println("\nTreeNode with the key 75");
//
//        System.out.println(theTree.findNode(75));

        theTree = new BinaryTree();
        theTree.addNode(10, " ");
        theTree.addNode(6, " ");
        theTree.addNode(14, " ");
        theTree.addNode(4, " ");
        theTree.addNode(8, " ");
        theTree.addNode(12, " ");
        theTree.addNode(16, " ");
        theTree.addNode(3, " ");
        theTree.addNode(5, " ");
        theTree.addNode(7, " ");
        theTree.addNode(9, " ");
        theTree.addNode(11, " ");
        theTree.addNode(13, " ");
        theTree.addNode(15, " ");
        theTree.addNode(17, " ");


        System.out.println();
        System.out.println("*********************");
        System.out.println();

        bt = new Tree();
        bt.add(10);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(8);
        bt.add(12);
        bt.add(16);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(11);
        bt.add(13);
        bt.add(15);
        bt.add(17);

        System.out.println();
//        bt2.inorder(bt2.root);
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        bt.inorderTraverse(list);
        System.out.println(list.toString());
        System.out.println(recursion.isBST(list));
        list.add(2);
        System.out.println(recursion.isBST(list));
//        theTree.inOrderTraverseTree(theTree.root);

        String[] x = {"1234 567 890", "4124 123 123", "3123 123 322"};
        stringDS.countInText(x, "123");
        System.out.println();
        stringDS.countInText(x, "41");

        int[] a = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(recursion.findPivot(a, 0, a.length -1));
        System.out.println(recursion.findInRotArr(a, 5));
        System.out.println();
        System.out.println("---*");
        System.out.println();
        a = new int[]{3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
        System.out.println(recursion.findPivot(a, 0, a.length -1));
        System.out.println(recursion.findInRotArr(a, 5));
        System.out.println();
        System.out.println("---**");
        System.out.println();
        a = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        System.out.println(recursion.findPivot(a, 0, a.length -1));
        System.out.println(recursion.findInRotArr(a, 5));
        System.out.println();
        System.out.println("---***");
        System.out.println();
        a = new int[]{8, 9, 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(recursion.findPivot(a, 0, a.length -1));
        System.out.println(recursion.findInRotArr(a, 5));
        System.out.println(recursion.findInRotArr(a, 4));
        System.out.println(recursion.findInRotArr(a, 3));
        System.out.println(recursion.findInRotArr(a, 2));
        System.out.println(recursion.findInRotArr(a, 1));
        System.out.println(recursion.findInRotArr(a, 0));
        System.out.println(recursion.findInRotArr(a, 6));
        System.out.println(recursion.findInRotArr(a, 7));
        System.out.println(recursion.findInRotArr(a, 8));
        System.out.println(recursion.findInRotArr(a, 9));
        System.out.println();
        System.out.println();
        a = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(recursion.binarySearch(a, 0, 0, a.length));
        System.out.println(recursion.binarySearch(a, 1, 0, a.length));
        System.out.println(recursion.binarySearch(a, 2, 0, a.length));
        System.out.println(recursion.binarySearch(a, 3, 0, a.length));
        System.out.println(recursion.binarySearch(a, 4, 0, a.length));
        System.out.println(recursion.binarySearch(a, 5, 0, a.length));
        System.out.println(recursion.binarySearch(a, 6, 0, a.length));
        System.out.println(recursion.binarySearch(a, 7, 0, a.length));

        System.out.println();
        System.out.println();

        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        matrix.printMatrix2(m);
        System.out.println();


        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        matrix.printMatrix2(m);
        System.out.println();

        m = new int[][] {
                {20, 40, 80},
                {5, 60, 90},
                {45, 50, 55}
        };

        matrix.printMatrix2(m);
        System.out.println();
        matrix.printMatrix3(m);
        System.out.println();

        bt = new Tree();
        matrix.treeFromMatrix(bt, m);
        list = new ArrayList<>();
        bt.inorderTraverse(list);
        System.out.println(list.toString());

        System.out.println();

        bt = new Tree();
        matrix.treeFromMatrix2(bt, m);
        list = new ArrayList<>();
        bt.inorderTraverse(list);
        System.out.println(list.toString());

        System.out.println();

        bt = new Tree();
        matrix.treeFromMatrix3(bt, m);
        list = new ArrayList<>();
        bt.inorderTraverse(list);
        System.out.println(list.toString());

        m = new int[][] {
                {40, 5, 80},
                {60, 20, 90},
                {70, 50, 55}
        };

        System.out.println();

        bt = new Tree();
        matrix.treeFromMatrix(bt, m);
        list = new ArrayList<>();
        bt.inorderTraverse(list);
        System.out.println(list.toString());

        Fifo<Integer> fifo = new Fifo<>();
        fifo.put(5);
        fifo.put(6);
        fifo.put(8);
        fifo.put(9);

        System.out.println(fifo.peek());

        List<Object> intList = new ArrayList<>();
        intList = Arrays.asList(fifo.getAll());
        System.out.println(intList.toString());




        int size = 5;
        AssortedMethods assortedMethods = new AssortedMethods();
        boolean[][] maze = assortedMethods.randomBooleanMatrix(size, size, 70);

        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(" row : " + m.length);
        System.out.println(" column : " + m[0].length);
        matrix.printMatrix(m);

        Lifo<Integer> lifo = new Lifo<>();
        lifo.put(5);
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.put(6);
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.put(7);
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.put(8);
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.put(9);
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.get();
        System.out.println(lifo.peek());
        System.out.println(lifo);
        lifo.get();
        System.out.println(lifo.peek());
        System.out.println(lifo);

//        maze = new boolean[][]{
//                {true,true,true,true,false},
//                {false,true,true,true,false},
//                {true,true,false,false,false},
//                {false,true,true,true,true},
//                {false,true,false,true,true}
////                {1,0,1,1,1},
////                {1,0,0,1,0},
////                {1,1,0,1,1},
////                {1,1,1,1,1},
////                {1,0,1,1,1}
//        };

        assortedMethods.printMatrix(maze);

        Lifo<MazePoint> paths = new Lifo<>();
        MazePath mp = new MazePath();
        Lifo<MazePoint> result = mp.findPath(maze, paths);
        if (result != null) {
            System.out.println(result + " I ");
        } else {
            System.out.println("No path found 1.");
        }

//        assortedMethods.printMatrix(maze);

        ArrayList<Point> path = getPath(maze);
        if (path != null) {
            System.out.println(path.toString() + " II ");
        } else {
            System.out.println("No path found 2.");
        }

        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(" row : " + m.length);
        System.out.println(" column : " + m[0].length);
        matrix.printMatrix(m);

    }
}
