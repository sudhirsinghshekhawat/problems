package com.leetcode.problems;

import java.util.Stack;

public class IsValidParenthesis {

    public boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (Character parenthesis : charArray) {
            if (parenthesis == '(' || parenthesis == '{' || parenthesis == '[') {
                stack.push(parenthesis);
            } else if (stack.empty()) {
                return false;
            } else if ((parenthesis == ')' && stack.pop() != '(') ||
                    (parenthesis == '}' && stack.pop() != '{') ||
                    (parenthesis == ']' && stack.pop() != '[')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
