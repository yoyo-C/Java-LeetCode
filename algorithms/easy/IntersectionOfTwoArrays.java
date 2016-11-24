package com.yuyu.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chenyuyu on 16/9/29.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2){
        if(nums1 == null || nums2 == null){
            return null;
        }
        else {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList<Integer> intersec = new ArrayList<>();
            int length1 = nums1.length;
            int length2 = nums2.length;
            for (int scale1 = 0,scale2 = 0; scale1 < length1 && scale2 < length2;){
                int tmpVal = nums1[scale1];
                if(nums1[scale1] == nums2[scale2]){
                    if(!intersec.contains(tmpVal)){
                        intersec.add(tmpVal);
                    }
                    scale1++;
                    scale2++;
                }
                else if(tmpVal > nums2[scale2]){
                    scale2++;
                }
                else{
                    scale1++;
                }
            }
            int[] ints = new int[intersec.size()];
            int i = 0;
            for (Integer n: intersec){
                ints[i++] = n;
            }

            return ints;
        }
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays iOTA = new IntersectionOfTwoArrays();
        int[] nums1 = {1,2,1,2};
        int[] nums2 = {2,2,1};
        int[] result = iOTA.intersection(nums1,nums2);
        System.out.print(result[0]);
    }
}
