package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0){
            return num;
        }
        else if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
}
