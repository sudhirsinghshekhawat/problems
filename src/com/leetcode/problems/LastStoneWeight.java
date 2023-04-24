/**
 * Leetcode 1046
 * heaviest stones problem
 * stones = [2,7,4,1,8,1] output: 1
 * stones = [1] output : 1
 * test class : LastStoneWeightTest
 */

package com.leetcode.problems;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones)
            pq.offer(stone);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
}
