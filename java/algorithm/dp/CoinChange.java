package algorithm.dp;

import java.util.Arrays;

/**
 * @author roseduan
 * @description 零钱兑换
 */
public class CoinChange {
    
    /**
     * 回溯的方法，列举有所的可能，并求得最小值
     * 执行会超时
     */
    public int coinChange1(int[] coins, int amount) {
        helper(coins, 0, amount);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private int min = Integer.MAX_VALUE;

    private void helper(int[] coins, int count, int amount) {
        if (amount <= 0) {
            if (amount == 0 && count < min) {
                min = count;
            }
            return;
        }

        for (int n : coins) {
            helper(coins, count + 1, amount - n);
        }
    }

    /**
     * 动态规划的方式
     */
    public int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int n : coins) {
                if (i >= n) {
                    dp[i] = Math.min(dp[i], dp[i - n] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
