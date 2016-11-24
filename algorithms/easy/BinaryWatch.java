package com.yuyu.leetcode.algorithms.easy;

import java.util.*;

/**
 * Created by chenyuyu on 16/10/10.
 */
public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        if(num < 0 || num > 10){
            return null;
        }


        List<String> time = new ArrayList<>();
        for(int hour = 0; hour < 4 && hour <= num; hour++){
            int minute = num - hour;
            if(minute > 5){
                continue;
            }
            List<String> hours = new ArrayList<>();
            switch (hour){
                case 0:
                    hours.add("0");break;
                case 1:
                    hours.add("1");
                    hours.add("2");
                    hours.add("4");
                    hours.add("8");break;
                case 2:
                    hours.add("3");
                    hours.add("5");
                    hours.add("9");
                    hours.add("6");
                    hours.add("10");break;
                case 3:
                    hours.add("11");
                    hours.add("7");break;
            }

            List<String> minutes = new ArrayList<>();
            switch(minute){
                case 0:
                    minutes.add("00");break;
                case 1:
                    minutes.add("01");
                    minutes.add("02");
                    minutes.add("04");
                    minutes.add("08");
                    minutes.add("16");
                    minutes.add("32");break;
                case 2:
                    minutes.add("03");
                    minutes.add("05");
                    minutes.add("09");
                    minutes.add("17");
                    minutes.add("33");
                    minutes.add("06");
                    minutes.add("10");
                    minutes.add("18");
                    minutes.add("34");
                    minutes.add("12");
                    minutes.add("20");
                    minutes.add("36");
                    minutes.add("24");
                    minutes.add("40");
                    minutes.add("48");break;
                case 3:
                    minutes.add("07");
                    minutes.add("11");
                    minutes.add("19");
                    minutes.add("35");
                    minutes.add("56");
                    minutes.add("13");
                    minutes.add("21");
                    minutes.add("37");
                    minutes.add("25");
                    minutes.add("41");
                    minutes.add("49");
                    minutes.add("52");
                    minutes.add("14");
                    minutes.add("22");
                    minutes.add("38");
                    minutes.add("26");
                    minutes.add("42");
                    minutes.add("50");
                    minutes.add("28");
                    minutes.add("44");break;
                case 4:
                    minutes.add("58");
                    minutes.add("54");
                    minutes.add("46");
                    minutes.add("30");
                    minutes.add("57");
                    minutes.add("53");
                    minutes.add("45");
                    minutes.add("29");
                    minutes.add("43");
                    minutes.add("27");
                    minutes.add("39");
                    minutes.add("23");
                    minutes.add("15");
                    minutes.add("51");break;
                case 5:
                    minutes.add("59");
                    minutes.add("55");
                    minutes.add("47");
                    minutes.add("31");break;
            }
            for(int h = 0; h < hours.size();h++){
                for(int m = 0; m < minutes.size();m++){
                    time.add(hours.get(h) + ":" + minutes.get(m));
                }
            }
        }
        return time;
    }
    public static void main(String[] args){
        BinaryWatch binaryWatch = new BinaryWatch();
        System.out.println(binaryWatch.readBinaryWatch(1));
    }
}
