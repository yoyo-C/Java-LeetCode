package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class ReverseString {
    public String reverseString(String s) {
        int lengthofS = s.length();
        char[] reversedS = new char[lengthofS];
        for (int i = 0; i < lengthofS; i++){
            reversedS[i] = s.charAt(lengthofS - 1 - i);
        }
        return String.valueOf(reversedS);

    }
}
