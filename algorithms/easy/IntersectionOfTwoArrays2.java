package com.yuyu.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chenyuyu on 16/10/3.
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2){
        if(nums1 == null || nums2 == null){
            return null;
        }
        else{
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int length1 = nums1.length;
            int length2 = nums2.length;
            ArrayList<Integer> intersection = new ArrayList<>();
            for(int scale1 = 0, scale2 = 0; scale1 < length1 && scale2 < length2; ){
                if(nums1[scale1] == nums2[scale2]){
                    intersection.add(nums1[scale1]);
                    scale1++;
                    scale2++;
                }
                else if (nums1[scale1] > nums2[scale2]){
                    scale2++;
                }
                else{
                    scale1++;
                }
            }
            int[] ints = new int[intersection.size()];
            int i = 0;
            for (Integer n : intersection){
                ints[i++] = n;
            }
            return ints;
        }
    }
    public static void main(String[] args){
        IntersectionOfTwoArrays2 iOTA = new IntersectionOfTwoArrays2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = iOTA.intersect(nums1,nums2);
        System.out.print(result[1]);
    }
}
