package com.eductive.grokking75.twopointers;

public class ContainsMostWater {

    public static int containsMostWater(int[] heights) {
        int maxArea = 0;
        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            int width = end - start;
            maxArea = Math.max(maxArea, Math.min(heights[start], heights[end]) * width);
            if (heights[start] <= heights[end])
                start++;
            else
                end--;
        }
        return maxArea;
    }


}
