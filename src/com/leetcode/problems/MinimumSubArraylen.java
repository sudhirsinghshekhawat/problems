package com.leetcode.problems;

/**
 * @author sudhir
 * Leetcode 209 Minimum size subarray sum
 */
public class MinimumSubArraylen {

    public int minSubArrayLen(int target, int[] nums) {
        int end = 0;
        int start = 0;
        int minSize = Integer.MAX_VALUE;
        int total = 0;

        while (end < nums.length) {
            total += nums[end];
            while (total >= target) {
                if (minSize > (end - start + 1))
                    minSize = end - start + 1;
                total -= nums[start];
                start += 1;
            }
            end += 1;
        }
        if (minSize == Integer.MAX_VALUE)
            return 0;
        return minSize;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;

        MinimumSubArraylen min = new MinimumSubArraylen();
        System.out.println(min.minSubArrayLen(target,arr));


    }
}
