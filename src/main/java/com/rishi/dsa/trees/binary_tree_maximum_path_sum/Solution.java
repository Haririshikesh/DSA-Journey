package com.rishi.dsa.trees.binary_tree_maximum_path_sum;

import java.util.*;

public class Solution {
    public int maxPathSum(TreeNode root) {
        if( root==null ) return 0;
        Stack<TreeNode> st = new Stack<>();
        Map<TreeNode, Integer> mp = new HashMap<>();
        int maxPath = Integer.MIN_VALUE;
        TreeNode curr = root;
        TreeNode lastVisited = null;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                TreeNode peekNode = st.peek();
                if(peekNode.right!=null && peekNode.right != lastVisited){
                    curr = peekNode.right;
                }
                else{
                    st.pop();
                    int leftGain = Math.max(0,mp.getOrDefault(peekNode.left, 0));
                    int rightGain = Math.max(0,mp.getOrDefault(peekNode.right, 0));
                    mp.put(peekNode, peekNode.val + Math.max(leftGain,rightGain));
                    maxPath = Math.max(maxPath, peekNode.val +leftGain+rightGain);
                    lastVisited = peekNode;
                }
            }
        }
        return maxPath;
    }
}