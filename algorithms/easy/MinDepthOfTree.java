package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/8.
 */
public class MinDepthOfTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else if(root.right == null && root.left == null){
            return 1;
        }
        else if(root.right == null){
            return minDepth(root.left) + 1;
        }
        else if(root.left == null){
            return minDepth(root.right) + 1;
        }
        return minDepth(root.right) < minDepth(root.left)? minDepth(root.right)+ 1: minDepth(root.left)+1;
    }
}
