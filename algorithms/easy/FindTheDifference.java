package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t){
        int sum = 0;
        for (int index = 0; index < s.length(); index++){
            sum += (int)(t.charAt(index));
            sum -= (int)(s.charAt(index));
        };

        sum += (int)(t.charAt(t.length()-1));
        return (char)sum;
    }


    public static void main(String[] args){
        FindTheDifference findTheDifference = new FindTheDifference();
        String s = "qwer";
        String t = "qwere";
        char result = findTheDifference.findTheDifference(s,t);

        System.out.print(result);
    }
}
