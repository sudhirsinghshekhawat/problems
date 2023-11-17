package com.leetcode.problems;

public class MinimizeMaxSumOfArray {

    public int minPairSum(int[] nums) {

        int[] freqency = new int[100001];
        int maxSum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;


        for (int num : nums) {
            freqency[num]++;
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        int low = minNum;
        int high = maxNum;

        while (low <= high) {
            if (freqency[low] == 0)
                low++;
            else if (freqency[high] == 0)
                high--;
            else {
                int currentSum = low + high;
                maxSum = Math.max(maxSum, currentSum);
                freqency[low]--;
                freqency[high]--;
            }

        }
        return maxSum;
    }


}
