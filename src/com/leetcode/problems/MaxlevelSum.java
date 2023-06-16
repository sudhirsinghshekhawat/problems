package com.leetcode.problems;


import java.util.LinkedList;
import java.util.Queue;


/**
 * Leetcode 1161 maxlevel sum
 */
public class MaxlevelSum {

    public int maxLevelSum(TreeNode root) {

        if (root == null) return 0;

        var level = 1;
        var currentSum = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        var max_sum = root.val;
        var max_level = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                currentSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);

            } else {
                if (!queue.isEmpty()) queue.add(null);
                if (currentSum > max_sum) {
                    max_sum = currentSum;
                    max_level = level;
                }
                currentSum = 0;
                level += 1;
            }
        }

        return max_level;
    }
}
