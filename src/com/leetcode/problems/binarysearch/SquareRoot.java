package com.leetcode.problems.binarysearch;

public class SquareRoot {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x / mid == mid)
                return mid;
            else if (x / mid < mid)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }

        }
        return ans;
    }

    public static void main(String[] args) {

        SquareRoot squareRoot = new SquareRoot();
        System.out.println(46339 == squareRoot.mySqrt(2147395599));
        System.out.println(2 == squareRoot.mySqrt(4));
        System.out.println(3 == squareRoot.mySqrt(15));
        System.out.println(9 == squareRoot.mySqrt(99));


    }
}
