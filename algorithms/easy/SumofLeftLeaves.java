package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class SumofLeftLeaves {
    public int sumofLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null){
            return sumofLeftLeaves(root.right) + root.left.val;
        }
        return sumofLeftLeaves(root.left) + sumofLeftLeaves(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
