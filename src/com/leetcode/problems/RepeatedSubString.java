package com.leetcode.problems;

public class RepeatedSubString {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            String subString = s.substring(0, i);
            StringBuilder repeated = new StringBuilder();
            for (int j = 0; j < n / i; j++) {
                repeated.append(subString);
            }
            if (repeated.toString().equals(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubString repeatedSubString = new RepeatedSubString();
        String s = "abcabcabcabc";
        boolean result = repeatedSubString.repeatedSubstringPattern(s);
        System.out.println(result);
    }
}
