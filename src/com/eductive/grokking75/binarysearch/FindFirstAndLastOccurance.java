package com.eductive.grokking75.binarysearch;

public class FindFirstAndLastOccurance {
    public static int firstOccurance(int[] arr, int x, int n) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] > x)
                high = mid - 1;

            else if (arr[mid] < x)
                low = mid + 1;
            else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }


    public static int lastOccurance(int[] arr, int x, int n) {

        int low = 0, high = n - 1, res = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        System.out.println("First Occurrence = "
                + firstOccurance(arr, x, n));
        System.out.println("Last Occurrence = "
                + lastOccurance(arr, x, n));

        x = 2;
        System.out.println("First Occurrence = "
                + firstOccurance(arr, x, n));
        System.out.println("Last Occurrence = "
                + lastOccurance(arr, x, n));
    }


}
