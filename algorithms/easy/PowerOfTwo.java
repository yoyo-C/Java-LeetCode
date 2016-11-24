package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/8.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        else if((int)(Math.log10(n)/Math.log10(2)) == Math.log10(n)/Math.log10(2)){
            return true;
        }
        else{
            return false;
        }
    }
}
