/**
 * Leetcode 111: Minimum depth of binary tree recursive solution
 */
package com.leetcode.problems;

import static java.lang.Math.min;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);

        return 1 + min(minDepth(root.right), minDepth(root.left));
    }
}


