package com.skanderjabouzi;

import com.skanderjabouzi.binarytree.Node;
import com.skanderjabouzi.binarytree.Tree;
import com.skanderjabouzi.libs.AssortedMethods;

import java.util.ArrayList;

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

        int size = 5;
        AssortedMethods assortedMethods = new AssortedMethods();
        boolean[][] maze = assortedMethods.randomBooleanMatrix(size, size, 70);

        assortedMethods.printMatrix(maze);

        ArrayList<Point> path = getPath(maze);
        if (path != null) {
            System.out.println(path.toString());
        } else {
            System.out.println("No path found.");
        }

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

        System.out.println();
        System.out.println(bt.nodeExists(6).toString());
        System.out.println();
        System.out.println(bt.nodeExists(10));
        System.out.println();
        System.out.println(bt.nodeExists(9));
        System.out.println();
        System.out.println(bt.nodeExists(3));
        System.out.println();
        System.out.println(bt.nodeExists(2));
        System.out.println();
        System.out.println(bt.nodeExists(11));
        System.out.println();
        bt.deleteNode(9);
        System.out.println();
        System.out.println(bt.nodeExists(10));
        System.out.println();
        bt.deleteNode(4);
        System.out.println();
        System.out.println(bt.nodeExists(4));
        System.out.println();
        System.out.println(bt.nodeExists(3));

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
        bt.add(18);

        System.out.println();
        bt.deleteNode(6);
        System.out.println();
        System.out.println(bt.nodeExists(4));
        System.out.println();
        System.out.println(bt.nodeExists(8));
        System.out.println();
        System.out.println(bt.nodeExists(6));
    }
}
