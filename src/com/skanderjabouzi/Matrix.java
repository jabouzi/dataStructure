package com.skanderjabouzi;

import com.skanderjabouzi.binarytree.Tree;

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


    public int[][] rotateMatrix90degreClockWise(int[][] matrix, boolean outerOnly) {
        matrix = transposeMatrix(matrix, outerOnly);
        matrix = reflectMatrix(matrix, outerOnly);

        return matrix;
    };

    public int[][] transposeMatrix(int[][] matrix, boolean outerOnly) {

        int[][] matrixTransp = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
//                System.out.println("i " + i + " j " + j);
                if (outerOnly) {
                    if (i > 0  && i < matrix.length - 1 && j > 0 && j < matrix[0].length - 1) {
                        matrixTransp[i][j] = matrix[i][j];
                    } else {
                        matrixTransp[j][i] = matrix[i][j];
                    }
                } else {
                    matrixTransp[j][i] = matrix[i][j];
                }

            }
        }
        return matrixTransp;
    }

    public int[][] reflectMatrix(int[][] matrix, boolean outerOnly) {

        int[][] matrixReflec = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
//                System.out.println("i " + i + " j " + j + " i2 " + i + " j2 " + (matrix[0].length - 1 - j));
                if (outerOnly) {
                    if (i > 0  && i < matrix.length - 1 && j > 0 && j < matrix[0].length - 1) {
                        matrixReflec[i][j] = matrix[i][j];
                    } else {
                        swapRowColumn(matrix, matrixReflec, i, j, i, matrix[0].length - 1 - j);
                    }
                } else {
                    swapRowColumn(matrix, matrixReflec, i, j, i, matrix[0].length - 1 - j);
                }
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
                System.out.printf(row + "," + col + " : " + matrix[row][col] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printMatrix2(int[][] matrix) {
        for (int r = 0, c = 0; r < matrix.length;) {
            if (c < matrix[r].length) {
                System.out.print(matrix[r][c] + " ");
                ++c;
            } else {
                c = 0;
                ++r;
            }
        }
    }

    public void printMatrix3(int[][] matrix) {
        for(int i = 0 ; i < matrix.length * matrix[0].length ; i++)
            System.out.print(matrix[i % matrix.length][i / matrix.length] + " ");
    }

    public void treeFromMatrix3(Tree tree, int[][] matrix) {
        for(int i = 0 ; i < matrix.length * matrix[0].length ; i++)
            tree.add(matrix[i % matrix.length][i / matrix.length]);
    }

    public void treeFromMatrix2(Tree tree, int[][] matrix) {
        for (int r = 0, c = 0; r < matrix.length;) {
            if (c < matrix[r].length) {
                tree.add(matrix[r][c]);
                ++c;
            } else {
                c = 0;
                ++r;
            }
        }
    }

    public void treeFromMatrix(Tree tree, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                tree.add(matrix[row][col]);
            }
        }
    }
}
