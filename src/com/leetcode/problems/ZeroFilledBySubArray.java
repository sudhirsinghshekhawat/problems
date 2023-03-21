package com.leetcode.problems;

/*
Leet code : 2348
Number of zeroes filled subarray
 */
public class ZeroFilledBySubArray {
    public long zeroFilledSubArray(int[] nums) {
        long zeroCount = 0;
        long ans = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                ans += getSum(zeroCount);
                zeroCount = 0;
            }
        }
        if (nums[nums.length - 1] == 0) {
            ans += getSum(zeroCount);
        }
        return ans;
    }

    private long getSum(long n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        ZeroFilledBySubArray zeroFilledBySubArray = new ZeroFilledBySubArray();
        long ans = zeroFilledBySubArray.zeroFilledSubArray(nums);
        System.out.println(ans);

    }

}

