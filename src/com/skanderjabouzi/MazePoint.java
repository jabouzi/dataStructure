package com.skanderjabouzi;

public class MazePoint {
    public int row;
    public int column;

    public MazePoint(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", row, column);
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof MazePoint) && (((MazePoint) o).row == this.row) && (((MazePoint) o).column == this.column)) {
            return true;
        } else {
            return false;
        }
    }
}
