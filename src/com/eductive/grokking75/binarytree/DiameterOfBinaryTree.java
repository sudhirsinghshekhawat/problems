package com.eductive.grokking75.binarytree;


import com.sun.source.tree.Tree;

import java.util.IllegalFormatCodePointException;

public class DiameterOfBinaryTree {

    public static int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }


    public static int heightOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        return (1 + Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)));
    }


}
