/**
 * Leetcode 33
 * Search in Rotated Array
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * <p>
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * <p>
 * Input: nums = [1], target = 0
 * Output: -1
 */

package com.leetcode.problems.binarysearch;

import java.lang.reflect.GenericDeclaration;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target <= nums[right] && nums[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SearchInRotatedArray search = new SearchInRotatedArray();

        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(4 == search.search(nums, target));

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 3;
        System.out.println(-1 == search.search(nums, target));

        nums = new int[]{1};
        target = 0;
        System.out.println(-1 == search.search(nums, target));


    }

}
