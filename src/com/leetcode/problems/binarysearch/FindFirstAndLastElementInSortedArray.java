/**
 * Leetcode 436 Find First and last position in Sorted Array
 */

package com.leetcode.problems.binarysearch;

import java.util.Arrays;

public class FindFirstAndLastElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        if (nums == null)
            return new int[]{-1, -1};
        var left = binarySearch(nums, target, true);
        var right = binarySearch(nums, target, false);

        return new int[]{left, right};
    }

    public int binarySearch(int[] nums, int target, boolean isFirst) {

        var left = 0;
        var right = nums.length - 1;
        var index = -1;

        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;

        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;

        FindFirstAndLastElementInSortedArray fx =
                new FindFirstAndLastElementInSortedArray();

        System.out.println(Arrays.toString(fx.searchRange(nums, target)));
        System.out.println(Arrays.equals(new int[]{3, 4}, fx.searchRange(nums, target)));

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 6;
        System.out.println(Arrays.equals(new int[]{-1, -1}, fx.searchRange(nums, target)));

        nums = new int[]{};
        target = 0;
        System.out.println(Arrays.equals(new int[]{-1, -1}, fx.searchRange(nums, target)));


    }
}
