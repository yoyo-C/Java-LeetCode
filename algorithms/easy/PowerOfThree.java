package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/8.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        else if((int)(Math.log10(n) / Math.log10(3)) == Math.log10(n) / Math.log10(3)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        PowerOfThree test = new PowerOfThree();
        boolean result = test.isPowerOfThree(0);
        System.out.print(result);
    }
}
