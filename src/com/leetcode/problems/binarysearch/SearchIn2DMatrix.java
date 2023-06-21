package com.leetcode.problems.binarysearch;

public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        int rows = matrix.length;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;

    }


    public static void main(String[] args) {

        SearchIn2DMatrix search = new SearchIn2DMatrix();
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(search.searchMatrix(matrix, target));


        matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        target = 13;
        System.out.println(!search.searchMatrix(matrix, target));


    }


}
