package com.yuyu.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenyuyu on 16/10/8.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String,Integer> romanToval = new HashMap<>();
        romanToval.put("I",1);
        romanToval.put("IV",4);
        romanToval.put("V",5);
        romanToval.put("IX",9);
        romanToval.put("X",10);
        romanToval.put("XL",40);
        romanToval.put("L",50);
        romanToval.put("XC",90);
        romanToval.put("C",100);
        romanToval.put("CD",400);
        romanToval.put("D",500);
        romanToval.put("CM",900);
        romanToval.put("M",1000);

        int intVal = 0;
        if(s.length() == 1){
            intVal = romanToval.get(s);
        }
        else {
            for (int scale = 0; scale < s.length(); ) {
                if (scale + 1 >= s.length()) {
                    intVal += romanToval.get(s.substring(scale, scale+1));
                    scale++;
                }
                else if(romanToval.get(s.substring(scale, scale + 1)) >= romanToval.get(s.substring(scale+1,scale+2))){
                    intVal += romanToval.get(s.substring(scale,scale+1));
                    scale++;
                }
                else{
                    if(romanToval.containsKey(s.substring(scale, scale + 2))){
                        intVal += romanToval.get(s.substring(scale, scale + 2));
                        scale += 2;
                    }
                }
            }
        }
        return intVal;
    }

    public static void main(String[] args){
        RomanToInteger test = new RomanToInteger();
        int result = test.romanToInt("VI");
        System.out.print(result);
    }
}
