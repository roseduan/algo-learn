package algorithm.greedyAlgo;

/**
 * @author roseduan
 * @time 2019/7/14 9:34
 * @description 买卖股票的最佳时机
 * leetcode第121题：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    /**
     * 暴力查找
     */
    private static int maxProfit1(int[] prices) {
        int length = prices.length;
        int res = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > res){
                    res = profit;
                }
            }
        }
        return res;
    }

    /**
     * 一次遍历
     */
    private static int maxProfit2(int[] prices){
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
            } else if (price - min > res) {
                res = price - min;
            }
        }
        return res;
    }
}
