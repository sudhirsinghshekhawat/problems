package com.leetcode.problems;

/*
 * Example 1
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is
 * not allowed because you must buy before you sell.
 *
 *
 * Example 2
 *Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit max = new MaxProfit();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = max.maxProfit(prices);
        System.out.println("maxprofit = " + maxProfit);

        System.out.println("------------");
        prices = new int[]{7, 6, 4, 3, 1};
        maxProfit = max.maxProfit(prices);
        System.out.println("maxprofit = " + maxProfit);
    }


}
