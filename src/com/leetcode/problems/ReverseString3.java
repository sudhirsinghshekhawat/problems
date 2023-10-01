package com.leetcode.problems;

import org.junit.platform.commons.util.StringUtils;
import org.junit.rules.Stopwatch;

import java.util.Stack;

public class ReverseString3 {

    public String reverseWords(String s) {
        String[] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : splits) {
            StringBuilder interimSb = new StringBuilder(str);
            sb.append(interimSb.reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String reverseStringUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
        }

        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        ReverseString3 rs3 = new ReverseString3();
        long startTime = System.nanoTime();
        rs3.reverseWords(s);
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.nanoTime();
        rs3.reverseStringUsingStack(s);
        endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}


