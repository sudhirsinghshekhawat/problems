package com.leetcode.problems.binarysearch;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;

    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(2 == searchInsertPosition.searchInsertPosition(nums, target));


        nums = new int[]{1, 3, 5, 6};
        target = 2;
        System.out.println(1 == searchInsertPosition.searchInsertPosition(nums, target));

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        System.out.println(4 == searchInsertPosition.searchInsertPosition(nums, target));


    }
}

