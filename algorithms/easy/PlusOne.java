package com.yuyu.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * Created by chenyuyu on 16/10/19.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        int len = digits.length;
        if(digits[len - 1] != 9){
            digits[len - 1]++;
            return digits;
        }
        int count9 = 0;
        for(int a : digits){
            if(a == 9){
                count9++;
            }
        }
        if(count9 == len){
            int[] result = new int[len+1];
            result[0] = 1;
            return result;
        }
        int carry = 1;
        for(int i = len - 1; i >= 0; i--){

            if(digits[i] == 9){
                if(carry != 0){
                    digits[i] = 0;
                    carry = 1;
                }
            }
            else{
                if(carry ==1){
                    digits[i]++;
                    carry = 0;
                }
            }
        }
        return digits;
    }
    public static void main(String[] args){
        PlusOne test = new PlusOne();
        int[] a = {9,9};
        int[] result = test.plusOne(a);
        for(int b : result){
            System.out.print(b);

        }
    }
}
