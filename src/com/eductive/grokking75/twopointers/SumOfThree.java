package com.eductive.grokking75.twopointers;

import java.util.Arrays;

public class SumOfThree {
    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int triplets = 0;

            while (low < high) {
                triplets = nums[i] + nums[low] + nums[high];

                if (triplets == target) {
                    return true;
                } else if (triplets < target)
                    low++;
                else
                    high--;
            }
        }
        return false;
    }
}
