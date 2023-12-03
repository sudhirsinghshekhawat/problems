package com.eductive.grokking75.binarytree;

class Print {
    public static String twoDArrayToString(int[][] arr) {

        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append("[");
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
                if (j < arr[i].length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
