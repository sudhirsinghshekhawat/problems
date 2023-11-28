package com.eductive.grokking75.basicdatastructure;

import java.util.Stack;

public class RectangleInHistogram {

    public static int largestRectangle(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {

            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {

                int currentHeight = heights[stack.pop()];
                int rightBondary = i;
                int leftBoundary = stack.peek();
                int currentWidth = rightBondary - leftBoundary - 1;
                int currentArea = currentWidth * currentHeight;
                maxArea = Math.max(currentArea, maxArea);
            }
            stack.push(i);
        }

        int n = heights.length;

        while (stack.peek() != -1) {
            int currentHeight = heights[stack.pop()];

            int leftBoundary = stack.peek();
            int currentWidth = n - leftBoundary - 1;

            int currentArea = currentHeight * currentWidth;

            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }
}
