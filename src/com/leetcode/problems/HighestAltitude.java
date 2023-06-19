/**
 * Leetcode 1732 Find the highest altitude
 */
package com.leetcode.problems;

public class HighestAltitude {

    public int largestAltitude(int[] gain) {

        int maxGain = 0;
        int currGain = 0;

        for (int i : gain) {
            currGain += i;
            if (currGain > maxGain)
                maxGain = currGain;
        }
        return maxGain;

    }

    public static void main(String[] args) {
        HighestAltitude highestAltitude = new HighestAltitude();
        int[] gain = new int[]{-5, 1, 5, 0, -7};
        System.out.println(highestAltitude.largestAltitude(gain));

        gain = new int[]{-4, -3, -2, -1, 4, 3, 2};
        System.out.println(highestAltitude.largestAltitude(gain));


    }
}
