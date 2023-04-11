/*
Leetcode : 2390  Removing stars from String
Test file : RemovingStartFromStringTest
Test cases:
input = "leet**cod*e" output =  "lecoe"
input = "erase*******",output =  ""
 */
package com.leetcode.problems;

import java.util.Stack;

public class RemovingStarFromString {

    public String removingStrasFromString(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character c : characters) {
            if (c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty())
            return "";
        else {
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }


    public String removingStarsFromString_1(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        RemovingStarFromString rm = new RemovingStarFromString();
        System.out.println(rm.removingStrasFromString(s));

        s = "erase*******";
        System.out.println(rm.removingStarsFromString_1(s));

    }
}
