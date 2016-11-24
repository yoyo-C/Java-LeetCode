package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/9.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num == 0){
            return false;
        }
        else if((int)(Math.log10(num) /Math.log10(4)) == Math.log10(num) /Math.log10(4)){
            return true;
        }
        else{
            return false;
        }
    }
}
