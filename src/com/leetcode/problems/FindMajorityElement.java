/**
 * Leetcode : 229 Majority element
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();

        var n = nums.length;
        var threshHold = n / 3;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > threshHold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
