/*
Leetcode problem : 71 Simplify path
test file : SimplifyPathTest
Testcases:
{"input", "output"}
{"/home/", "/home"}
{"/../", "/"}
{"/home//foo/", "/home/foo"}
 */

package com.leetcode.problems;

import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pathStrings = path.split("/");
        for (String s : pathStrings) {
            if (s.isEmpty())
                continue;
            if (s.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!s.equals("..") && !s.equals(".")) {
                stack.push(s);
            }
        }

        if (stack.isEmpty())
            return "/";

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop()).insert(0, "/");
        }
        return sb.toString();
    }

}
