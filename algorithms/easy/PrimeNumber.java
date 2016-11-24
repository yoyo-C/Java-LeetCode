package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/7/19.
 */
public class PrimeNumber {
    public static void main(String[] args){
        int[] nums = new int[10001];
        nums[0] = 1;
        nums[1] = 1;
        int count = 1;
        int index = -1;
        for(int num : nums){
            index++;
            if(num == 0){
                int multiplier = 2;
                int sum = index * multiplier;
                while(sum < 10001){
                    count++;
                    nums[sum] = 1;
                    multiplier++;
                    sum = index * multiplier;
                }
            }
        }
            int[] primeNum = new int[count];
            index = -1;
            for (int num : nums){
                index++;
                int i = 0;
                if(num == 0){
                    primeNum[i] = index;
                    i++;
                    System.out.println(index);
                }
            }
    }
}
