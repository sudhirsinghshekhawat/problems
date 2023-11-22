package com.eductive.grokking75.twopointers;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int leftProduct = 1;
        int rightProduct = 1;

        int l = 0, r = n - 1;

        while (l < n && r >= 0) {
            result[l] *= leftProduct;
            result[r] *= rightProduct;

            leftProduct *= nums[l];
            rightProduct *= nums[r];

            l++;
            r--;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = ProductExceptSelf.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
