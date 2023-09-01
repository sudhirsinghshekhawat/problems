package com.leetcode.problems;

import java.util.Arrays;
import java.util.Collection;

public class CountNoOfBits {

    public int[] countBits(int n) {

        int[] dp = new int[n + 1];
        int sub = 1;
        for (int i = 1; i <= n; i++) {
            if (sub * 2 == i)
                sub = i;
            dp[i] = dp[i - sub] + 1;
        }
        return dp;
    }

    public static void main(String[] args) {
        CountNoOfBits cn = new CountNoOfBits();
        System.out.println(Arrays.toString(cn.countBits(2)));

    }

}
