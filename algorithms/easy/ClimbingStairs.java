package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/11.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int result = 2;
        for (int i = 3, n1 = 1; i <= n; i++) {
            int tmp = n1 + result;
            n1 = result;
            result = tmp;
        }
        return result;
    }
    public static void main(String[] args){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.print(climbingStairs.climbStairs(4));
    }
}
