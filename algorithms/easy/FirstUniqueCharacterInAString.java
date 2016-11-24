package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/29.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s){
        for(int index = 0; index < s.length(); index++){
            for(int scale = 0; scale < s.length(); scale++){
                if(scale != index && s.charAt(scale) == s.charAt(index)){
                    break;
                }
                if(scale == s.length() - 1){
                    return index;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        FirstUniqueCharacterInAString test = new FirstUniqueCharacterInAString();
        int result = test.firstUniqChar("loveleetcode");
        System.out.print(result);
    }
}
