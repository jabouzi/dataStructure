package com.skanderjabouzi;

public class Matrix {

    public int[][] zeroMatrix(int[][] matrix) {

//        int[][] zeroMatrix = new int[matrix.length][matrix[0].length];
        int[][] zeroMatrix = copyArray(matrix);
        printMatrix(zeroMatrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
//                    System.out.println("++++++++++++++");
//                    System.out.println("I " + i + " J  " + j);
                    insertZerosToColumns(zeroMatrix, j);
                    insertZerosToRows(zeroMatrix, i);
                }
            }
        }

        return zeroMatrix;
    }


    public void insertZerosToRows(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
//            System.out.println("row " + row + " i " + i);
            matrix[row][i] = 0;
        }
    }

    public void insertZerosToColumns(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("col " + col + " i " + i);
            matrix[i][col] = 0;
        }
    }

    public int[][] copyArray(int[][] matrix) {
        int [][] matrixCopy = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
        {
            int[] aMatrix = matrix[i];
            int   aLength = matrixCopy.length;
            matrixCopy[i] = new int[aLength];
            System.arraycopy(aMatrix, 0, matrixCopy[i], 0, aLength);
        }

        return matrixCopy;
    }

    public int[][] rotateMatrix90degreClockWise(int[][] matrix) {
        matrix = transposeMatrix(matrix);
        matrix = reflectMatrix(matrix);

        return matrix;
    };

    public int[][] transposeMatrix(int[][] matrix) {

        int[][] matrixTransp = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
//                System.out.println("i " + i + " j " + j);
                matrixTransp[j][i] = matrix[i][j];
            }
        }
        return matrixTransp;
    }

    public int[][] reflectMatrix(int[][] matrix) {

        int[][] matrixReflec = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
//                System.out.println("i " + i + " j " + j + " i2 " + i + " j2 " + (matrix[0].length - 1 - j));
                swapRowColumn(matrix, matrixReflec, i, j, i, matrix[0].length - 1 - j);
            }
        }
        return matrixReflec;
    }

    public void swapRowColumn(int[][] matrix, int[][] matrix2, int row1, int col1, int row2, int col2){
        matrix2[row2][col2] = matrix[row1][col1];
        matrix2[row1][col1] = matrix[row2][col2];
    }

    public void printMatrix(int[][] matrix) {
        System.out.println();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
}