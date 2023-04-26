/**
 * Leetcode 258
 * AddDigits Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * {input, output}
 * {11, 2},
 * {65, 2},
 * {36, 9}
 */
package com.leetcode.problems;


public class AddDigits {

    public int addDigits(int num) {

        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }

    public int addDigitsRecursive(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum < 10) return sum;
        else return addDigitsRecursive(sum);

    }
}
