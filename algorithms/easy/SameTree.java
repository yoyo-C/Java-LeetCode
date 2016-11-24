package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/8.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && p.val == q.val){
            return true;
        }
        return false;
    }
}

class TreeNode2 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode2(int x) {
        val = x;}
}

