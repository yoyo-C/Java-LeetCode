package com.yuyu.leetcode.algorithms.easy;

/**
 * Created by chenyuyu on 16/10/11.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1){
            return 0;
        }
        int maxProfit = prices[1] - prices[0] > 0 ? prices[1] - prices[0]:0;
        int maxValue =prices[1];
        int minValue = prices[0];
        int min = prices[0];
        for(int indexX = 0; indexX < prices.length - 1; indexX++){
            int tmpmin = prices[indexX];
            int tmpmax = prices[indexX+1];

            int profit_min = tmpmax - min;
            int profit_tmpmin = tmpmax - tmpmin;

            if(profit_min > maxProfit && profit_min >= profit_tmpmin){
                maxProfit = profit_min;
                maxValue = tmpmax;
                minValue = tmpmin;
            }
            else if(profit_tmpmin > maxProfit && profit_tmpmin >= profit_min){
                maxProfit = profit_tmpmin;
                maxValue = tmpmax;
                minValue = tmpmin;
                min = tmpmin;
            }
            else if(maxProfit >= profit_min || maxProfit >= profit_tmpmin){
                min = tmpmin < min? tmpmin: min;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        BestTimetoBuyandSellStock bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
        int[] a= {2,2,5};
        System.out.print(bestTimetoBuyandSellStock.maxProfit(a));
    }
}
