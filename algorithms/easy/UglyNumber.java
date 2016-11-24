package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/9.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num == 0){
            return false;
        }
        int tmp = num;
        while(tmp != 1){
            if(tmp % 3 != 0 && tmp % 5 != 0 && tmp % 2 != 0){
                return false;
            }
            else if (tmp % 5 == 0){
                tmp /= 5;
                continue;
            }
            else if (tmp % 3 == 0){
                tmp /= 3;
                continue;
            }
            else if (tmp % 2 == 0){
                tmp /= 2;
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args){
        UglyNumber uglyNumber = new UglyNumber();
        System.out.print(uglyNumber.isUgly(1));
    }
}
