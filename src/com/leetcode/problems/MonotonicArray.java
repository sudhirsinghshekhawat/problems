package com.leetcode.problems;

import org.junit.Assert;

public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        if (nums.length < 2)
            return true;

        var direction = 0; // increasing  = 1 , decreasing = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (direction == 0)
                    direction = 1;
                else if (direction == -1)
                    return false;
            } else if (nums[i] < nums[i - 1]) {
                if (direction == 0)
                    direction = -1;
                else if (direction == 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3};
        boolean output = true;

        MonotonicArray monotonicArray = new MonotonicArray();
        Assert.assertTrue("condition is true", monotonicArray.isMonotonic(nums));


        nums = new int[]{6, 5, 4, 4};
        output = true;
        Assert.assertTrue("condition is true", monotonicArray.isMonotonic(nums));


        nums = new int[]{1, 3, 2};
        output = false;
        Assert.assertFalse("condition is false", monotonicArray.isMonotonic(nums));


    }


}
