package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganiseString {

    public String reorganizeString(String s) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray())
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> maxHeap =
                new PriorityQueue<>((o1, o2) -> frequencyMap.get(o2) - frequencyMap.get(o1));
        maxHeap.addAll(frequencyMap.keySet());

        StringBuilder result = new StringBuilder();

        while (maxHeap.size() >= 2) {

            char c1 = maxHeap.poll();
            char c2 = maxHeap.poll();

            result.append(c1);
            result.append(c2);

            frequencyMap.put(c1, frequencyMap.get(c1) - 1);
            frequencyMap.put(c2, frequencyMap.get(c2) - 1);

            if (frequencyMap.get(c1) > 0)
                maxHeap.add(c1);
            if (frequencyMap.get(c2) > 0)
                maxHeap.add(c2);
        }
        if (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            if (frequencyMap.get(ch) > 1) return "";
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ReorganiseString reorganiseString = new ReorganiseString();
        String s1 = "aaab";

        System.out.println(reorganiseString.reorganizeString(s1));


    }
}
