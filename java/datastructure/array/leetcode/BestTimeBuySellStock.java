package datastructure.array.leetcode;

/**
 * @author roseduan
 * 买卖股票的最佳时机I
 */
public class BestTimeBuySellStock {
    
    /**
     * 暴力法，遍历寻找最大值
     */
    public int maxProfit1(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }
    
    /**
     * 一次遍历
     */
    public int maxProfit2(int[] prices) {
        int res = 0, min = Integer.MAX_VALUE;
        for (int n : prices) {
            if (n < min) {
                min = n;
            }
            res = Math.max(res, n - min);
        }
        return res;
    }
}
