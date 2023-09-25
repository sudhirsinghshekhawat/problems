package com.leetcode.problems;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUniqueNumberInTheList {

    public List<Integer> uniqueNoInTheList(int[] nums) {

        List<Integer> uniqueList = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int current = nums[i];
            int count = 0;

            while (i < n && current == nums[i]) {
                count++;
                i++;
            }
            if (count == 1)
                uniqueList.add(current);

        }
        return uniqueList;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 10, -4, 2, 7, 8, -2, 98, 10, 8, 2};
        Integer[] result = new Integer[]{1, -4, 7, -2, 98};

        FindUniqueNumberInTheList find = new FindUniqueNumberInTheList();
        List<Integer> resultList = find.uniqueNoInTheList(nums);
        Integer[] resultArray = resultList.toArray(new Integer[0]);

        System.out.println(Arrays.toString(resultArray));



    }

}
