package com.eductive.grokking75.twopointers;

public class TrappingRainWater {

    public static int rainWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int storedWater = 0;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            if (leftMax <= rightMax) {
                storedWater += Math.max(0, leftMax - height[left]);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            } else {
                storedWater += Math.max(0, rightMax - height[right]);
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }

        return storedWater;
    }
}
