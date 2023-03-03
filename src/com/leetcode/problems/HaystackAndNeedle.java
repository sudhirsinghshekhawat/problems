package com.leetcode.problems;


/*Leetcode : 29
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class HaystackAndNeedle {

    public int strStr(String hayStack, String needle) {

        int hayStackLength = hayStack.length();
        int needleLength = needle.length();

        if (hayStackLength < needleLength) {
            return -1;
        }

        for (int i = 0; i <= hayStackLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && hayStack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needleLength)
                return i;

        }
        return -1;
    }

}
