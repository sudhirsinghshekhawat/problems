package com.leetcode.problems;

/*
Program for convert sorted array to BST.
Leetcode : 108  difficulty: easy
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConvertSortedArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    private TreeNode createBST(int[] nums, int l, int r) {

        if (l > r) {
            return null;
        }

        int mid = (l + r) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, l, mid - 1);
        root.right = createBST(nums, mid + 1, r);
        return root;
    }


}
