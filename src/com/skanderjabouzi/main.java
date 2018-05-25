package com.skanderjabouzi;

public class main {

    public static void main(java.lang.String[] args) {
        StringDS string = new StringDS();

        java.lang.String s = "aaabbcccccaa";
        System.out.println(string.compress(s));

        System.out.println("        ");

        s = "abcdefgh";
        System.out.println(string.compress(s));

        int[][] m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        com.skanderjabouzi.Matrix matrix = new Matrix();

        System.out.println(m.length);
        System.out.println(m[0].length);
        matrix.printMatrix(m);

        int[][] m1 = matrix.transposeMatrix(m);
        matrix.printMatrix(m1);

        int[][] m2 = matrix.reflectMatrix(m1);
        matrix.printMatrix(m2);

        m = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        matrix.printMatrix(matrix.rotateMatrix90degreClockWise(m));

        m = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        matrix.printMatrix(m);
        matrix.printMatrix(matrix.rotateMatrix90degreClockWise(m));


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
    }
}
