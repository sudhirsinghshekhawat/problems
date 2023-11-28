package com.eductive.grokking75.basicdatastructure;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    //{}
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (!hashMap.containsKey(ch))
                stack.push(ch);
            else {
                Character poppedElement = stack.isEmpty() ? '*' : stack.pop();
                if (hashMap.get(ch) != poppedElement)
                    return false;
            }
        }

        return stack.isEmpty();
    }


}
