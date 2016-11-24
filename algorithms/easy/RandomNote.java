package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/9/29.
 */
public class RandomNote {
    public boolean canConstruct(String randomNote, String magazine){
        int[] alphaNumOfRandonNote = new int[26];
        for(int index = 0; index < randomNote.length();index++){
            alphaNumOfRandonNote[(int)randomNote.charAt(index) - 97]++;
        }
        int[] alphaNumOfMagazine = new int[26];
        for(int index = 0; index < magazine.length();index++){
            alphaNumOfMagazine[(int)magazine.charAt(index) - 97]++;
        }

        for(int index = 0; index <26;index++){
            if(alphaNumOfRandonNote[index] > alphaNumOfMagazine[index]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] agrs){
        RandomNote randomNote = new RandomNote();
        Boolean result = randomNote.canConstruct("aaa","aabbcc");
        System.out.print(result);
    }
}
