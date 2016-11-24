package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/28.
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] numOf1 = new int[num + 1];

        for (int i = 0; i <= num; i++){
            while(numOf1[i] == 0){
                if (i == 0){
                    numOf1[i] = 0;
                    break;
                }
                else if (i == 1){
                    numOf1[i] = 1;
                }
                else if (i % 2 == 0){
                    int tmp = i;
                    if (tmp == num){
                        numOf1[tmp] = numOf1[tmp / 2];
                    }
                    while(tmp < num){
                        numOf1[tmp] = numOf1[tmp / 2];
                        numOf1[tmp + 1] = numOf1[tmp / 2] + 1;
                        tmp = tmp * 2;
                    }
                }
            }
        }
        return numOf1;
    }
}
