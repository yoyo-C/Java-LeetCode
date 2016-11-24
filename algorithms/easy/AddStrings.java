package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/9.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        if(num1 == null && num2 == null){
            return null;
        }
        else if(num1 == null){
            return num2;
        }
        else if(num2 == null){
            return num1;
        }

        int length1 = num1.length();
        int length2 = num2.length();
        int length = length1 >= length2? length1:length2;

        while(num1.length() <= length){
            num1 = "0" + num1;
        }

        while(num2.length() <= length){
            num2 = "0" + num2;
        }

        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();

        int carry = 0;
        String[] result = new String[length + 1];
        for(int scale = length; scale >= 0; scale--){
            int sum = Integer.parseInt(String.valueOf(num1Char[scale])) + Integer.parseInt(String.valueOf(num2Char[scale])) + carry;
            carry = sum / 10;
            result[scale] = String.valueOf(sum % 10);
        }

        String resultS = "0";
        for(String s: result){
            resultS = resultS + s;
        }

        if(result[0].equals("0")) {
            resultS = resultS.substring(2);
        }
        else{
            resultS = resultS.substring(1);
        }

        return resultS;
    }

    public static void main(String[] args){
        AddStrings addStrings = new AddStrings();
        System.out.println(addStrings.addStrings("2","9"));
    }
}
