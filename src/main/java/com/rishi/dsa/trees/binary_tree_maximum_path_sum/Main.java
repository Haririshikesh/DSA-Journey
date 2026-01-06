// package com.rishi.dsa.trees.binary_tree_maximum_path_sum;
package com.rishi.dsa.trees.binary_tree_maximum_path_sum;

/*
 * PROBLEM: Binary Tree Maximum Path Sum
 * LEETCODE LINK: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * * =====================================================================================================================
 * 1. PROBLEM DESCRIPTION
 * =====================================================================================================================
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge
 * connecting them. A node can only appear in the sequence at most once. Note that the path does not need to
 * pass through the root.
 * * The path sum of a path is the sum of the node's values in the path.
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * * =====================================================================================================================
 * 2. HOW TO APPROACH (THE LOGIC)
 * =====================================================================================================================
 * We use a Depth First Search (DFS) / Recursive approach. The core idea is that for every node, we need to find
 * the maximum contribution it can get from its left and right subtrees.
 * * For each node 'u', there are two values we track:
 * * A) THE MAX GAIN (RETURN VALUE):
 * This is the maximum path sum starting from node 'u' and going down into one of its subtrees.
 * Since we can only extend a path in one direction to the parent, we can only take ONE child's path.
 * Formula: node.val + max(0, max(leftGain, rightGain))
 * * B) THE TURNING POINT (GLOBAL MAXIMUM):
 * This is the sum if we consider the current node 'u' as the highest point (the vertex) of the path.
 * This path would include: (Left Child Gain + Current Node + Right Child Gain).
 * We update our global variable 'maxSum' with this value at every node.
 * * IMPORTANT: If a child's contribution is negative, we ignore it (treat it as 0) because adding a negative
 * number will only decrease our total path sum.
 * * =====================================================================================================================
 * 3. WHY THIS APPROACH? (AND WHY NOT OTHERS?)
 * =====================================================================================================================
 * - WHY DFS? Because a tree is a recursive structure. To know the max path sum at a parent, you MUST first know
 * the max path sums of its children. This "Bottom-Up" approach (Post-order traversal) is the only efficient way.
 * * - WHY NOT BRUTE FORCE? A brute force would involve finding the path sum between every possible pair of nodes.
 * There are O(N^2) pairs of nodes, and finding the path between each would take O(N). This would result in O(N^3)
 * complexity, which is far too slow for a tree with 30,000 nodes.
 * * =====================================================================================================================
 * 4. TIME AND SPACE COMPLEXITY
 * =====================================================================================================================
 * * TIME COMPLEXITY: O(N)
 * - We visit every node in the binary tree exactly once during the DFS traversal.
 * - At each node, we perform a constant number of operations (comparisons and additions).
 * - Therefore, the total time is proportional to the number of nodes (N).
 * * SPACE COMPLEXITY: O(H)
 * - H is the height of the tree.
 * - This space is used by the implicit recursion stack.
 * - WORST CASE: O(N) if the tree is completely skewed (like a linked list).
 * - BEST CASE: O(log N) if the tree is perfectly balanced.
 * * =====================================================================================================================
 */

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [1,2,3]
        // Expected Output: 6 (Path: 2 -> 1 -> 3)
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        System.out.println("Test Case 1 (1,2,3): " + solution.maxPathSum(root1));

        // Example 2: root = [-10,9,20,null,null,15,7]
        // Expected Output: 42 (Path: 15 -> 20 -> 7)
        TreeNode root2 = new TreeNode(-10);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        System.out.println("Test Case 2 (-10, 9, 20...): " + solution.maxPathSum(root2));

        // Example 3: All negative nodes root = [-3]
        // Expected Output: -3
        TreeNode root3 = new TreeNode(-3);
        System.out.println("Test Case 3 (-3): " + solution.maxPathSum(root3));

        // Example 4: Mixed values root = [2, -1]
        // Expected Output: 2
        TreeNode root4 = new TreeNode(2);
        root4.left = new TreeNode(-1);
        System.out.println("Test Case 4 (2, -1): " + solution.maxPathSum(root4));
    }
}