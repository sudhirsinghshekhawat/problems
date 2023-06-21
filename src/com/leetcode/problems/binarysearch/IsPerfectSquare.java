/*
 *
 * Leetcode A perfect Square problem
 */
package com.leetcode.problems.binarysearch;

public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;

        int lower = 1;
        int higher = num;


        while (lower <= higher) {

            long mid = lower + (higher - lower) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                higher = (int) mid - 1;
            } else {
                lower = (int) mid + 1;
            }
        }
        return false;
    }
}

