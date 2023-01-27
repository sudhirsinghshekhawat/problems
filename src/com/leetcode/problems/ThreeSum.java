package com.leetcode.problems;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        var sums = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {

                sums = nums[i] + nums[left] + nums[right];
                if (sums == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sums > 0) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(array);
        System.out.println(result);

        array = new int[]{0, 1, 1};
        result = threeSum.threeSum(array);
        System.out.println(result);
    }
}
