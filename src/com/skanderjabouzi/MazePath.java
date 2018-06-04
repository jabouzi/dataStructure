package com.skanderjabouzi;

import java.util.*;

import com.skanderjabouzi.Lifo;

public class MazePath {

    HashSet<MazePoint> failedPoints = new HashSet<MazePoint>();

    public Lifo<MazePoint> findPath(boolean[][] matrix, Lifo<MazePoint> paths) {

        MazePoint point = new MazePoint(0,0);
        if (matrix[point.row][point.column] == false) return null;
        paths.put(point);

        while(true) {

            if (canMoveDown(matrix, paths)) {
                point = paths.peek();
                MazePoint p = new MazePoint(point.row + 1, point.column);
                paths.put(p);
            } else if (canMoveRight(matrix, paths)) {
                point = paths.peek();
                MazePoint p = new MazePoint(point.row, point.column + 1);
                paths.put(p);
            } else {
                if (!canMoveRight(matrix, paths) && !canMoveDown(matrix, paths) && !canMoveUp(paths)) {
                    return null;
                }
                if (canMoveUp(paths)) {
                    MazePoint p = paths.get();
                    failedPoints.add(p);
                }
            }

            if (isAtTheEnd(matrix, paths)) {
                return paths;
            }
        }

    }

    public boolean canMoveDown(boolean[][] matrix, Lifo<MazePoint> paths) {
        MazePoint point = paths.peek();

        if (point.row == matrix.length - 1) {
            return false;
        }

        MazePoint p = new MazePoint(point.row + 1, point.column);
        if (failedPoints.contains(p)) return false;

        return matrix[p.row][p.column];
    }

    public boolean canMoveRight(boolean[][] matrix, Lifo<MazePoint> paths) {
        MazePoint point = paths.peek();

        if (point.column == matrix[0].length - 1) {
            return false;
        }

        MazePoint p = new MazePoint(point.row, point.column + 1);
        if (failedPoints.contains(p)) return false;

        return matrix[p.row][p.column];
    }

    public boolean canMoveUp(Lifo<MazePoint> paths) {
        MazePoint point = paths.peek();
        if (point.row == 0) {
            return false;
        }

        return true;
    }

    public boolean isAtTheEnd(boolean[][] matrix, Lifo<MazePoint> paths) {
        MazePoint point = paths.peek();
//        System.out.println(paths);
        return(point.row == matrix.length - 1 && point.column == matrix[0].length - 1);
    }

    public boolean isAtDeadEnd(boolean[][] matrix, Lifo<MazePoint> paths) {
        MazePoint point = paths.peek();
        MazePoint p = new MazePoint(point.row + 1, point.column + 1);
        System.out.println(p);
        return(matrix[point.row + 1][point.column + 1] == false);
    }
}

//11110
//01110
//11000
//01111
//01011