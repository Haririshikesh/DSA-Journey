package com.rishi.dsa.trees.btreezigzag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean revFlag = false;
        while(!q.isEmpty()){
            int levels = q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i=0; i<levels; i++){
                TreeNode curr = q.poll();
                if(revFlag){
                    ls.add(curr.val);
                } else {
                    ls.addFirst(curr.val);
                    revFlag =  true;
                }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            res.add(ls);
        }
        return res;
    }
}