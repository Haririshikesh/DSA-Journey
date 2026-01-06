package com.rishi.dsa.trees.sametree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p==null && q==null ) return true;
        if( p==null || q==null ) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}