package com.leetcode.problems;

/**
 * median of 2 sorted array with extra space and not extra space
 * Leetcode 2387
 */
public class MedianOfTwoSortedArray {
    public double medianOfTwoSortedArrayWithExtraSpace(int[] arr1, int[] arr2) {
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        int[] mergedArray = new int[arr1Size + arr2Size];

        int i = 0, j = 0, k = 0;

        while (i < arr1Size && j < arr2Size) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1Size) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2Size) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        int totalSize = arr1Size + arr2Size;
        int mid = totalSize / 2;
        if (totalSize % 2 == 0)
            return (double) (mergedArray[mid] + mergedArray[mid - 1]) / 2;
        else
            return (double) mergedArray[mid];
    }

    public double medianOfTwoSortedArrayWithoutExtraSpace(int[] arr1, int[] arr2, int n) {
        int i = 0, j = 0, count = 0;
        int middle1 = 0, middle2 = 0;

        while (count <= n) {
            if (arr1[i] <= arr2[j]) {
                middle1 = middle2;
                middle2 = arr1[i];
                i++;
            } else {
                middle1 = middle2;
                middle2 = arr2[j];
                j++;
            }
            if (i == n) {
                middle1 = middle2;
                middle2 = arr2[0];
                break;
            } else if (j == n) {
                middle1 = middle2;
                middle2 = arr1[0];
                break;
            }
            count++;
        }
        return (double) (middle1 + middle2) / 2;


    }

    public static void main(String[] args) {
        MedianOfTwoSortedArray median = new MedianOfTwoSortedArray();

        int[] arr1 = new int[]{1, 3, 6};
        int[] arr2 = new int[]{2, 8, 12};
//        System.out.println(median.medianOfTwoSortedArrayWithExtraSpace(arr1, arr2));
//        System.out.println(median.medianOfTwoSortedArrayWithoutExtraSpace(arr1, arr2, arr1.length));
//
//        arr1 = new int[]{1, 3, 4, 6, 9};
//        arr2 = new int[]{2, 5, 7, 8, 10};
//        System.out.println(median.medianOfTwoSortedArrayWithExtraSpace(arr1, arr2));
//        System.out.println(median.medianOfTwoSortedArrayWithoutExtraSpace(arr1, arr2, arr1.length));


        arr1 = new int[]{};
        arr2 = new int[]{1};
        System.out.println(median.medianOfTwoSortedArrayWithExtraSpace(arr1, arr2));


    }
}
