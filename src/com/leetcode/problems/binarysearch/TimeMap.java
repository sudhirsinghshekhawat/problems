/**
 * Leetcode problem 981
 * Time based key value store
 */
package com.leetcode.problems.binarysearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.computeIfAbsent(key, k -> new TreeMap<Integer, String>());
        timeMap.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if (!timeMap.containsKey(key)) {
            return "";
        }
        Integer floorKey = timeMap.get(key).floorKey(timestamp);
        if (floorKey != null) {
            return timeMap.get(key).get(floorKey);
        }

        return "";
    }

}
