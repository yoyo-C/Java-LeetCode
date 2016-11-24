package com.yuyu.leetcode.algorithms.easy;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by chenyuyu on 16/11/17.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s){
        if(g == null || s == null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int glength = g.length;
        int slength = s.length;
        int length = glength > slength? glength: slength;
        int count = 0;
        for(int gg = 0, ss = 0; gg < glength && ss < slength; ){

        }

        return 1;

    }
}
