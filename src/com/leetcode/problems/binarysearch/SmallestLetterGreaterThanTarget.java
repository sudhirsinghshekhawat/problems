package com.leetcode.problems.binarysearch;

/**
 * Leetcode 744 Find smallest letter greater than target
 */
public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {

        var left = 0;
        var right = letters.length - 1;

        if (letters[0] > target)
            return letters[0];
        else if (target >= letters[right])
            return letters[0];


        char ans = 0;

        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                ans = letters[mid];
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }
}


