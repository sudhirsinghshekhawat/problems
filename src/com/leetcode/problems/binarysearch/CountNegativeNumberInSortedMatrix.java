package com.leetcode.problems.binarysearch;

public class CountNegativeNumberInSortedMatrix {

    public int countNegativeNumbersInSortedMatrix(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;

        int i = rows - 1;
        int j = 0;
        int count = 0;

        while (i >= 0 && j < columns) {
            if (grid[i][j] < 0) {
                count += columns - j;
                i--;
            } else {
                j++;
            }

        }
        return count;

    }


    public static void main(String[] args) {

        CountNegativeNumberInSortedMatrix cx = new CountNegativeNumberInSortedMatrix();

        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(8 == cx.countNegativeNumbersInSortedMatrix(grid));

        grid = new int[][]{{3, 2}, {1, 0}};
        System.out.println(0 == cx.countNegativeNumbersInSortedMatrix(grid));
    }
}
