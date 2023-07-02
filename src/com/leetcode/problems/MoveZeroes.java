package com.leetcode.problems;


import java.util.Arrays;

/*
 * Given An Array of Integers with zero and non-zero.
 * Write a program to move all zero to end of the array
 * Problem can be asked with maintaining order and not maintaining order
 */
public class MoveZeroes {

    public void moveZeroesWithMaintainingOrder(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, j, i);
                j++;
            }
        }
    }

    public void moveZeroesWithoutMaintainingOrder(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] != 0)
                left++;
            while (arr[right] == 0)
                right--;
            arr[left] = arr[right];
            arr[right] = 0;
            left++;
            right--;
        }
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        MoveZeroes moveZeroes = new MoveZeroes();

        int[] arr = new int[]{1, 2, 3, 0, 0, 0, 1, 4, 5};

        moveZeroes.moveZeroesWithoutMaintainingOrder(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 0, 0, 0, 1, 4, 5};
        moveZeroes.moveZeroesWithMaintainingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }


}
