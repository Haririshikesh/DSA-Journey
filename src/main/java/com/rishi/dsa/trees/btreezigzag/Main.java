package com.rishi.dsa.trees.btreezigzag;

import java.util.*;

// 1. Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public static void main(String[] args) {
        /* Constructing the following tree:
                  3
                 / \
                9  20
                  /  \
                 15   7
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.zigzagLevelOrder(root);

        // Printing the result
        System.out.println("ZigZag Traversal Output:");
        System.out.println(result);
    }
}