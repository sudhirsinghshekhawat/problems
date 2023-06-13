package com.leetcode.problems.binarysearch;

public class Search {

    public int binarySearch(int[] nums, int target) {
        var left = 0;
        var right = nums.length;

        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
