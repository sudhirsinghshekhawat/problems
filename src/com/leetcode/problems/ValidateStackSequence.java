/**
 * Leetcode : 946 Validate Stack sequence
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 */

package com.leetcode.problems;

import java.util.Stack;


public class ValidateStackSequence {

    public boolean validateStackSequence(int[] pushed, int[] popped) {

        if (pushed.length != popped.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int number : pushed) {
            stack.push(number);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
