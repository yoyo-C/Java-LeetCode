package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        int carry ;
        while(b != 0){
            carry = (a & b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}
