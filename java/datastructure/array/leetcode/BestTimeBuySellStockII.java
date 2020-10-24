package datastructure.array.leetcode;

/**
 * @author roseduan
 * 买卖股票的最佳时机II
 */
public class BestTimeBuySellStockII {
    
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
