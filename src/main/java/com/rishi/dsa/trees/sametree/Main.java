package com.rishi.dsa.trees.sametree;

/*
 * PROBLEM: 100. SAME TREE
 * LINK: https://leetcode.com/problems/same-tree/
 * =================================================================================================
 * I. PROBLEM OVERVIEW
 * =================================================================================================
 * We are given the roots of two binary trees, 'p' and 'q'. To be "the same," they must be:
 * 1. Structurally identical (same shape).
 * 2. Value identical (same data in the same positions).
 * *
 * =================================================================================================
 * II. THE APPROACH: RECURSIVE DFS
 * =================================================================================================
 * We use a Depth-First Search approach. Since a tree is a recursive structure, we compare
 * the current nodes and then recursively ask the function to check their children.
 * * THE LOGIC:
 * 1. BASE CASE (SUCCESS): If both p and q are null, we reached the end of both branches. Return true.
 * 2. BASE CASE (FAILURE):
 * - If one is null and the other isn't -> Structural mismatch.
 * - If p.val != q.val -> Value mismatch.
 * Return false.
 * 3. RECURSION: Check (Left-of-P vs Left-of-Q) AND (Right-of-P vs Right-of-Q).
 * * =================================================================================================
 * III. WHY THIS APPROACH?
 * =================================================================================================
 * Why not Iteration? Iteration requires manually managing a Queue or Stack of node pairs.
 * While it avoids stack overflow on extremely deep trees, it is much more verbose.
 * Recursion is the "cleanest" way to express tree traversals.
 * * =================================================================================================
 * IV. COMPLEXITY ANALYSIS
 * =================================================================================================
 * TIME COMPLEXITY: O(N)
 * - We visit each node once. N is the number of nodes in the smaller tree.
 * * SPACE COMPLEXITY: O(H)
 * - H is the height of the tree. This is the space used by the "Recursion Stack."
 * - Balanced Tree: O(log N)
 * - Skewed Tree (Worst Case): O(N)
 *
 * =================================================================================================
 */


// Only this class can be public in Main.java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Identical Trees
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Test Case 1 (Identical): " + solution.isSameTree(p1, q1));

        // Example 2: Structural Difference
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Test Case 2 (Structural Diff): " + solution.isSameTree(p2, q2));

        // Example 3: Value Difference
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println("Test Case 3 (Value Diff): " + solution.isSameTree(p3, q3));

        // Example 4: Both Null
        System.out.println("Test Case 4 (Both Null): " + solution.isSameTree(null, null));
    }
}