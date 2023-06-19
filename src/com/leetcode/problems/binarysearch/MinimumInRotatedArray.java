/**
 * Leetcode 153
 * Binary Search | Find the minimum in rotated array
 */

package com.leetcode.problems.binarysearch;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[right];
    }

    public static void main(String[] args) {

        MinimumInRotatedArray minimum = new MinimumInRotatedArray();

        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(1 == minimum.findMin(nums));

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(0 == minimum.findMin(nums));

        nums = new int[]{11, 13, 15, 17};
        System.out.println(11 == minimum.findMin(nums));

    }


}
