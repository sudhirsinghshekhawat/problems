package com.eductive.grokking75.twopointers;

public class ReverseAnArray {

    public static int[] reverseAnArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;

        int right = nums.length - 1;
        int left = 0;

        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

}
